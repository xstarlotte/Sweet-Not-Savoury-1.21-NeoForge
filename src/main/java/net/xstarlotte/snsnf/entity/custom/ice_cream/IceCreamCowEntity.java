package net.xstarlotte.snsnf.entity.custom.ice_cream;

import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.gameevent.GameEvent;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.entity.client.variant.IceCreamCowVariant;
import net.xstarlotte.snsnf.item.SNSItem;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class IceCreamCowEntity extends Animal implements GeoEntity {

    private static final EntityDataAccessor<Integer> VARIANT =
            SynchedEntityData.defineId(IceCreamCowEntity.class, EntityDataSerializers.INT);

    public IceCreamCowEntity(EntityType<? extends IceCreamCowEntity> type, Level level) {
        super(type, level);
    }

    public int eggTime = this.random.nextInt(6000) + 6000;

    //animations
    @Override
    public void registerControllers(final AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }
    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if(tAnimationState.isMoving()) {
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.ice_cream_cow.run", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.ice_cream_cow.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.geoCache;
    }

    private final AnimatableInstanceCache geoCache = GeckoLibUtil.createInstanceCache(this);

//AI

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new WaterAvoidingRandomStrollGoal(this, (double)1.0F));
        this.goalSelector.addGoal(1, new PanicGoal(this, (double)1.25F));
        this.goalSelector.addGoal(1, new TemptGoal(this, 1.1, (stack) -> {
            return stack.is(SNSItem.CANDY_CANE_SUGAR);
        }, false));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1f));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.1));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 4f));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }
    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 8D)
                .add(Attributes.MOVEMENT_SPEED, (double)0.23F);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }

    public boolean canBeLeashed(Player player) {
        return true;
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(SNSItem.CANDY_CANE_SUGAR.get());
    }
    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return SNSEntity.ICE_CREAM_COW.get().create(level);
    }

    public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide && this.isAlive() && !this.isBaby() && --this.eggTime <= 0) {
            this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            this.spawnAtLocation(SNSItem.ICE_CREAM);
            this.gameEvent(GameEvent.ENTITY_PLACE);
            this.eggTime = this.random.nextInt(6000) + 6000;
        }
    }

    //data

    @Override
    public void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("EggLayTime")) {
            this.eggTime = pCompound.getInt("EggLayTime");
        }
        super.readAdditionalSaveData(pCompound);
        this.entityData.set(VARIANT, pCompound.getInt("Variant"));
    }



    @Override
    public void addAdditionalSaveData(CompoundTag pCompound) {
        pCompound.putInt("EggLayTime", this.eggTime);
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder pBuilder) {
        super.defineSynchedData(pBuilder);
        pBuilder.define(VARIANT, 0);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor pLevel, DifficultyInstance pDifficulty, MobSpawnType pReason,
                                        @Nullable SpawnGroupData pSpawnData) {
        IceCreamCowVariant variant = Util.getRandom(IceCreamCowVariant.values(), this.random);
        this.setVariant(variant);
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
    }
    //variant

    private int getTypeVariant() {
        return this.entityData.get(VARIANT);
    }
    public IceCreamCowVariant getVariant() {
        return IceCreamCowVariant.byId(this.getTypeVariant() & 255);
    }
    private void setVariant(IceCreamCowVariant variant) {
        this.entityData.set(VARIANT, variant.getId() & 255);
    }


}
