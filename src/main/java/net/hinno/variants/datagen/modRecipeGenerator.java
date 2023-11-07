package net.hinno.variants.datagen;

import net.hinno.variants.block.modBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class modRecipeGenerator extends RecipeProvider implements IConditionBuilder {

    public modRecipeGenerator(PackOutput pOutput) {
        super (pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        //concretes
        bothSlabs (pWriter, Blocks.WHITE_CONCRETE, modBlocks.WHITE_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.WHITE_CONCRETE, modBlocks.WHITE_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.WHITE_CONCRETE, modBlocks.WHITE_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modBlocks.LIGHT_GRAY_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.GRAY_CONCRETE, modBlocks.GRAY_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.GRAY_CONCRETE, modBlocks.GRAY_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.GRAY_CONCRETE, modBlocks.GRAY_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.BLACK_CONCRETE, modBlocks.BLACK_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.BLACK_CONCRETE, modBlocks.BLACK_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.BLACK_CONCRETE, modBlocks.BLACK_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.BROWN_CONCRETE, modBlocks.BROWN_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.BROWN_CONCRETE, modBlocks.BROWN_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.BROWN_CONCRETE, modBlocks.BROWN_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.RED_CONCRETE, modBlocks.RED_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.RED_CONCRETE, modBlocks.RED_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.RED_CONCRETE, modBlocks.RED_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.ORANGE_CONCRETE, modBlocks.ORANGE_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.ORANGE_CONCRETE, modBlocks.ORANGE_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.ORANGE_CONCRETE, modBlocks.ORANGE_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.YELLOW_CONCRETE, modBlocks.YELLOW_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.YELLOW_CONCRETE, modBlocks.YELLOW_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.YELLOW_CONCRETE, modBlocks.YELLOW_CONCRETE_WALL.get (), "Concrete Stairs");

        bothSlabs (pWriter, Blocks.LIME_CONCRETE, modBlocks.LIME_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.LIME_CONCRETE, modBlocks.LIME_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.LIME_CONCRETE, modBlocks.LIME_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.GREEN_CONCRETE, modBlocks.GREEN_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.GREEN_CONCRETE, modBlocks.GREEN_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.GREEN_CONCRETE, modBlocks.GREEN_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.CYAN_CONCRETE, modBlocks.CYAN_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.CYAN_CONCRETE, modBlocks.CYAN_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.CYAN_CONCRETE, modBlocks.CYAN_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modBlocks.LIGHT_BLUE_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.BLUE_CONCRETE, modBlocks.BLUE_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.BLUE_CONCRETE, modBlocks.BLUE_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.BLUE_CONCRETE, modBlocks.BLUE_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.PURPLE_CONCRETE, modBlocks.PURPLE_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.PURPLE_CONCRETE, modBlocks.PURPLE_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.PURPLE_CONCRETE, modBlocks.PURPLE_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.MAGENTA_CONCRETE, modBlocks.MAGENTA_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.MAGENTA_CONCRETE, modBlocks.MAGENTA_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.MAGENTA_CONCRETE, modBlocks.MAGENTA_CONCRETE_WALL.get (), "Concrete Walls");

        bothSlabs (pWriter, Blocks.PINK_CONCRETE, modBlocks.PINK_CONCRETE_SLAB.get (), "Concrete Slabs");
        bothStairs (pWriter, Blocks.PINK_CONCRETE, modBlocks.PINK_CONCRETE_STAIRS.get (), "Concrete Stairs");
        bothWalls (pWriter, Blocks.PINK_CONCRETE, modBlocks.PINK_CONCRETE_WALL.get (), "Concrete Walls");

        //terracottas
        bothSlabs (pWriter, Blocks.TERRACOTTA, modBlocks.TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.TERRACOTTA, modBlocks.TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.TERRACOTTA, modBlocks.TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.WHITE_TERRACOTTA, modBlocks.WHITE_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.WHITE_TERRACOTTA, modBlocks.WHITE_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.WHITE_TERRACOTTA, modBlocks.WHITE_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.GRAY_TERRACOTTA, modBlocks.GRAY_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.GRAY_TERRACOTTA, modBlocks.GRAY_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.GRAY_TERRACOTTA, modBlocks.GRAY_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BLACK_TERRACOTTA, modBlocks.BLACK_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BLACK_TERRACOTTA, modBlocks.BLACK_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BLACK_TERRACOTTA, modBlocks.BLACK_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BROWN_TERRACOTTA, modBlocks.BROWN_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BROWN_TERRACOTTA, modBlocks.BROWN_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BROWN_TERRACOTTA, modBlocks.BROWN_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.RED_TERRACOTTA, modBlocks.RED_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.RED_TERRACOTTA, modBlocks.RED_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.RED_TERRACOTTA, modBlocks.RED_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.ORANGE_TERRACOTTA, modBlocks.ORANGE_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.ORANGE_TERRACOTTA, modBlocks.ORANGE_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.ORANGE_TERRACOTTA, modBlocks.ORANGE_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.YELLOW_TERRACOTTA, modBlocks.YELLOW_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.YELLOW_TERRACOTTA, modBlocks.YELLOW_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.YELLOW_TERRACOTTA, modBlocks.YELLOW_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIME_TERRACOTTA, modBlocks.LIME_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIME_TERRACOTTA, modBlocks.LIME_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIME_TERRACOTTA, modBlocks.LIME_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.GREEN_TERRACOTTA, modBlocks.GREEN_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.GREEN_TERRACOTTA, modBlocks.GREEN_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.GREEN_TERRACOTTA, modBlocks.GREEN_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.CYAN_TERRACOTTA, modBlocks.CYAN_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.CYAN_TERRACOTTA, modBlocks.CYAN_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.CYAN_TERRACOTTA, modBlocks.CYAN_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BLUE_TERRACOTTA, modBlocks.BLUE_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BLUE_TERRACOTTA, modBlocks.BLUE_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BLUE_TERRACOTTA, modBlocks.BLUE_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.PURPLE_TERRACOTTA, modBlocks.PURPLE_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.PURPLE_TERRACOTTA, modBlocks.PURPLE_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.PURPLE_TERRACOTTA, modBlocks.PURPLE_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.MAGENTA_TERRACOTTA, modBlocks.MAGENTA_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.MAGENTA_TERRACOTTA, modBlocks.MAGENTA_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.MAGENTA_TERRACOTTA, modBlocks.MAGENTA_TERRACOTTA_WALL.get (), "Terracotta Walls");

        bothSlabs (pWriter, Blocks.PINK_TERRACOTTA, modBlocks.PINK_TERRACOTTA_SLAB.get (), "Terracotta Slabs");
        bothStairs (pWriter, Blocks.PINK_TERRACOTTA, modBlocks.PINK_TERRACOTTA_STAIRS.get (), "Terracotta Stairs");
        bothWalls (pWriter, Blocks.PINK_TERRACOTTA, modBlocks.PINK_TERRACOTTA_WALL.get (), "Terracotta Walls");

    }
    //so crafting table and stonecutter recipes are called in one action
    protected static void bothSlabs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, String pGroup){
        blockToSlab (pFinishedRecipeConsumer, pInput, pOutput, pGroup);
        stonecutterSlabFromBlock (pFinishedRecipeConsumer, pInput,  pOutput);
    }
    protected static void bothStairs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, String pGroup){
        blockToStairs (pFinishedRecipeConsumer, pInput, pOutput, pGroup);
        stonecutterStairsFromBlock (pFinishedRecipeConsumer, pInput, pOutput);
    }
    protected static void bothWalls(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, String pGroup){
        blockToWall (pFinishedRecipeConsumer, pInput, pOutput, pGroup);
        stonecutterWallFromBlock (pFinishedRecipeConsumer, pInput, pOutput);
    }
    //crafting table recipes
    protected static void blockToSlab (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .group (pGroup)
                .define('#', pInput)
                .pattern("###")
                .unlockedBy(getHasName(pInput), has(pInput))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput,pInput));
    }
    protected static void blockToStairs (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 4)
                .group (pGroup)
                .define('#', pInput)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(pInput), has(pInput))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput));
    }
    protected static void blockToWall (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput,String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .group (pGroup)
                .define('#', pInput)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pInput), has(pInput))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput));
    }
    //stonecutter recipes
    protected static void stonecutterSlabFromBlock(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pInput), RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .unlockedBy(getHasName(pInput), has(pInput))
                .save(pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput) + "_stonecutting");
    }
    protected static void stonecutterStairsFromBlock(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pInput), RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .unlockedBy(getHasName(pInput), has(pInput))
                .save(pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput) + "_stonecutting");
    }
    protected static void stonecutterWallFromBlock(Consumer<FinishedRecipe> pFinishedRecipeConsumer,  ItemLike pInput, ItemLike pOutput) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pInput),RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .unlockedBy(getHasName(pInput), has(pInput))
                .save(pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput) + "_stonecutting");
    }
}