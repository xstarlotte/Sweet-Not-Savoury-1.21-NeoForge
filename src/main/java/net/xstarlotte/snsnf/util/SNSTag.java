package net.xstarlotte.snsnf.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.xstarlotte.snsnf.SNSNF;

public class SNSTag {
    public static class Blocks {

        public static final TagKey<Block> INCORRECT_FOR_HERB_TOOL = createTag("incorrect_for_herb_tool");
        public static final TagKey<Block> NEEDS_HERB_TOOL = createTag("needs_herb_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, name));
        }
    }

}
