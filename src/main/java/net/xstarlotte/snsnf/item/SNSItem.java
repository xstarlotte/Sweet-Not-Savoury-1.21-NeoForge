package net.xstarlotte.snsnf.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;

public class SNSItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SNSNF.MOD_ID);

    public static final DeferredItem<Item> CANDY_CANE_CAT_SPAWN_EGG = ITEMS.register("candy_cane_cat_spawn_egg",
            () -> new DeferredSpawnEggItem(SNSEntity.CANDY_CANE_CAT, 0xffffff, 0xf1948a,
                    new Item.Properties()));

    public static final DeferredItem<Item> CANDY_CANE =
            ITEMS.registerItem("candy_cane", Item::new, new Item.Properties().food(SNSFoodProperties.HERB));
    public static final DeferredItem<Item> CANDY_CANE_SUGAR = ITEMS.registerSimpleItem("candy_cane_sugar");
    public static final DeferredItem<Item> CANDY_CANE_SUGAR_CANE = ITEMS.register("candy_cane_sugar_cane",
            () -> new ItemNameBlockItem(SNSBlock.CANDY_CANE_SUGAR_CANE.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
