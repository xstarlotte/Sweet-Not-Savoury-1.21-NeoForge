package net.xstarlotte.snsnf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.mob_effects.SNSEffect;

public class SNSItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SNSNF.MOD_ID);

//spawn eggs
    //berry

    public static final DeferredItem<Item> BLACKBOARRY_SPAWN_EGG = ITEMS.register("blackboarry_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.BLACKBOARRY, 0x3f0e21, 0x3f0e14,
                    new Item.Properties()));
    public static final DeferredItem<Item> BLUEBOARRY_SPAWN_EGG = ITEMS.register("blueboarry_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.BLUEBOARRY, 0x3f0e21, 0x3f0e14,
                    new Item.Properties()));
    public static final DeferredItem<Item> RASPBOARRY_SPAWN_EGG = ITEMS.register("raspboarry_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.RASPBOARRY, 0x3f0e21, 0x3f0e14,
                    new Item.Properties()));
    public static final DeferredItem<Item> STRAWBOARRY_SPAWN_EGG = ITEMS.register("strawboarry_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.STRAWBOARRY, 0x3f0e21, 0x3f0e14,
                    new Item.Properties()));
    public static final DeferredItem<Item> JAMSTER_SPAWN_EGG = ITEMS.register("jamster_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.JAMSTER, 0x3f0e21, 0x3f0e14,
                    new Item.Properties()));

    //cake

    public static final DeferredItem<Item> CAKE_RABBIT_SPAWN_EGG = ITEMS.register("cake_rabbit_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CAKE_RABBIT, 0xb2b094, 0xfffee8,
                    new Item.Properties()));
    public static final DeferredItem<Item> CHEESECAKE_MOUSE_SPAWN_EGG = ITEMS.register("cheesecake_mouse_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CHEESECAKE_MOUSE, 0xb2b094, 0xfffee8,
                    new Item.Properties()));
    public static final DeferredItem<Item> SQUIRROLL_SPAWN_EGG = ITEMS.register("squirroll_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.SQUIRROLL, 0xb2b094, 0xfffee8,
                    new Item.Properties()));

    //fruit

    public static final DeferredItem<Item> BUNANA_SPAWN_EGG = ITEMS.register("bunana_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.BUNANA, 0xb34115, 0xb37515,
                    new Item.Properties()));

    public static final DeferredItem<Item> DUCKANA_SPAWN_EGG = ITEMS.register("duckana_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.DUCKANA, 0xb34115, 0xb37515,
                    new Item.Properties()));

    public static final DeferredItem<Item> FRUIT_ELF_SPAWN_EGG = ITEMS.register("fruit_elf_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.FRUIT_ELF, 0xb34115, 0xb37515,
                    new Item.Properties()));
    public static final DeferredItem<Item> FRUIT_PUG_SPAWN_EGG = ITEMS.register("fruit_pug_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.FRUIT_PUG, 0xb34115, 0xb37515,
                    new Item.Properties()));

    public static final DeferredItem<Item> HAPPLE_SPAWN_EGG = ITEMS.register("happle_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.HAPPLE, 0xb34115, 0xb37515,
                    new Item.Properties()));

    public static final DeferredItem<Item> SNAPPLE_SPAWN_EGG = ITEMS.register("snapple_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.SNAPPLE, 0xb34115, 0xb37515,
                    new Item.Properties()));

    //herb

    public static final DeferredItem<Item> CANDY_CANE_CAT_SPAWN_EGG = ITEMS.register("candy_cane_cat_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_CAT, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_CROOK_SPAWN_EGG = ITEMS.register("candy_cane_crook_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_CROOK, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_FLY_SPAWN_EGG = ITEMS.register("candy_cane_fly_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_FLY, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_TIGER_SPAWN_EGG = ITEMS.register("candy_cane_tiger_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_TIGER, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CINNABUN_SPAWN_EGG = ITEMS.register("cinnabun_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CINNABUN, 0xffffff, 0xf1948a,
                    new Item.Properties()));

    public static final DeferredItem<Item> GINGERBREAD_MAN_SPAWN_EGG = ITEMS.register("gingerbread_man_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.GINGERBREAD_MAN, 0xffffff, 0xf1948a,
                    new Item.Properties()));

    public static final DeferredItem<Item> HUMBUG_SPAWN_EGG = ITEMS.register("humbug_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.HUMBUG, 0x82602a, 0xffffff,
                    new Item.Properties()));
    public static final DeferredItem<Item> HUMPUG_SPAWN_EGG = ITEMS.register("humpug_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.HUMPUG, 0x82602a, 0xffffff,
                    new Item.Properties()));

    public static final DeferredItem<Item> MINTMUNK_SPAWN_EGG = ITEMS.register("mintmunk_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.MINTMUNK, 0x1aa578, 0x4bc49d,
                    new Item.Properties()));
    public static final DeferredItem<Item> MINT_IMPERIAL_SPAWN_EGG = ITEMS.register("mint_imperial_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.MINT_IMPERIAL, 0x1aa578, 0x4bc49d,
                    new Item.Properties()));
    public static final DeferredItem<Item> MINT_MARSHMALLOW_SHEEP_SPAWN_EGG = ITEMS.register("mint_marshmallow_sheep_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.MINT_MARSHMALLOW_SHEEP, 0x1aa578, 0x4bc49d,
                    new Item.Properties()));

    public static final DeferredItem<Item> PEPPERMINT_CHURL_SPAWN_EGG = ITEMS.register("peppermint_churl_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.PEPPERMINT_CHURL, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> PEPPERMINT_TWIRL_SPAWN_EGG = ITEMS.register("peppermint_twirl_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.PEPPERMINT_TWIRL, 0xffffff, 0xf1948a,
                    new Item.Properties()));

    //ice_cream

    public static final DeferredItem<Item> ICE_CREAM_COW_SPAWN_EGG = ITEMS.register("ice_cream_cow_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.ICE_CREAM_COW, 0xfcf7f0, 0xfbe2bc,
                    new Item.Properties()));

    public static final DeferredItem<Item> PARFAIT_PIXIE_SPAWN_EGG = ITEMS.register("parfait_pixie_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.PARFAIT_PIXIE, 0xfcf7f0, 0xfbe2bc,
                    new Item.Properties()));

    public static final DeferredItem<Item> WAFER_WITCH_SPAWN_EGG = ITEMS.register("wafer_witch_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.WAFER_WITCH, 0xfcf7f0, 0xfbe2bc,
                    new Item.Properties()));

    //sweet

    public static final DeferredItem<Item> BONBONBINI_SPAWN_EGG = ITEMS.register("bonbonbini_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.BONBONBINI, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));

    public static final DeferredItem<Item> CANDYFLOSS_LION_SPAWN_EGG = ITEMS.register("candyfloss_lion_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDYFLOSS_LION, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDYFLOSS_SHEEP_SPAWN_EGG = ITEMS.register("candyfloss_sheep_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDYFLOSS_SHEEP, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));
    public static final DeferredItem<Item> CHOCOLATE_CHICKEN_SPAWN_EGG = ITEMS.register("chocolate_chicken_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CHOCOLATE_CHICKEN, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));
    public static final DeferredItem<Item> CHOCOLATE_PENGUIN_SPAWN_EGG = ITEMS.register("chocolate_penguin_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CHOCOLATE_PENGUIN, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));

    public static final DeferredItem<Item> GUMMY_BEAR_SPAWN_EGG = ITEMS.register("gummy_bear_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.GUMMY_BEAR, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));

    public static final DeferredItem<Item> JELLY_BABY_SPAWN_EGG = ITEMS.register("jelly_baby_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.JELLY_BABY, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));

    public static final DeferredItem<Item> SUGARGLIDER_SPAWN_EGG = ITEMS.register("sugarglider_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.SUGARGLIDER, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));

    public static final DeferredItem<Item> TREAT_TOAD_SPAWN_EGG = ITEMS.register("treat_toad_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.TREAT_TOAD, 0xe6abc3, 0xd0707b,
                    new Item.Properties()));



   //items

    public static final DeferredItem<Item> BLACKBERRY_LOLLIPOP =
            ITEMS.registerItem("blackberry_lollipop", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> BLUEBERRY_LOLLIPOP =
            ITEMS.registerItem("blueberry_lollipop", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> RASPBERRY_LOLLIPOP =
            ITEMS.registerItem("raspberry_lollipop", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> STRAWBERRY_LOLLIPOP =
            ITEMS.registerItem("strawberry_lollipop", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));

    public static final DeferredItem<Item> CANDYFLOSS =
            ITEMS.registerItem("candyfloss", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> CANDYFLOSS_BLUE_RASPBERRY =
            ITEMS.registerItem("candyfloss_blue_raspberry", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> CANDY_CANE =
            ITEMS.registerItem("candy_cane", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CANDY_CANE_SUGAR = ITEMS.registerSimpleItem("candy_cane_sugar");
    public static final DeferredItem<Item> CANDY_CANE_SUGAR_CANE = ITEMS.register("candy_cane_sugar_cane",
            () -> new ItemNameBlockItem(SNSBlock.CANDY_CANE_SUGAR_CANE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword",
            () -> new HerbEffectSwordItem(SNSToolTiers.HERB, new Item.Properties().attributes(SwordItem.createAttributes(SNSToolTiers.HERB, 4, -2.4f)), SNSEffect.HERB_EFFECT));
    public static final DeferredItem<Item> CHOCOLATE_EGG =
            ITEMS.registerItem("chocolate_egg", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> CHOCOLATE_WHITE_EGG =
            ITEMS.registerItem("chocolate_white_egg", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> CINNAMON =
            ITEMS.registerItem("cinnamon", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CINNAMON_BUN =
            ITEMS.registerItem("cinnamon_bun", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CONE =
            ITEMS.registerItem("cone", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> GELATIN =
            ITEMS.registerItem("gelatin", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_APPLE =
            ITEMS.registerItem("gummy_apple", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_BANANA =
            ITEMS.registerItem("gummy_banana", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_BLACKBERRY =
            ITEMS.registerItem("gummy_blackberry", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_BLUEBERRY =
            ITEMS.registerItem("gummy_blueberry", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_RASPBERRY =
            ITEMS.registerItem("gummy_raspberry", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));
    public static final DeferredItem<Item> GUMMY_STRAWBERRY =
            ITEMS.registerItem("gummy_strawberry", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));

    public static final DeferredItem<Item> HUMBUG =
            ITEMS.registerItem("humbug", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> ICE_CREAM =
            ITEMS.registerItem("ice_cream", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET_II));
    public static final DeferredItem<Item> VANILLA_ICE_CREAM =
            ITEMS.registerItem("vanilla_ice_cream", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));

    public static final DeferredItem<Item> MINT_MARSHMALLOW =
            ITEMS.registerItem("mint_marshmallow", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> PEPPERMINT_SWIRL =
            ITEMS.registerItem("peppermint_swirl", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> POLO =
            ITEMS.registerItem("polo", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> WAFFLE_STICK =
            ITEMS.registerItem("waffle_stick", Item::new, new Item.Properties().food(SNSFoodProperties.SWEET));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
