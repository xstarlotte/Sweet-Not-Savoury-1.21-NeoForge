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
    public static final DeferredItem<Item> CANDY_CANE_CAT_SPAWN_EGG = ITEMS.register("candy_cane_cat_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_CAT, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_CROOK_SPAWN_EGG = ITEMS.register("candy_cane_crook_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_CROOK, 0xffffff, 0xf1948a,
                    new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_FLY_SPAWN_EGG = ITEMS.register("candy_cane_fly_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_FLY, 0xffffff, 0xf1948a,
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

   //items

    public static final DeferredItem<Item> CANDY_CANE =
            ITEMS.registerItem("candy_cane", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CANDY_CANE_SUGAR = ITEMS.registerSimpleItem("candy_cane_sugar");
    public static final DeferredItem<Item> CANDY_CANE_SUGAR_CANE = ITEMS.register("candy_cane_sugar_cane",
            () -> new ItemNameBlockItem(SNSBlock.CANDY_CANE_SUGAR_CANE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword",
            () -> new HerbEffectSwordItem(SNSToolTiers.HERB, new Item.Properties().attributes(SwordItem.createAttributes(SNSToolTiers.HERB, 4, -2.4f)), SNSEffect.HERB_EFFECT));

    public static final DeferredItem<Item> HUMBUG =
            ITEMS.registerItem("humbug", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> HUMBUG =
            ITEMS.registerItem("humbug", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> MINT_MARSHMALLOW =
            ITEMS.registerItem("mint_marshmallow", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static final DeferredItem<Item> PEPPERMINT_SWIRL =
            ITEMS.registerItem("peppermint_swirl", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> POLO =
            ITEMS.registerItem("polo", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
