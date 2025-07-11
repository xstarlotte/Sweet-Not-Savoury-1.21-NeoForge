package net.xstarlotte.snsnf.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.custom.berry.*;
import net.xstarlotte.snsnf.entity.custom.cake.*;
import net.xstarlotte.snsnf.entity.custom.fruit.*;
import net.xstarlotte.snsnf.entity.custom.herb.*;
import net.xstarlotte.snsnf.entity.custom.ice_cream.*;
import net.xstarlotte.snsnf.entity.custom.sweet.*;

import java.util.function.Supplier;

public class SNSEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SNSNF.MOD_ID);

    //berry

    public static final Supplier<EntityType<BlackboarryEntity>> BLACKBOARRY =
            ENTITY_TYPES.register("blackboarry", () -> EntityType.Builder.of(BlackboarryEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("blackboarry"));
    public static final Supplier<EntityType<BlueboarryEntity>> BLUEBOARRY =
            ENTITY_TYPES.register("blueboarry", () -> EntityType.Builder.of(BlueboarryEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("blackboarry"));
    public static final Supplier<EntityType<RaspboarryEntity>> RASPBOARRY =
            ENTITY_TYPES.register("raspboarry", () -> EntityType.Builder.of(RaspboarryEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("raspboarry"));
    public static final Supplier<EntityType<StrawboarryEntity>> STRAWBOARRY =
            ENTITY_TYPES.register("strawboarry", () -> EntityType.Builder.of(StrawboarryEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("strawboarry"));
    public static final Supplier<EntityType<JamsterEntity>> JAMSTER =
            ENTITY_TYPES.register("jamster", () -> EntityType.Builder.of(JamsterEntity::new, MobCategory.CREATURE)
                    .sized(0.2f, 0.2f).build("jamster"));

    //cake

    public static final Supplier<EntityType<CakeRabbitEntity>> CAKE_RABBIT =
            ENTITY_TYPES.register("cake_rabbit", () -> EntityType.Builder.of(CakeRabbitEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("cake_rabbit"));

    public static final Supplier<EntityType<CheesecakeMouseEntity>> CHEESECAKE_MOUSE =
            ENTITY_TYPES.register("cheesecake_mouse", () -> EntityType.Builder.of(CheesecakeMouseEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.4f).build("cheesecake_mouse"));

    public static final Supplier<EntityType<SquirrollEntity>> SQUIRROLL =
            ENTITY_TYPES.register("squirroll", () -> EntityType.Builder.of(SquirrollEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.4f).build("squirroll"));

    //fruit

    public static final Supplier<EntityType<BunanaEntity>> BUNANA =
            ENTITY_TYPES.register("bunana", () -> EntityType.Builder.of(BunanaEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("bunana"));

    public static final Supplier<EntityType<DuckanaEntity>> DUCKANA =
            ENTITY_TYPES.register("duckana", () -> EntityType.Builder.of(DuckanaEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("duckana"));

    public static final Supplier<EntityType<FruitElfEntity>> FRUIT_ELF =
            ENTITY_TYPES.register("fruit_elf", () -> EntityType.Builder.of(FruitElfEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("fruit_elf"));

    public static final Supplier<EntityType<FruitPugEntity>> FRUIT_PUG =
            ENTITY_TYPES.register("fruit_pug", () -> EntityType.Builder.of(FruitPugEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("fruit_pug"));

    public static final Supplier<EntityType<HappleEntity>> HAPPLE =
            ENTITY_TYPES.register("happle", () -> EntityType.Builder.of(HappleEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("happle"));

    public static final Supplier<EntityType<SnappleEntity>> SNAPPLE =
            ENTITY_TYPES.register("snapple", () -> EntityType.Builder.of(SnappleEntity::new, MobCategory.CREATURE)
                    .sized(1.5f, 1f).build("snapple"));

    //herb

    public static final Supplier<EntityType<CandyCaneCatEntity>> CANDY_CANE_CAT =
            ENTITY_TYPES.register("candy_cane_cat", () -> EntityType.Builder.of(CandyCaneCatEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("candy_cane_cat"));
    public static final Supplier<EntityType<CandyCaneCrookEntity>> CANDY_CANE_CROOK =
            ENTITY_TYPES.register("candy_cane_crook", () -> EntityType.Builder.of(CandyCaneCrookEntity::new, MobCategory.MONSTER)
                    .sized(1f, 0.64f).build("candy_cane_crook"));
    public static final Supplier<EntityType<CandyCaneFlyEntity>> CANDY_CANE_FLY =
            ENTITY_TYPES.register("candy_cane_fly", () -> EntityType.Builder.of(CandyCaneFlyEntity::new, MobCategory.AMBIENT)
                    .sized(0.5f, 0.5f).build("candy_cane_fly"));
    public static final Supplier<EntityType<CandyCaneTigerEntity>> CANDY_CANE_TIGER =
            ENTITY_TYPES.register("candy_cane_tiger", () -> EntityType.Builder.of(CandyCaneTigerEntity::new, MobCategory.CREATURE)
                    .sized(2f, 2f).build("candy_cane_tiger"));
    public static final Supplier<EntityType<CinnabunEntity>> CINNABUN =
            ENTITY_TYPES.register("cinnabun", () -> EntityType.Builder.of(CinnabunEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("cinnabun"));

    public static final Supplier<EntityType<GingerbreadManEntity>> GINGERBREAD_MAN =
            ENTITY_TYPES.register("gingerbread_man", () -> EntityType.Builder.of(GingerbreadManEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("gingerbread_man"));

    public static final Supplier<EntityType<HumbugEntity>> HUMBUG =
            ENTITY_TYPES.register("humbug", () -> EntityType.Builder.of(HumbugEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("humbug"));
    public static final Supplier<EntityType<HumpugEntity>> HUMPUG =
            ENTITY_TYPES.register("humpug", () -> EntityType.Builder.of(HumpugEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("humpug"));

    public static final Supplier<EntityType<MintmunkEntity>> MINTMUNK =
            ENTITY_TYPES.register("mintmunk", () -> EntityType.Builder.of(MintmunkEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("mintmunk"));
    public static final Supplier<EntityType<MintImperialEntity>> MINT_IMPERIAL =
            ENTITY_TYPES.register("mint_imperial", () -> EntityType.Builder.of(MintImperialEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("mint_imperial"));
    public static final Supplier<EntityType<MintMarshmallowSheepEntity>> MINT_MARSHMALLOW_SHEEP =
            ENTITY_TYPES.register("mint_marshmallow_sheep", () -> EntityType.Builder.of(MintMarshmallowSheepEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.6f).build("mint_marshmallow_sheep"));

    public static final Supplier<EntityType<PeppermintChurlEntity>> PEPPERMINT_CHURL =
            ENTITY_TYPES.register("peppermint_churl", () -> EntityType.Builder.of(PeppermintChurlEntity::new, MobCategory.MONSTER)
                    .sized(1f, 1f).build("peppermint_churl"));
    public static final Supplier<EntityType<PeppermintTwirlEntity>> PEPPERMINT_TWIRL =
            ENTITY_TYPES.register("peppermint_twirl", () -> EntityType.Builder.of(PeppermintTwirlEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("peppermint_twirl"));

    //ice_cream

    public static final Supplier<EntityType<IceCreamCowEntity>> ICE_CREAM_COW =
            ENTITY_TYPES.register("ice_cream_cow", () -> EntityType.Builder.of(IceCreamCowEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("ice_cream_cow"));

    public static final Supplier<EntityType<ParfaitPixieEntity>> PARFAIT_PIXIE =
            ENTITY_TYPES.register("parfait_pixie", () -> EntityType.Builder.of(ParfaitPixieEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("parfait_pixie"));

    public static final Supplier<EntityType<WaferWitchEntity>> WAFER_WITCH =
            ENTITY_TYPES.register("wafer_witch", () -> EntityType.Builder.of(WaferWitchEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("wafer_witch"));

    //sweet

    public static final Supplier<EntityType<BonbonbiniEntity>> BONBONBINI =
            ENTITY_TYPES.register("bonbonbini", () -> EntityType.Builder.of(BonbonbiniEntity::new, MobCategory.CREATURE)
                    .sized(0.3f, 0.3f).build("bonbonbini"));

    public static final Supplier<EntityType<CandyflossLionEntity>> CANDYFLOSS_LION =
            ENTITY_TYPES.register("candyfloss_lion", () -> EntityType.Builder.of(CandyflossLionEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("candyfloss_lion"));

    public static final Supplier<EntityType<CandyflossSheepEntity>> CANDYFLOSS_SHEEP =
            ENTITY_TYPES.register("candyfloss_sheep", () -> EntityType.Builder.of(CandyflossSheepEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("candyfloss_sheep"));

    public static final Supplier<EntityType<ChocolateChickenEntity>> CHOCOLATE_CHICKEN =
            ENTITY_TYPES.register("chocolate_chicken", () -> EntityType.Builder.of(ChocolateChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("chocolate_chicken"));

    public static final Supplier<EntityType<ChocolatePenguinEntity>> CHOCOLATE_PENGUIN =
            ENTITY_TYPES.register("chocolate_penguin", () -> EntityType.Builder.of(ChocolatePenguinEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("chocolate_penguin"));

    public static final Supplier<EntityType<GummyBearEntity>> GUMMY_BEAR =
            ENTITY_TYPES.register("gummy_bear", () -> EntityType.Builder.of(GummyBearEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("gummy_bear"));

    public static final Supplier<EntityType<JellyBabyEntity>> JELLY_BABY =
            ENTITY_TYPES.register("jelly_baby", () -> EntityType.Builder.of(JellyBabyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("jelly_baby"));

    public static final Supplier<EntityType<SugargliderEntity>> SUGARGLIDER =
            ENTITY_TYPES.register("sugarglider", () -> EntityType.Builder.of(SugargliderEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("sugarglider"));

    public static final Supplier<EntityType<TreatToadEntity>> TREAT_TOAD =
            ENTITY_TYPES.register("treat_toad", () -> EntityType.Builder.of(TreatToadEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.5f).build("treat_toad"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}