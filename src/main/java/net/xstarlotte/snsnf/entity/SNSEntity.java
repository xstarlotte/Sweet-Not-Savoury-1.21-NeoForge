package net.xstarlotte.snsnf.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneflyEntity;

import java.util.function.Supplier;

public class SNSEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SNSNF.MOD_ID);

    public static final Supplier<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(0.64f, 0.64f).build("candy_cane_cat"));
    public static final Supplier<EntityType<CandyCaneflyEntity>> CANDYCANEFLY =
            ENTITY_TYPES.register("candycanefly", () -> EntityType.Builder.of(CandyCaneflyEntity::new, MobCategory.CREATURE)
                    .sized(0.64f, 0.64f).build("candycanefly"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}