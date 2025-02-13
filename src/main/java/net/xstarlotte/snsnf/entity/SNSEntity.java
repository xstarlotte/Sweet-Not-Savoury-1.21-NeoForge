package net.xstarlotte.snsnf.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCrookEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneFlyEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintMarshmallowSheepEntity;

import java.util.function.Supplier;

public class SNSEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SNSNF.MOD_ID);

    public static final Supplier<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(0.64f, 0.64f).build("candy_cane_cat"));
    public static final Supplier<EntityType<CandyCaneCrookEntity>> CANDY_CANE_CROOK =
            ENTITY_TYPES.register("candy_cane_crook", () -> EntityType.Builder.of(CandyCaneCrookEntity::new, MobCategory.MONSTER)
                    .sized(0.64f, 0.64f).build("candy_cane_crook"));
    public static final Supplier<EntityType<CandyCaneFlyEntity>> CANDY_CANE_FLY =
            ENTITY_TYPES.register("candy_cane_fly", () -> EntityType.Builder.of(CandyCaneFlyEntity::new, MobCategory.AMBIENT)
                    .sized(0.64f, 0.64f).build("candy_cane_fly"));

    public static final Supplier<EntityType<MintMarshmallowSheepEntity>> MINT_MARSHMALLOW_SHEEP =
            ENTITY_TYPES.register("mint_marshmallow_sheep", () -> EntityType.Builder.of(MintMarshmallowSheepEntity::new, MobCategory.CREATURE)
                    .sized(0.64f, 0.64f).build("mint_marshmallow_sheep"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}