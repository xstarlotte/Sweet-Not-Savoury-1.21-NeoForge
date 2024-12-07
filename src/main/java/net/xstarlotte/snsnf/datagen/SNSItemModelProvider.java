package net.xstarlotte.snsnf.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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
        basicItem(SNSItem.CANDY_CANE.get());
        basicItem(SNSItem.CANDY_CANE_SUGAR.get());


        buttonItem(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON, SNSBlock.CANDY_CANE_COBBLESTONE);
        basicItem(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.asItem());
        wallItem(SNSBlock.CANDY_CANE_COBBLESTONE_WALL, SNSBlock.CANDY_CANE_COBBLESTONE);
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
    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
