package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.item.SNSItem;

public class SNSItemModelProvider extends ItemModelProvider {
    public SNSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SNSNF.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

        //spawn eggs

        withExistingParent(SNSItem.CANDY_CANE_CAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDY_CANE_CROOK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDY_CANE_FLY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.HUMBUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.HUMPUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.MINTMUNK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.MINT_IMPERIAL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.MINT_MARSHMALLOW_SHEEP_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.PEPPERMINT_CHURL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //items

        basicItem(SNSItem.CANDY_CANE.get());
        basicItem(SNSItem.CANDY_CANE_SUGAR.get());
        handheldItem(SNSItem.CANDY_CANE_SWORD);

        basicItem(SNSItem.HUMBUG.get());

        basicItem(SNSItem.MINT_MARSHMALLOW.get());

        basicItem(SNSItem.PEPPERMINT_SWIRL.get());
        basicItem(SNSItem.POLO.get());

       //block items

        buttonItem(SNSBlock.CANDY_CANE_BRICK_BUTTON, SNSBlock.CANDY_CANE_BRICK);
        basicItem(SNSBlock.CANDY_CANE_BRICK_DOOR.asItem());
        wallItem(SNSBlock.CANDY_CANE_BRICK_WALL, SNSBlock.CANDY_CANE_BRICK);
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

        buttonItem(SNSBlock.HUMBUG_BRICK_BUTTON, SNSBlock.HUMBUG_BRICK);
        basicItem(SNSBlock.HUMBUG_BRICK_DOOR.asItem());
        wallItem(SNSBlock.HUMBUG_BRICK_WALL, SNSBlock.HUMBUG_BRICK);
        buttonItem(SNSBlock.HUMBUG_COBBLESTONE_BUTTON, SNSBlock.HUMBUG_COBBLESTONE);
        basicItem(SNSBlock.HUMBUG_COBBLESTONE_DOOR.asItem());
        wallItem(SNSBlock.HUMBUG_COBBLESTONE_WALL, SNSBlock.HUMBUG_COBBLESTONE);

        buttonItem(SNSBlock.MINT_BLOCK_BUTTON, SNSBlock.MINT_BLOCK);
        basicItem(SNSBlock.MINT_BLOCK_DOOR.asItem());
        wallItem(SNSBlock.MINT_BLOCK_WALL, SNSBlock.MINT_BLOCK);
        buttonItem(SNSBlock.MINT_BRICK_BUTTON, SNSBlock.MINT_BRICK);
        basicItem(SNSBlock.MINT_BRICK_DOOR.asItem());
        wallItem(SNSBlock.MINT_BRICK_WALL, SNSBlock.MINT_BRICK);

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

    private ItemModelBuilder handheldItem(DeferredItem<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
