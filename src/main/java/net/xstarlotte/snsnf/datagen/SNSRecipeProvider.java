package net.xstarlotte.snsnf.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.block.SNSBlock;
import net.xstarlotte.snsnf.item.SNSItem;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SNSRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public SNSRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }
    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {

        List<ItemLike> HERB_SMELTABLES = List.of(SNSBlock.PEPPERMINT_SWIRL_STONE_COAL_ORE.get());

        oreSmelting(pRecipeOutput, HERB_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 200, "coal");
        oreBlasting(pRecipeOutput, HERB_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.25f, 100, "coal");

        //items

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItem.CANDY_CANE.get(), 2)
                .pattern("CCC")
                .pattern("C C")
                .pattern("C  ")
                .define('C', SNSItem.CANDY_CANE_SUGAR.get())
                .unlockedBy("has_candy_cane_sugar", has(SNSItem.CANDY_CANE_SUGAR.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItem.CANDY_CANE_SUGAR.get(), 1)
                .pattern("C")
                .define('C', SNSItem.CANDY_CANE_SUGAR_CANE.get())
                .unlockedBy("has_candy_cane_sugar_cane", has(SNSItem.CANDY_CANE_SUGAR_CANE.get())).save(pRecipeOutput);

        //blocks

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.BLACKBERRY_LANTERN.get(), 1)
                .pattern("BT")
                .define('B', SNSItem.GUMMY_BLACKBERRY.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_gummy_blackberry", has(SNSItem.GUMMY_BLACKBERRY.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.BLUEBERRY_LANTERN.get(), 1)
                .pattern("BT")
                .define('B', SNSItem.GUMMY_BLUEBERRY.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_gummy_blueberry", has(SNSItem.GUMMY_BLUEBERRY.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.RASPBERRY_LANTERN.get(), 1)
                .pattern("RT")
                .define('R', SNSItem.GUMMY_RASPBERRY.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_gummy_raspberry", has(SNSItem.GUMMY_RASPBERRY.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.STRAWBERRY_LANTERN.get(), 1)
                .pattern("ST")
                .define('S', SNSItem.GUMMY_STRAWBERRY.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_gummy_strawberry", has(SNSItem.GUMMY_STRAWBERRY.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CANDYFLOSS_BLOCK.get(), 16)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSItem.CANDYFLOSS.get())
                .unlockedBy("has_candyfloss", has(SNSItem.CANDYFLOSS.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CANDYFLOSS_BUTTON.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CANDYFLOSS_DOOR.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.CANDYFLOSS_FENCE.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.CANDYFLOSS_FENCE_GATE.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CANDYFLOSS_PRESSURE_PLATE.get(), SNSBlock.CANDYFLOSS_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDYFLOSS_SLAB.get(), SNSBlock.CANDYFLOSS_BLOCK.get());
        stairBuilder(SNSBlock.CANDYFLOSS_STAIRS.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CANDYFLOSS_TRAPDOOR.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLOCK.get())).group("candyfloss")
                .unlockedBy("has_candyfloss_block", has(SNSBlock.CANDYFLOSS_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDYFLOSS_WALL.get(), SNSBlock.CANDYFLOSS_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get(), 16)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSItem.CANDYFLOSS_BLUE_RASPBERRY.get())
                .unlockedBy("has_candyfloss_blue_raspberry", has(SNSItem.CANDYFLOSS_BLUE_RASPBERRY.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BUTTON.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_DOOR.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_FENCE_GATE.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_PRESSURE_PLATE.get(), SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_SLAB.get(), SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get());
        stairBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_STAIRS.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_TRAPDOOR.get(), Ingredient.of(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).group("candyfloss_blue_raspberry")
                .unlockedBy("has_candyfloss_blue_raspberry_block", has(SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_WALL.get(), SNSBlock.CANDYFLOSS_BLUE_RASPBERRY_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CANDY_CANE_LANTERN.get(), 1)
                .pattern("CT")
                .define('C', SNSItem.CANDY_CANE.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_candy_cane", has(SNSItem.CANDY_CANE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CANDY_CANE_PLANKS.get(), 4)
                .pattern("C")
                .define('C', SNSBlock.CANDY_CANE_LOG.get())
                .unlockedBy("has_candy_cane_log", has(SNSBlock.CANDY_CANE_LOG.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CANDY_CANE_PLANK_BUTTON.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CANDY_CANE_PLANK_DOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.CANDY_CANE_PLANK_FENCE.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.CANDY_CANE_PLANK_FENCE_GATE.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CANDY_CANE_PLANK_PRESSURE_PLATE.get(), SNSBlock.CANDY_CANE_PLANKS.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_PLANK_SLAB.get(), SNSBlock.CANDY_CANE_PLANKS.get());
        stairBuilder(SNSBlock.CANDY_CANE_PLANK_STAIRS.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CANDY_CANE_PLANK_TRAPDOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_PLANKS.get())).group("candy_cane_planks")
                .unlockedBy("has_candy_cane_planks", has(SNSBlock.CANDY_CANE_PLANKS.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_PLANK_WALL.get(), SNSBlock.CANDY_CANE_PLANKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CHOCOLATE_BRICKS.get(), 16)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSItem.CHOCOLATE_EGG.get())
                .unlockedBy("has_chocolate_egg", has(SNSItem.CHOCOLATE_EGG.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CHOCOLATE_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CHOCOLATE_BRICK_DOOR.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.CHOCOLATE_BRICK_FENCE.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.CHOCOLATE_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CHOCOLATE_BRICK_PRESSURE_PLATE.get(), SNSBlock.CHOCOLATE_BRICKS.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CHOCOLATE_BRICK_SLAB.get(), SNSBlock.CHOCOLATE_BRICKS.get());
        stairBuilder(SNSBlock.CHOCOLATE_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CHOCOLATE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.CHOCOLATE_BRICKS.get())).group("chocolate_brick")
                .unlockedBy("has_chocolate_bricks", has(SNSBlock.CHOCOLATE_BRICKS.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CHOCOLATE_BRICK_WALL.get(), SNSBlock.CHOCOLATE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CHOCOLATE_WHITE_BRICKS.get(), 16)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSItem.CHOCOLATE_WHITE_EGG.get())
                .unlockedBy("has_chocolate_white_egg", has(SNSItem.CHOCOLATE_WHITE_EGG.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_DOOR.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CHOCOLATE_WHITE_BRICK_PRESSURE_PLATE.get(), SNSBlock.CHOCOLATE_WHITE_BRICKS.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CHOCOLATE_WHITE_BRICK_SLAB.get(), SNSBlock.CHOCOLATE_WHITE_BRICKS.get());
        stairBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CHOCOLATE_WHITE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).group("chocolate_white_brick")
                .unlockedBy("has_chocolate_white_bricks", has(SNSBlock.CHOCOLATE_WHITE_BRICKS.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CHOCOLATE_WHITE_BRICK_WALL.get(), SNSBlock.CHOCOLATE_WHITE_BRICKS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_APPLE_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_APPLE.get())
                .unlockedBy("has_gummy_apple", has(SNSItem.GUMMY_APPLE.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_APPLE_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_APPLE_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_APPLE_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_APPLE_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_APPLE_PRESSURE_PLATE.get(), SNSBlock.GUMMY_APPLE_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_APPLE_SLAB.get(), SNSBlock.GUMMY_APPLE_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_APPLE_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_APPLE_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_APPLE_BLOCK.get())).group("gummy_apple")
                .unlockedBy("has_gummy_apple_block", has(SNSBlock.GUMMY_APPLE_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_APPLE_WALL.get(), SNSBlock.GUMMY_APPLE_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_BANANA_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_BANANA.get())
                .unlockedBy("has_gummy_banana", has(SNSItem.GUMMY_BANANA.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_BANANA_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_BANANA_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_BANANA_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_BANANA_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_BANANA_PRESSURE_PLATE.get(), SNSBlock.GUMMY_BANANA_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BANANA_SLAB.get(), SNSBlock.GUMMY_BANANA_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_BANANA_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_BANANA_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_BANANA_BLOCK.get())).group("gummy_banana")
                .unlockedBy("has_gummy_banana_block", has(SNSBlock.GUMMY_BANANA_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BANANA_WALL.get(), SNSBlock.GUMMY_BANANA_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_BLACKBERRY_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_BLACKBERRY.get())
                .unlockedBy("has_gummy_blackberry", has(SNSItem.GUMMY_BLACKBERRY.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_BLACKBERRY_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_BLACKBERRY_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_BLACKBERRY_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_BLACKBERRY_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_BLACKBERRY_PRESSURE_PLATE.get(), SNSBlock.GUMMY_BLACKBERRY_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BLACKBERRY_SLAB.get(), SNSBlock.GUMMY_BLACKBERRY_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_BLACKBERRY_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_BLACKBERRY_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).group("gummy_blackberry")
                .unlockedBy("has_gummy_blackberry_block", has(SNSBlock.GUMMY_BLACKBERRY_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BLACKBERRY_WALL.get(), SNSBlock.GUMMY_BLACKBERRY_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_BLUEBERRY_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_BLUEBERRY.get())
                .unlockedBy("has_gummy_blueberry", has(SNSItem.GUMMY_BLUEBERRY.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_BLUEBERRY_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_BLUEBERRY_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_BLUEBERRY_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_BLUEBERRY_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_BLUEBERRY_PRESSURE_PLATE.get(), SNSBlock.GUMMY_BLUEBERRY_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BLUEBERRY_SLAB.get(), SNSBlock.GUMMY_BLUEBERRY_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_BLUEBERRY_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_BLUEBERRY_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).group("gummy_blueberry")
                .unlockedBy("has_gummy_blueberry_block", has(SNSBlock.GUMMY_BLUEBERRY_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_BLUEBERRY_WALL.get(), SNSBlock.GUMMY_BLUEBERRY_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_RASPBERRY_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_RASPBERRY.get())
                .unlockedBy("has_gummy_raspberry", has(SNSItem.GUMMY_RASPBERRY.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_RASPBERRY_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_RASPBERRY_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_RASPBERRY_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_RASPBERRY_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_RASPBERRY_PRESSURE_PLATE.get(), SNSBlock.GUMMY_RASPBERRY_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_RASPBERRY_SLAB.get(), SNSBlock.GUMMY_RASPBERRY_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_RASPBERRY_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_RASPBERRY_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).group("gummy_raspberry")
                .unlockedBy("has_gummy_raspberry_block", has(SNSBlock.GUMMY_RASPBERRY_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_RASPBERRY_WALL.get(), SNSBlock.GUMMY_RASPBERRY_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.GUMMY_STRAWBERRY_BLOCK.get(), 16)
                .pattern("GG")
                .pattern("GG")
                .define('G', SNSItem.GUMMY_STRAWBERRY.get())
                .unlockedBy("has_gummy_strawberry", has(SNSItem.GUMMY_STRAWBERRY.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.GUMMY_STRAWBERRY_BUTTON.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.GUMMY_STRAWBERRY_DOOR.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.GUMMY_STRAWBERRY_FENCE.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.GUMMY_STRAWBERRY_FENCE_GATE.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.GUMMY_STRAWBERRY_PRESSURE_PLATE.get(), SNSBlock.GUMMY_STRAWBERRY_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_STRAWBERRY_SLAB.get(), SNSBlock.GUMMY_STRAWBERRY_BLOCK.get());
        stairBuilder(SNSBlock.GUMMY_STRAWBERRY_STAIRS.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.GUMMY_STRAWBERRY_TRAPDOOR.get(), Ingredient.of(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).group("gummy_strawberry")
                .unlockedBy("has_gummy_strawberry_block", has(SNSBlock.GUMMY_STRAWBERRY_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.GUMMY_STRAWBERRY_WALL.get(), SNSBlock.GUMMY_STRAWBERRY_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.HUMBUG_BRICK.get(), 16)
                .pattern("HH")
                .pattern("HH")
                .define('H', SNSItem.HUMBUG.get())
                .unlockedBy("has_humbug", has(SNSItem.HUMBUG.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.HUMBUG_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.HUMBUG_BRICK.get())).group("humbug_brick")
                .unlockedBy("has_humbug_brick", has(SNSBlock.HUMBUG_BRICK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.HUMBUG_BRICK_DOOR.get(), Ingredient.of(SNSBlock.HUMBUG_BRICK.get())).group("humbug_brick")
                .unlockedBy("has_humbug_brick", has(SNSBlock.HUMBUG_BRICK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.HUMBUG_BRICK_PRESSURE_PLATE.get(), SNSBlock.HUMBUG_BRICK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.HUMBUG_BRICK_SLAB.get(), SNSBlock.HUMBUG_BRICK.get());
        stairBuilder(SNSBlock.HUMBUG_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.HUMBUG_BRICK.get())).group("humbug_brick")
                .unlockedBy("has_humbug_brick", has(SNSBlock.HUMBUG_BRICK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.HUMBUG_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.HUMBUG_BRICK.get())).group("humbug_brick")
                .unlockedBy("has_humbug_brick", has(SNSBlock.HUMBUG_BRICK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.HUMBUG_BRICK_WALL.get(), SNSBlock.HUMBUG_BRICK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItem.WAFFLE_STICK.get(), 9)
                .pattern("W")
                .define('W', SNSItem.CONE.get())
                .unlockedBy("has_cone", has(SNSItem.CONE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItem.CONE.get(), 9)
                .pattern("W")
                .define('W', SNSBlock.WAFFLE_BLOCK.get())
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSItem.VANILLA_ICE_CREAM.get(), 1)
                .pattern("I")
                .pattern("W")
                .define('I', SNSItem.ICE_CREAM.get())
                .define('W', SNSItem.CONE.get())
                .unlockedBy("has_ice_cream", has(SNSItem.ICE_CREAM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.ICE_CREAM_LANTERN.get(), 1)
                .pattern("VT")
                .define('V', SNSItem.VANILLA_ICE_CREAM.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_ice_cream", has(SNSItem.ICE_CREAM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.BLACKBERRY_LOLLIPOP_LANTERN.get(), 1)
                .pattern("BT")
                .define('B', SNSItem.BLACKBERRY_LOLLIPOP.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_blackberry_lollipop", has(SNSItem.BLACKBERRY_LOLLIPOP.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.BLUEBERRY_LOLLIPOP_LANTERN.get(), 1)
                .pattern("BT")
                .define('B', SNSItem.BLUEBERRY_LOLLIPOP.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_blueberry_lollipop", has(SNSItem.BLUEBERRY_LOLLIPOP.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.RASPBERRY_LOLLIPOP_LANTERN.get(), 1)
                .pattern("RT")
                .define('R', SNSItem.RASPBERRY_LOLLIPOP.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_raspberry_lollipop", has(SNSItem.RASPBERRY_LOLLIPOP.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.STRAWBERRY_LOLLIPOP_LANTERN.get(), 1)
                .pattern("ST")
                .define('S', SNSItem.STRAWBERRY_LOLLIPOP.get())
                .define('T', Items.TORCH)
                .unlockedBy("has_strawberry_lollipop", has(SNSItem.STRAWBERRY_LOLLIPOP.get())).save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.MINT_BRICK.get(), 4)
                .pattern("MM")
                .pattern("MM")
                .define('M', SNSBlock.MINT_BLOCK.get())
                .unlockedBy("has_mint_block", has(SNSBlock.MINT_BLOCK.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.MINT_BLOCK_BUTTON.get(), Ingredient.of(SNSBlock.MINT_BLOCK.get())).group("mint_block")
                .unlockedBy("has_mint_block", has(SNSBlock.MINT_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.MINT_BLOCK_DOOR.get(), Ingredient.of(SNSBlock.MINT_BLOCK.get())).group("mint_block")
                .unlockedBy("has_mint_block", has(SNSBlock.MINT_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.MINT_BLOCK_PRESSURE_PLATE.get(), SNSBlock.MINT_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.MINT_BLOCK_SLAB.get(), SNSBlock.MINT_BLOCK.get());
        stairBuilder(SNSBlock.MINT_BLOCK_STAIRS.get(), Ingredient.of(SNSBlock.MINT_BLOCK.get())).group("mint_block")
                .unlockedBy("has_mint_block", has(SNSBlock.MINT_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.MINT_BLOCK_TRAPDOOR.get(), Ingredient.of(SNSBlock.MINT_BLOCK.get())).group("mint_block")
                .unlockedBy("has_mint_block", has(SNSBlock.MINT_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.MINT_BLOCK_WALL.get(), SNSBlock.MINT_BLOCK.get());
        buttonBuilder(SNSBlock.MINT_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.MINT_BRICK.get())).group("mint_brick")
                .unlockedBy("has_mint_brick", has(SNSBlock.MINT_BRICK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.MINT_BRICK_DOOR.get(), Ingredient.of(SNSBlock.MINT_BRICK.get())).group("mint_brick")
                .unlockedBy("has_mint_brick", has(SNSBlock.MINT_BRICK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.MINT_BRICK_PRESSURE_PLATE.get(), SNSBlock.MINT_BRICK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.MINT_BRICK_SLAB.get(), SNSBlock.MINT_BRICK.get());
        stairBuilder(SNSBlock.MINT_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.MINT_BRICK.get())).group("mint_brick")
                .unlockedBy("has_mint_brick", has(SNSBlock.MINT_BRICK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.MINT_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.MINT_BRICK.get())).group("mint_brick")
                .unlockedBy("has_mint_brick", has(SNSBlock.MINT_BRICK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.MINT_BRICK_WALL.get(), SNSBlock.MINT_BRICK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.PEPPERMINT_SWIRL_BRICK.get(), 4)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSBlock.PEPPERMINT_SWIRL_STONE.get())
                .unlockedBy("has_peppermint_swirl_stone", has(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.PEPPERMINT_SWIRL_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).group("peppermint_swirl_brick")
                .unlockedBy("has_peppermint_swirl_brick", has(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.PEPPERMINT_SWIRL_BRICK_DOOR.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).group("peppermint_swirl_brick")
                .unlockedBy("has_peppermint_swirl_brick", has(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.PEPPERMINT_SWIRL_BRICK_PRESSURE_PLATE.get(), SNSBlock.PEPPERMINT_SWIRL_BRICK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.PEPPERMINT_SWIRL_BRICK_SLAB.get(), SNSBlock.PEPPERMINT_SWIRL_BRICK.get());
        stairBuilder(SNSBlock.PEPPERMINT_SWIRL_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).group("peppermint_swirl_brick")
                .unlockedBy("has_peppermint_swirl_brick", has(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.PEPPERMINT_SWIRL_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).group("peppermint_swirl_brick")
                .unlockedBy("has_peppermint_swirl_brick", has(SNSBlock.PEPPERMINT_SWIRL_BRICK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.PEPPERMINT_SWIRL_BRICK_WALL.get(), SNSBlock.PEPPERMINT_SWIRL_BRICK.get());
        buttonBuilder(SNSBlock.PEPPERMINT_SWIRL_STONE_BUTTON.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).group("peppermint_swirl_stone")
                .unlockedBy("has_peppermint_swirl_stone", has(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.PEPPERMINT_SWIRL_STONE_DOOR.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).group("peppermint_swirl_stone")
                .unlockedBy("has_peppermint_swirl_stone", has(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.PEPPERMINT_SWIRL_STONE_PRESSURE_PLATE.get(), SNSBlock.PEPPERMINT_SWIRL_STONE.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.PEPPERMINT_SWIRL_STONE_SLAB.get(), SNSBlock.PEPPERMINT_SWIRL_STONE.get());
        stairBuilder(SNSBlock.PEPPERMINT_SWIRL_STONE_STAIRS.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).group("peppermint_swirl_stone")
                .unlockedBy("has_peppermint_swirl_stone", has(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.PEPPERMINT_SWIRL_STONE_TRAPDOOR.get(), Ingredient.of(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).group("peppermint_swirl_stone")
                .unlockedBy("has_peppermint_swirl_stone", has(SNSBlock.PEPPERMINT_SWIRL_STONE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.PEPPERMINT_SWIRL_STONE_WALL.get(), SNSBlock.PEPPERMINT_SWIRL_STONE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.WAFFLE_BED.get(), 1)
                .pattern("MMM")
                .pattern("WWW")
                .define('W', SNSBlock.WAFFLE_BLOCK.get())
                .define('M', SNSItem.MINT_MARSHMALLOW.get())
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get()))
                .unlockedBy("has_mint_marshmallow", has(SNSItem.MINT_MARSHMALLOW.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.WAFFLE_BLOCK.get(), 16)
                .pattern("WW")
                .pattern("WW")
                .define('W', SNSItem.WAFFLE_STICK.get())
                .unlockedBy("has_waffle_stick", has(SNSItem.WAFFLE_STICK.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.WAFFLE_BUTTON.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.WAFFLE_DOOR.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.WAFFLE_FENCE.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.WAFFLE_FENCE_GATE.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.WAFFLE_PRESSURE_PLATE.get(), SNSBlock.WAFFLE_BLOCK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.WAFFLE_SLAB.get(), SNSBlock.WAFFLE_BLOCK.get());
        stairBuilder(SNSBlock.WAFFLE_STAIRS.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.WAFFLE_TRAPDOOR.get(), Ingredient.of(SNSBlock.WAFFLE_BLOCK.get())).group("waffle")
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.WAFFLE_WALL.get(), SNSBlock.WAFFLE_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.WAFFLE_BRICKS.get(), 1)
                .pattern("W")
                .define('W', SNSBlock.WAFFLE_BLOCK.get())
                .unlockedBy("has_waffle_block", has(SNSBlock.WAFFLE_BLOCK.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.WAFFLE_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.WAFFLE_BRICK_DOOR.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        fenceBuilder(SNSBlock.WAFFLE_BRICK_FENCE.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        fenceGateBuilder(SNSBlock.WAFFLE_BRICK_FENCE_GATE.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.WAFFLE_BRICK_PRESSURE_PLATE.get(), SNSBlock.WAFFLE_BRICKS.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.WAFFLE_BRICK_SLAB.get(), SNSBlock.WAFFLE_BRICKS.get());
        stairBuilder(SNSBlock.WAFFLE_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.WAFFLE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.WAFFLE_BRICKS.get())).group("waffle_brick")
                .unlockedBy("has_waffle_bricks", has(SNSBlock.WAFFLE_BRICKS.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.WAFFLE_BRICK_WALL.get(), SNSBlock.WAFFLE_BRICKS.get());


    }
    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }
    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }
    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, SNSNF.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}