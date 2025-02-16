package net.xstarlotte.snsnf.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.herb.*;

import java.util.function.Supplier;

public class SNSEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SNSNF.MOD_ID);

    public static final Supplier<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(1f, 0.64f).build("candy_cane_cat"));
    public static final Supplier<EntityType<CandyCaneCrookEntity>> CANDY_CANE_CROOK =
            ENTITY_TYPES.register("candy_cane_crook", () -> EntityType.Builder.of(CandyCaneCrookEntity::new, MobCategory.MONSTER)
                    .sized(1f, 0.64f).build("candy_cane_crook"));
    public static final Supplier<EntityType<CandyCaneFlyEntity>> CANDY_CANE_FLY =
            ENTITY_TYPES.register("candy_cane_fly", () -> EntityType.Builder.of(CandyCaneFlyEntity::new, MobCategory.AMBIENT)
                    .sized(1f, 0.64f).build("candy_cane_fly"));

    public static final Supplier<EntityType<HumbugEntity>> HUMBUG =
            ENTITY_TYPES.register("humbug", () -> EntityType.Builder.of(HumbugEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("humbug"));
    public static final Supplier<EntityType<HumpugEntity>> HUMPUG =
            ENTITY_TYPES.register("humpug", () -> EntityType.Builder.of(HumpugEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("humpug"));

    public static final Supplier<EntityType<MintmunkEntity>> MINTMUNK =
            ENTITY_TYPES.register("mintmunk", () -> EntityType.Builder.of(MintmunkEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("mintmunk"));
    public static final Supplier<EntityType<MintImperialEntity>> MINT_IMPERIAL =
            ENTITY_TYPES.register("mint_imperial", () -> EntityType.Builder.of(MintImperialEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("mint_imperial"));
    public static final Supplier<EntityType<MintMarshmallowSheepEntity>> MINT_MARSHMALLOW_SHEEP =
            ENTITY_TYPES.register("mint_marshmallow_sheep", () -> EntityType.Builder.of(MintMarshmallowSheepEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("mint_marshmallow_sheep"));

    public static final Supplier<EntityType<PeppermintChurlEntity>> PEPPERMINT_CHURL =
            ENTITY_TYPES.register("peppermint_churl", () -> EntityType.Builder.of(PeppermintChurlEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("peppermint_churl"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}