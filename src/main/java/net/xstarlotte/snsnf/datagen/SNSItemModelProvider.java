package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.entity.SNSEntity;
import net.xstarlotte.snsnf.item.SNSFoodProperties;
import net.xstarlotte.snsnf.item.SNSItem;

public class SNSItemModelProvider extends ItemModelProvider {
    public SNSItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SNSNF.MOD_ID, existingFileHelper);
    }
    @Override
    protected void registerModels() {

        //spawn eggs
        //berry

        withExistingParent(SNSItem.JAMSTER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //cake

        withExistingParent(SNSItem.CAKE_RABBIT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CHEESECAKE_MOUSE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.SQUIRROLL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //fruit
        withExistingParent(SNSItem.BUNANA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.DUCKANA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.FRUIT_ELF_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.FRUIT_PUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.HAPPLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.SNAPPLE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //herb

        withExistingParent(SNSItem.CANDY_CANE_CAT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDY_CANE_CROOK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDY_CANE_FLY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDY_CANE_TIGER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CINNABUN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.GINGERBREAD_MAN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.HUMBUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.HUMPUG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.MINTMUNK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.MINT_IMPERIAL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.MINT_MARSHMALLOW_SHEEP_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.PEPPERMINT_CHURL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.PEPPERMINT_TWIRL_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //ice_cream

        withExistingParent(SNSItem.ICE_CREAM_COW_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.PARFAIT_PIXIE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.WAFER_WITCH_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //sweet

        withExistingParent(SNSItem.BONBONBINI_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.CANDYFLOSS_LION_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CANDYFLOSS_SHEEP_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CHOCOLATE_CHICKEN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(SNSItem.CHOCOLATE_PENGUIN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.GUMMY_BEAR_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.JELLY_BABY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.SUGARGLIDER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        withExistingParent(SNSItem.TREAT_TOAD_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        //items

        basicItem(SNSItem.CANDYFLOSS.get());
        basicItem(SNSItem.CANDYFLOSS_BLUE_RASPBERRY.get());
        basicItem(SNSItem.CANDY_CANE.get());
        basicItem(SNSItem.CANDY_CANE_SUGAR.get());
        handheldItem(SNSItem.CANDY_CANE_SWORD);
        basicItem(SNSItem.CHOCOLATE_EGG.get());
        basicItem(SNSItem.CHOCOLATE_WHITE_EGG.get());
        basicItem(SNSItem.CINNAMON.get());
        basicItem(SNSItem.CINNAMON_BUN.get());
        basicItem(SNSItem.CONE.get());

        basicItem(SNSItem.GELATIN.get());
        basicItem(SNSItem.GUMMY_APPLE.get());
        basicItem(SNSItem.GUMMY_BANANA.get());
        basicItem(SNSItem.GUMMY_BLACKBERRY.get());
        basicItem(SNSItem.GUMMY_BLUEBERRY.get());
        basicItem(SNSItem.GUMMY_RASPBERRY.get());
        basicItem(SNSItem.GUMMY_STRAWBERRY.get());

        basicItem(SNSItem.HUMBUG.get());

        basicItem(SNSItem.ICE_CREAM.get());

        basicItem(SNSItem.MINT_MARSHMALLOW.get());

        basicItem(SNSItem.PEPPERMINT_SWIRL.get());
        basicItem(SNSItem.POLO.get());

        basicItem(SNSItem.WAFFLE_STICK.get());

       //block items

        buttonItem(SNSBlock.CANDYFLOSS_BUTTON, SNSBlock.CANDYFLOSS_BLOCK);
        basicItem(SNSBlock.CANDYFLOSS_DOOR.asItem());
        fenceItem(SNSBlock.CANDYFLOSS_FENCE, SNSBlock.CANDYFLOSS_BLOCK);
        wallItem(SNSBlock.CANDYFLOSS_WALL, SNSBlock.CANDYFLOSS_BLOCK);

        buttonItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BUTTON, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK);
        basicItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR.asItem());
        fenceItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK);
        wallItem(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK);

        flowerItem(SNSBlock.CANDY_CANE_BUSH);
        flowerItem(SNSBlock.CANDY_CANE_CARNATION);

        flowerItem(SNSBlock.CANDY_CANE_FLOWER);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_2);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_3);
        flowerItem(SNSBlock.CANDY_CANE_FLOWER_4);
        flowerItem(SNSBlock.CANDY_CANE_GRASS);
        flowerItem(SNSBlock.CANDY_CANE_GRASS_LONG);
        buttonItem(SNSBlock.CANDY_CANE_PLANK_BUTTON, SNSBlock.CANDY_CANE_PLANKS);
        basicItem(SNSBlock.CANDY_CANE_PLANK_DOOR.asItem());
        fenceItem(SNSBlock.CANDY_CANE_PLANK_FENCE, SNSBlock.CANDY_CANE_PLANKS);
        wallItem(SNSBlock.CANDY_CANE_PLANK_WALL, SNSBlock.CANDY_CANE_PLANKS);
        basicItem(SNSItem.CANDY_CANE_SUGAR_CANE.get());

        buttonItem(SNSBlock.CHOCOLATE_BRICK_BUTTON, SNSBlock.CHOCOLATE_BRICKS);
        basicItem(SNSBlock.CHOCOLATE_BRICK_DOOR.asItem());
        fenceItem(SNSBlock.CHOCOLATE_BRICK_FENCE, SNSBlock.CHOCOLATE_BRICKS);
        wallItem(SNSBlock.CHOCOLATE_BRICK_WALL, SNSBlock.CHOCOLATE_BRICKS);

        buttonItem(SNSBlock.CHOCOLATE_WHITE_BRICK_BUTTON, SNSBlock.CHOCOLATE_WHITE_BRICKS);
        basicItem(SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR.asItem());
        fenceItem(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE, SNSBlock.CHOCOLATE_WHITE_BRICKS);
        wallItem(SNSBlock.CHOCOLATE_WHITE_BRICK_WALL, SNSBlock.CHOCOLATE_WHITE_BRICKS);

        buttonItem(SNSBlock.HUMBUG_BRICK_BUTTON, SNSBlock.HUMBUG_BRICK);
        basicItem(SNSBlock.HUMBUG_BRICK_DOOR.asItem());
        wallItem(SNSBlock.HUMBUG_BRICK_WALL, SNSBlock.HUMBUG_BRICK);

        buttonItem(SNSBlock.GUMMY_APPLE_BUTTON, SNSBlock.GUMMY_APPLE_BLOCK);
        basicItem(SNSBlock.GUMMY_APPLE_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_APPLE_FENCE, SNSBlock.GUMMY_APPLE_BLOCK);
        wallItem(SNSBlock.GUMMY_APPLE_WALL, SNSBlock.GUMMY_APPLE_BLOCK);

        buttonItem(SNSBlock.GUMMY_BANANA_BUTTON, SNSBlock.GUMMY_BANANA_BLOCK);
        basicItem(SNSBlock.GUMMY_BANANA_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_BANANA_FENCE, SNSBlock.GUMMY_BANANA_BLOCK);
        wallItem(SNSBlock.GUMMY_BANANA_WALL, SNSBlock.GUMMY_BANANA_BLOCK);

        buttonItem(SNSBlock.GUMMY_BLACKBERRY_BUTTON, SNSBlock.GUMMY_BLACKBERRY_BLOCK);
        basicItem(SNSBlock.GUMMY_BLACKBERRY_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_BLACKBERRY_FENCE, SNSBlock.GUMMY_BLACKBERRY_BLOCK);
        wallItem(SNSBlock.GUMMY_BLACKBERRY_WALL, SNSBlock.GUMMY_BLACKBERRY_BLOCK);

        buttonItem(SNSBlock.GUMMY_BLUEBERRY_BUTTON, SNSBlock.GUMMY_BLUEBERRY_BLOCK);
        basicItem(SNSBlock.GUMMY_BLUEBERRY_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_BLUEBERRY_FENCE, SNSBlock.GUMMY_BLUEBERRY_BLOCK);
        wallItem(SNSBlock.GUMMY_BLUEBERRY_WALL, SNSBlock.GUMMY_BLUEBERRY_BLOCK);

        buttonItem(SNSBlock.GUMMY_RASPBERRY_BUTTON, SNSBlock.GUMMY_RASPBERRY_BLOCK);
        basicItem(SNSBlock.GUMMY_RASPBERRY_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_RASPBERRY_FENCE, SNSBlock.GUMMY_RASPBERRY_BLOCK);
        wallItem(SNSBlock.GUMMY_RASPBERRY_WALL, SNSBlock.GUMMY_RASPBERRY_BLOCK);

        buttonItem(SNSBlock.GUMMY_STRAWBERRY_BUTTON, SNSBlock.GUMMY_STRAWBERRY_BLOCK);
        basicItem(SNSBlock.GUMMY_STRAWBERRY_DOOR.asItem());
        fenceItem(SNSBlock.GUMMY_STRAWBERRY_FENCE, SNSBlock.GUMMY_STRAWBERRY_BLOCK);
        wallItem(SNSBlock.GUMMY_STRAWBERRY_WALL, SNSBlock.GUMMY_STRAWBERRY_BLOCK);

        buttonItem(SNSBlock.MINT_BLOCK_BUTTON, SNSBlock.MINT_BLOCK);
        basicItem(SNSBlock.MINT_BLOCK_DOOR.asItem());
        wallItem(SNSBlock.MINT_BLOCK_WALL, SNSBlock.MINT_BLOCK);
        buttonItem(SNSBlock.MINT_BRICK_BUTTON, SNSBlock.MINT_BRICK);
        basicItem(SNSBlock.MINT_BRICK_DOOR.asItem());
        wallItem(SNSBlock.MINT_BRICK_WALL, SNSBlock.MINT_BRICK);

        buttonItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON, SNSBlock.PEPPERMINT_SWIRL_BRICK);
        basicItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.asItem());
        wallItem(SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL, SNSBlock.PEPPERMINT_SWIRL_BRICK);
        buttonItem(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON, SNSBlock.PEPPERMINT_SWIRL_STONE);
        basicItem(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.asItem());
        wallItem(SNSBlock.PEPPERMINT_SWIRL_STONE_WALL, SNSBlock.PEPPERMINT_SWIRL_STONE);

        buttonItem(SNSBlock.WAFFLE_BUTTON, SNSBlock.WAFFLE_BLOCK);
        basicItem(SNSBlock.WAFFLE_DOOR.asItem());
        fenceItem(SNSBlock.WAFFLE_FENCE, SNSBlock.WAFFLE_BLOCK);
        wallItem(SNSBlock.WAFFLE_WALL, SNSBlock.WAFFLE_BLOCK);

        buttonItem(SNSBlock.WAFFLE_BRICK_BUTTON, SNSBlock.WAFFLE_BRICKS);
        basicItem(SNSBlock.WAFFLE_BRICK_DOOR.asItem());
        fenceItem(SNSBlock.WAFFLE_BRICK_FENCE, SNSBlock.WAFFLE_BRICKS);
        wallItem(SNSBlock.WAFFLE_BRICK_WALL, SNSBlock.WAFFLE_BRICKS);


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
