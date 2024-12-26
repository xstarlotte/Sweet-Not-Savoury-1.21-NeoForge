package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.item.SNSItem;

public class SNSItemModelProvider extends ItemModelProvider {
    public SNSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SNSNF.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        withExistingParent(SNSItem.CANDY_CANE_CAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        basicItem(SNSItem.CANDY_CANE.get());
        basicItem(SNSItem.CANDY_CANE_SUGAR.get());

        flowerItem(SNSBlock.CANDY_CANE_BUSH);
        flowerItem(SNSBlock.CANDY_CANE_CARNATION);
        buttonItem(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON, SNSBlock.CANDY_CANE_COBBLESTONE);
        basicItem(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.asItem());
        wallItem(SNSBlock.CANDY_CANE_COBBLESTONE_WALL, SNSBlock.CANDY_CANE_COBBLESTONE);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_2);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_3);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_4);
        flowerItem(SNSBlock.CANDY_CANE_GRASS);
        flowerItem(SNSBlock.CANDY_CANE_GRASS_LONG);
        basicItem(SNSItem.CANDY_CANE_SUGAR_CANE.get());
    }

        public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
            this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                    .texture("texture",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                            "block/" + baseBlock.getId().getPath()));
    }
    public void fenceItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
    public void flowerItem(DeferredBlock<Block> block) {
        this.withExistingParent(block.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                        "block/" + block.getId().getPath()));
    }
    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
