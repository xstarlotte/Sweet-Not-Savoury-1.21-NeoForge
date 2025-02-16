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

        List<ItemLike> HERB_SMELTABLES = List.of(SNSBlock.CANDY_CANE_COBBLESTONE_COAL_ORE.get());

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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.CANDY_CANE_BRICK.get(), 4)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSBlock.CANDY_CANE_COBBLESTONE.get())
                .unlockedBy("has_candy_cane_brick", has(SNSBlock.CANDY_CANE_BRICK.get())).save(pRecipeOutput);
        buttonBuilder(SNSBlock.CANDY_CANE_BRICK_BUTTON.get(), Ingredient.of(SNSBlock.CANDY_CANE_BRICK.get())).group("candy_cane_brick")
                .unlockedBy("has_candy_cane_brick", has(SNSBlock.CANDY_CANE_BRICK.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CANDY_CANE_BRICK_DOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_BRICK.get())).group("candy_cane_brick")
                .unlockedBy("has_candy_cane_brick", has(SNSBlock.CANDY_CANE_BRICK.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CANDY_CANE_BRICK_PRESSURE_PLATE.get(), SNSBlock.CANDY_CANE_BRICK.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_BRICK_SLAB.get(), SNSBlock.CANDY_CANE_BRICK.get());
        stairBuilder(SNSBlock.CANDY_CANE_BRICK_STAIRS.get(), Ingredient.of(SNSBlock.CANDY_CANE_BRICK.get())).group("candy_cane_brick")
                .unlockedBy("has_candy_cane_brick", has(SNSBlock.CANDY_CANE_BRICK.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CANDY_CANE_BRICK_TRAPDOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_BRICK.get())).group("candy_cane_brick")
                .unlockedBy("has_candy_cane_brick", has(SNSBlock.CANDY_CANE_BRICK.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_BRICK_WALL.get(), SNSBlock.CANDY_CANE_BRICK.get());
        buttonBuilder(SNSBlock.CANDY_CANE_COBBLESTONE_BUTTON.get(), Ingredient.of(SNSBlock.CANDY_CANE_COBBLESTONE.get())).group("candy_cane_cobblestone")
                .unlockedBy("has_candy_cane_cobblestone", has(SNSBlock.CANDY_CANE_COBBLESTONE.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.CANDY_CANE_COBBLESTONE_DOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_COBBLESTONE.get())).group("candy_cane_cobblestone")
                .unlockedBy("has_candy_cane_cobblestone", has(SNSBlock.CANDY_CANE_COBBLESTONE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.CANDY_CANE_COBBLESTONE_PRESSURE_PLATE.get(), SNSBlock.CANDY_CANE_COBBLESTONE.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_COBBLESTONE_SLAB.get(), SNSBlock.CANDY_CANE_COBBLESTONE.get());
        stairBuilder(SNSBlock.CANDY_CANE_COBBLESTONE_STAIRS.get(), Ingredient.of(SNSBlock.CANDY_CANE_COBBLESTONE.get())).group("candy_cane_cobblestone")
                .unlockedBy("has_candy_cane_cobblestone", has(SNSBlock.CANDY_CANE_COBBLESTONE.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.CANDY_CANE_COBBLESTONE_TRAPDOOR.get(), Ingredient.of(SNSBlock.CANDY_CANE_COBBLESTONE.get())).group("candy_cane_cobblestone")
                .unlockedBy("has_candy_cane_cobblestone", has(SNSBlock.CANDY_CANE_COBBLESTONE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.CANDY_CANE_COBBLESTONE_WALL.get(), SNSBlock.CANDY_CANE_COBBLESTONE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, SNSBlock.HUMBUG_BRICK.get(), 4)
                .pattern("CC")
                .pattern("CC")
                .define('C', SNSBlock.HUMBUG_COBBLESTONE.get())
                .unlockedBy("has_humbug_brick", has(SNSBlock.HUMBUG_BRICK.get())).save(pRecipeOutput);
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
        buttonBuilder(SNSBlock.HUMBUG_COBBLESTONE_BUTTON.get(), Ingredient.of(SNSBlock.HUMBUG_COBBLESTONE.get())).group("humbug_cobblestone")
                .unlockedBy("has_humbug_cobblestone", has(SNSBlock.HUMBUG_COBBLESTONE.get())).save(pRecipeOutput);
        doorBuilder(SNSBlock.HUMBUG_COBBLESTONE_DOOR.get(), Ingredient.of(SNSBlock.HUMBUG_COBBLESTONE.get())).group("humbug_cobblestone")
                .unlockedBy("has_humbug_cobblestone", has(SNSBlock.HUMBUG_COBBLESTONE.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, SNSBlock.HUMBUG_COBBLESTONE_PRESSURE_PLATE.get(), SNSBlock.HUMBUG_COBBLESTONE.get());
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.HUMBUG_COBBLESTONE_SLAB.get(), SNSBlock.HUMBUG_COBBLESTONE.get());
        stairBuilder(SNSBlock.HUMBUG_COBBLESTONE_STAIRS.get(), Ingredient.of(SNSBlock.HUMBUG_COBBLESTONE.get())).group("humbug_cobblestone")
                .unlockedBy("has_humbug_cobblestone", has(SNSBlock.HUMBUG_COBBLESTONE.get())).save(pRecipeOutput);
        trapdoorBuilder(SNSBlock.HUMBUG_COBBLESTONE_TRAPDOOR.get(), Ingredient.of(SNSBlock.HUMBUG_COBBLESTONE.get())).group("humbug_cobblestone")
                .unlockedBy("has_humbug_cobblestone", has(SNSBlock.HUMBUG_COBBLESTONE.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, SNSBlock.HUMBUG_COBBLESTONE_WALL.get(), SNSBlock.HUMBUG_COBBLESTONE.get());

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