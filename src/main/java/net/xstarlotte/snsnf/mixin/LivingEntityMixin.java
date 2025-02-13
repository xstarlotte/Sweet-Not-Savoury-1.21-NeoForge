package net.xstarlotte.snsnf.mixin;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.xstarlotte.snsnf.mob_effects.SNSEffects;
import net.xstarlotte.snsnf.util.IEntityHerbEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin implements IEntityHerbEffect {
    @Unique
    LivingEntity livingEntity = ((LivingEntity) (Object) this);

    @Unique
    UUID affectedEntityUUID;

    @Inject(method = "tick", at = @At("HEAD"))
    public void SNS$tick(CallbackInfo ci){
        if(livingEntity.level().getGameTime() % 20 == 0 && livingEntity.hasEffect(SNSEffects.HERB_EFFECT)){
            Registry<DamageType> dTypeReg = livingEntity.damageSources().damageTypes;
            Holder.Reference<DamageType> dType = dTypeReg.getHolderOrThrow(DamageTypes.MAGIC);
            livingEntity.hurt(new DamageSource(dType), 2.0F);

            if(SNS$getAffectedEntity() != null){
                Player playerA = livingEntity.level().getPlayerByUUID(SNS$getAffectedEntity());
                if(playerA != null) playerA.heal(2.0F);
            }
        }
    }

    @Override
    public UUID SNS$getAffectedEntity() {
        return affectedEntityUUID;
    }

    @Override
    public void SNS$setAffectedEntity(UUID uuid) {
        affectedEntityUUID = uuid;
    }
}
