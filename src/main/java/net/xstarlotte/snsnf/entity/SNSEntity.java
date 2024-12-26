package net.xstarlotte.snsnf.entity;

import net.minecraft.Util;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CatVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class SNSEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SNSNF.MOD_ID);

    public static final Supplier<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(0.64f, 0.64f).build("candy_cane_cat"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}