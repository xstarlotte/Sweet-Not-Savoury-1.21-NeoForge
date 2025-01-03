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