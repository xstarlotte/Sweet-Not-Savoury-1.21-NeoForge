package net.xstarlotte.snsnf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.mob_effects.SNSEffects;

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

    public static final DeferredItem<Item> MINT_IMPERIAL_SPAWN_EGG = ITEMS.register("mint_imperial_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.MINT_IMPERIAL, 0x1aa578, 0x4bc49d,
                    new Item.Properties()));
    public static final DeferredItem<Item> MINT_MARSHMALLOW_SHEEP_SPAWN_EGG = ITEMS.register("mint_marshmallow_sheep_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.MINT_MARSHMALLOW_SHEEP, 0x1aa578, 0x4bc49d,
                    new Item.Properties()));

   //items

    public static final DeferredItem<Item> CANDY_CANE =
            ITEMS.registerItem("candy_cane", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CANDY_CANE_SUGAR = ITEMS.registerSimpleItem("candy_cane_sugar");
    public static final DeferredItem<Item> CANDY_CANE_SUGAR_CANE = ITEMS.register("candy_cane_sugar_cane",
            () -> new ItemNameBlockItem(SNSBlock.CANDY_CANE_SUGAR_CANE.get(), new Item.Properties()));
    public static final DeferredItem<Item> CANDY_CANE_SWORD = ITEMS.register("candy_cane_sword",
            () -> new HerbEffectSwordItem(SNSToolTiers.HERB, new Item.Properties().attributes(SwordItem.createAttributes(SNSToolTiers.HERB, 4, -2.4f)), SNSEffects.HERB_EFFECT));

    public static final DeferredItem<Item> MINT_MARSHMALLOW =
            ITEMS.registerItem("mint_marshmallow", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
