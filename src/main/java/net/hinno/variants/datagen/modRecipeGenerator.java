package net.hinno.variants.datagen;

import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
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
        bothSlabs (pWriter, Blocks.WHITE_CONCRETE, modConcreteBlocks.WHITE_CONCRETE_SLAB.get (), Blocks.WHITE_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.WHITE_CONCRETE, modConcreteBlocks.WHITE_CONCRETE_STAIRS.get (), Blocks.WHITE_CONCRETE,"Concrete Stairs");
        bothWalls (pWriter, Blocks.WHITE_CONCRETE, modConcreteBlocks.WHITE_CONCRETE_WALL.get (), Blocks.WHITE_CONCRETE,"Concrete Walls");

        bothSlabs (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (), Blocks.LIGHT_GRAY_CONCRETE,"Concrete Slabs");
        bothStairs (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get (), Blocks.LIGHT_GRAY_CONCRETE,"Concrete Stairs");
        bothWalls (pWriter, Blocks.LIGHT_GRAY_CONCRETE, modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get (),Blocks.LIGHT_GRAY_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.GRAY_CONCRETE, modConcreteBlocks.GRAY_CONCRETE_SLAB.get (), Blocks.GRAY_CONCRETE,"Concrete Slabs");
        bothStairs (pWriter, Blocks.GRAY_CONCRETE, modConcreteBlocks.GRAY_CONCRETE_STAIRS.get (), Blocks.GRAY_CONCRETE,"Concrete Stairs");
        bothWalls (pWriter, Blocks.GRAY_CONCRETE, modConcreteBlocks.GRAY_CONCRETE_WALL.get (), Blocks.GRAY_CONCRETE,"Concrete Walls");

        bothSlabs (pWriter, Blocks.BLACK_CONCRETE, modConcreteBlocks.BLACK_CONCRETE_SLAB.get (), Blocks.BLACK_CONCRETE,"Concrete Slabs");
        bothStairs (pWriter, Blocks.BLACK_CONCRETE, modConcreteBlocks.BLACK_CONCRETE_STAIRS.get (), Blocks.BLACK_CONCRETE,"Concrete Stairs");
        bothWalls (pWriter, Blocks.BLACK_CONCRETE, modConcreteBlocks.BLACK_CONCRETE_WALL.get (), Blocks.BLACK_CONCRETE,"Concrete Walls");

        bothSlabs (pWriter, Blocks.BROWN_CONCRETE, modConcreteBlocks.BROWN_CONCRETE_SLAB.get (), Blocks.BROWN_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.BROWN_CONCRETE, modConcreteBlocks.BROWN_CONCRETE_STAIRS.get (), Blocks.BROWN_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.BROWN_CONCRETE, modConcreteBlocks.BROWN_CONCRETE_WALL.get (), Blocks.BROWN_CONCRETE,"Concrete Walls");

        bothSlabs (pWriter, Blocks.RED_CONCRETE, modConcreteBlocks.RED_CONCRETE_SLAB.get (), Blocks.RED_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.RED_CONCRETE, modConcreteBlocks.RED_CONCRETE_STAIRS.get (), Blocks.RED_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.RED_CONCRETE, modConcreteBlocks.RED_CONCRETE_WALL.get (), Blocks.RED_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.ORANGE_CONCRETE, modConcreteBlocks.ORANGE_CONCRETE_SLAB.get (), Blocks.ORANGE_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.ORANGE_CONCRETE, modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get (), Blocks.ORANGE_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.ORANGE_CONCRETE, modConcreteBlocks.ORANGE_CONCRETE_WALL.get (), Blocks.ORANGE_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.YELLOW_CONCRETE, modConcreteBlocks.YELLOW_CONCRETE_SLAB.get (), Blocks.YELLOW_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.YELLOW_CONCRETE, modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get (), Blocks.YELLOW_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.YELLOW_CONCRETE, modConcreteBlocks.YELLOW_CONCRETE_WALL.get (), Blocks.YELLOW_CONCRETE,  "Concrete Stairs");

        bothSlabs (pWriter, Blocks.LIME_CONCRETE, modConcreteBlocks.LIME_CONCRETE_SLAB.get (), Blocks.LIME_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.LIME_CONCRETE, modConcreteBlocks.LIME_CONCRETE_STAIRS.get (), Blocks.LIME_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.LIME_CONCRETE, modConcreteBlocks.LIME_CONCRETE_WALL.get (), Blocks.LIME_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.GREEN_CONCRETE, modConcreteBlocks.GREEN_CONCRETE_SLAB.get (), Blocks.GREEN_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.GREEN_CONCRETE, modConcreteBlocks.GREEN_CONCRETE_STAIRS.get (), Blocks.GREEN_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.GREEN_CONCRETE, modConcreteBlocks.GREEN_CONCRETE_WALL.get (), Blocks.GREEN_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.CYAN_CONCRETE, modConcreteBlocks.CYAN_CONCRETE_SLAB.get (), Blocks.CYAN_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.CYAN_CONCRETE, modConcreteBlocks.CYAN_CONCRETE_STAIRS.get (), Blocks.CYAN_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.CYAN_CONCRETE, modConcreteBlocks.CYAN_CONCRETE_WALL.get (), Blocks.CYAN_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (), Blocks.LIGHT_BLUE_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get (), Blocks.LIGHT_BLUE_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.LIGHT_BLUE_CONCRETE, modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get (), Blocks.LIGHT_BLUE_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.BLUE_CONCRETE, modConcreteBlocks.BLUE_CONCRETE_SLAB.get (), Blocks.BLUE_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.BLUE_CONCRETE, modConcreteBlocks.BLUE_CONCRETE_STAIRS.get (), Blocks.BLUE_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.BLUE_CONCRETE, modConcreteBlocks.BLUE_CONCRETE_WALL.get (), Blocks.BLUE_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.PURPLE_CONCRETE, modConcreteBlocks.PURPLE_CONCRETE_SLAB.get (), Blocks.PURPLE_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.PURPLE_CONCRETE, modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get (), Blocks.PURPLE_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.PURPLE_CONCRETE, modConcreteBlocks.PURPLE_CONCRETE_WALL.get (), Blocks.PURPLE_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.MAGENTA_CONCRETE, modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get (), Blocks.MAGENTA_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.MAGENTA_CONCRETE, modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get (), Blocks.MAGENTA_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.MAGENTA_CONCRETE, modConcreteBlocks.MAGENTA_CONCRETE_WALL.get (), Blocks.MAGENTA_CONCRETE, "Concrete Walls");

        bothSlabs (pWriter, Blocks.PINK_CONCRETE, modConcreteBlocks.PINK_CONCRETE_SLAB.get (), Blocks.PINK_CONCRETE, "Concrete Slabs");
        bothStairs (pWriter, Blocks.PINK_CONCRETE, modConcreteBlocks.PINK_CONCRETE_STAIRS.get (), Blocks.PINK_CONCRETE, "Concrete Stairs");
        bothWalls (pWriter, Blocks.PINK_CONCRETE, modConcreteBlocks.PINK_CONCRETE_WALL.get (), Blocks.PINK_CONCRETE, "Concrete Walls");

        //terracottas
        bothSlabs (pWriter, Blocks.TERRACOTTA, modTerracottaBlocks.TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.TERRACOTTA, modTerracottaBlocks.TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.TERRACOTTA, modTerracottaBlocks.TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.WHITE_TERRACOTTA, modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.WHITE_TERRACOTTA, modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.WHITE_TERRACOTTA, modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIGHT_GRAY_TERRACOTTA, modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.GRAY_TERRACOTTA, modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.GRAY_TERRACOTTA, modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.GRAY_TERRACOTTA, modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BLACK_TERRACOTTA, modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BLACK_TERRACOTTA, modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BLACK_TERRACOTTA, modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BROWN_TERRACOTTA, modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BROWN_TERRACOTTA, modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BROWN_TERRACOTTA, modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.RED_TERRACOTTA, modTerracottaBlocks.RED_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.RED_TERRACOTTA, modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.RED_TERRACOTTA, modTerracottaBlocks.RED_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.ORANGE_TERRACOTTA, modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.ORANGE_TERRACOTTA, modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.ORANGE_TERRACOTTA, modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.YELLOW_TERRACOTTA, modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.YELLOW_TERRACOTTA, modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.YELLOW_TERRACOTTA, modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIME_TERRACOTTA, modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIME_TERRACOTTA, modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIME_TERRACOTTA, modTerracottaBlocks.LIME_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.GREEN_TERRACOTTA, modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.GREEN_TERRACOTTA, modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.GREEN_TERRACOTTA, modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.CYAN_TERRACOTTA, modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.CYAN_TERRACOTTA, modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.CYAN_TERRACOTTA, modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.LIGHT_BLUE_TERRACOTTA, modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.BLUE_TERRACOTTA, modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.BLUE_TERRACOTTA, modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.BLUE_TERRACOTTA, modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.PURPLE_TERRACOTTA, modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.PURPLE_TERRACOTTA, modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.PURPLE_TERRACOTTA, modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.MAGENTA_TERRACOTTA, modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.MAGENTA_TERRACOTTA, modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.MAGENTA_TERRACOTTA, modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");

        bothSlabs (pWriter, Blocks.PINK_TERRACOTTA, modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get (), Blocks.TERRACOTTA, "Terracotta Slabs");
        bothStairs (pWriter, Blocks.PINK_TERRACOTTA, modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get (), Blocks.TERRACOTTA, "Terracotta Stairs");
        bothWalls (pWriter, Blocks.PINK_TERRACOTTA, modTerracottaBlocks.PINK_TERRACOTTA_WALL.get (), Blocks.TERRACOTTA, "Terracotta Walls");


        //Clays
        blockToSlab (pWriter, Blocks.CLAY, modClayBlocks.CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, Blocks.CLAY, modClayBlocks.CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, Blocks.CLAY, modClayBlocks.CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.WHITE_CLAY.get (), Items.WHITE_DYE);
        blockToSlab (pWriter, modClayBlocks.WHITE_CLAY.get (), modClayBlocks.WHITE_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.WHITE_CLAY.get (), modClayBlocks.WHITE_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.WHITE_CLAY.get (), modClayBlocks.WHITE_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.LIGHT_GRAY_CLAY.get (), Items.LIGHT_GRAY_DYE);
        blockToSlab (pWriter, modClayBlocks.LIGHT_GRAY_CLAY.get (), modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.LIGHT_GRAY_CLAY.get (), modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.LIGHT_GRAY_CLAY.get (), modClayBlocks.LIGHT_GRAY_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.GRAY_CLAY.get (), Items.GRAY_DYE);
        blockToSlab (pWriter, modClayBlocks.GRAY_CLAY.get (), modClayBlocks.GRAY_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.GRAY_CLAY.get (), modClayBlocks.GRAY_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.GRAY_CLAY.get (), modClayBlocks.GRAY_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.BLACK_CLAY.get (), Items.BLACK_DYE);
        blockToSlab (pWriter, modClayBlocks.BLACK_CLAY.get (), modClayBlocks.BLACK_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.BLACK_CLAY.get (), modClayBlocks.BLACK_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.BLACK_CLAY.get (), modClayBlocks.BLACK_CLAY_WALL.get (), Blocks.CLAY,  "Clay Walls");

        stainedClay (pWriter, modClayBlocks.BROWN_CLAY.get (), Items.BROWN_DYE);
        blockToSlab (pWriter, modClayBlocks.BROWN_CLAY.get (), modClayBlocks.BROWN_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.BROWN_CLAY.get (), modClayBlocks.BROWN_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.BROWN_CLAY.get (), modClayBlocks.BROWN_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.RED_CLAY.get (), Items.RED_DYE);
        blockToSlab (pWriter, modClayBlocks.RED_CLAY.get (), modClayBlocks.RED_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.RED_CLAY.get (), modClayBlocks.RED_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.RED_CLAY.get (), modClayBlocks.RED_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.ORANGE_CLAY.get (), Items.ORANGE_DYE);
        blockToSlab (pWriter, modClayBlocks.ORANGE_CLAY.get (), modClayBlocks.ORANGE_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.ORANGE_CLAY.get (), modClayBlocks.ORANGE_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.ORANGE_CLAY.get (), modClayBlocks.ORANGE_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.YELLOW_CLAY.get (), Items.YELLOW_DYE);
        blockToSlab (pWriter, modClayBlocks.YELLOW_CLAY.get (), modClayBlocks.YELLOW_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.YELLOW_CLAY.get (), modClayBlocks.YELLOW_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.YELLOW_CLAY.get (), modClayBlocks.YELLOW_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.LIME_CLAY.get (), Items.LIME_DYE);
        blockToSlab (pWriter, modClayBlocks.LIME_CLAY.get (), modClayBlocks.LIME_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.LIME_CLAY.get (), modClayBlocks.LIME_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.LIME_CLAY.get (), modClayBlocks.LIME_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.GREEN_CLAY.get (), Items.GREEN_DYE);
        blockToSlab (pWriter, modClayBlocks.GREEN_CLAY.get (), modClayBlocks.GREEN_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.GREEN_CLAY.get (), modClayBlocks.GREEN_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.GREEN_CLAY.get (), modClayBlocks.GREEN_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.CYAN_CLAY.get (), Items.CYAN_DYE);
        blockToSlab (pWriter, modClayBlocks.CYAN_CLAY.get (), modClayBlocks.CYAN_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.CYAN_CLAY.get (), modClayBlocks.CYAN_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.CYAN_CLAY.get (), modClayBlocks.CYAN_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.LIGHT_BLUE_CLAY.get (), Items.LIGHT_BLUE_DYE);
        blockToSlab (pWriter, modClayBlocks.LIGHT_BLUE_CLAY.get (), modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.LIGHT_BLUE_CLAY.get (), modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.LIGHT_BLUE_CLAY.get (), modClayBlocks.LIGHT_BLUE_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.BLUE_CLAY.get (), Items.BLUE_DYE);
        blockToSlab (pWriter, modClayBlocks.BLUE_CLAY.get (), modClayBlocks.BLUE_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.BLUE_CLAY.get (), modClayBlocks.BLUE_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.BLUE_CLAY.get (), modClayBlocks.BLUE_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.PURPLE_CLAY.get (), Items.PURPLE_DYE);
        blockToSlab (pWriter, modClayBlocks.PURPLE_CLAY.get (), modClayBlocks.PURPLE_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.PURPLE_CLAY.get (), modClayBlocks.PURPLE_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.PURPLE_CLAY.get (), modClayBlocks.PURPLE_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.MAGENTA_CLAY.get (), Items.MAGENTA_DYE);
        blockToSlab (pWriter, modClayBlocks.MAGENTA_CLAY.get (), modClayBlocks.MAGENTA_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.MAGENTA_CLAY.get (), modClayBlocks.MAGENTA_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.MAGENTA_CLAY.get (), modClayBlocks.MAGENTA_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");

        stainedClay (pWriter, modClayBlocks.PINK_CLAY.get (), Items.PINK_DYE);
        blockToSlab (pWriter, modClayBlocks.PINK_CLAY.get (), modClayBlocks.PINK_CLAY_SLAB.get (), Blocks.CLAY, "Clay Slabs");
        blockToStairs (pWriter, modClayBlocks.PINK_CLAY.get (), modClayBlocks.PINK_CLAY_STAIRS.get (), Blocks.CLAY, "Clay Stairs");
        blockToWall (pWriter, modClayBlocks.PINK_CLAY.get(), modClayBlocks.PINK_CLAY_WALL.get (), Blocks.CLAY, "Clay Walls");


    }
    //so crafting table and stonecutter recipes are called in one action
    protected static void bothSlabs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, ItemLike pUnlockItem, String pGroup){
        blockToSlab (pFinishedRecipeConsumer, pInput, pOutput,pUnlockItem, pGroup);
        stonecutterModRecipe (pFinishedRecipeConsumer, pInput,  pOutput);
    }
    protected static void bothStairs(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, ItemLike pUnlockItem, String pGroup){
        blockToStairs (pFinishedRecipeConsumer, pInput, pOutput,pUnlockItem, pGroup);
        stonecutterModRecipe (pFinishedRecipeConsumer, pInput, pOutput);
    }
    protected static void bothWalls(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput,ItemLike pUnlockItem, String pGroup){
        blockToWall (pFinishedRecipeConsumer, pInput, pOutput, pUnlockItem, pGroup);
        stonecutterModRecipe (pFinishedRecipeConsumer, pInput, pOutput);
    }

    //crafting table recipes
    protected static void blockToSlab (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, ItemLike pUnlockItem, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .group (pGroup)
                .define('#', pInput)
                .pattern("###")
                .unlockedBy(getHasName(pUnlockItem), has(pUnlockItem))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput,pInput));
    }
    protected static void blockToStairs (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput, ItemLike pUnlockItem, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 4)
                .group (pGroup)
                .define('#', pInput)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy(getHasName(pUnlockItem), has(pUnlockItem))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput));
    }
    protected static void blockToWall (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput,ItemLike pUnlockItem, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .group (pGroup)
                .define('#', pInput)
                .pattern("###")
                .pattern("###")
                .unlockedBy(getHasName(pUnlockItem), has(pUnlockItem))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput));
    }
    protected static void stainedClay(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pStainedClay, ItemLike pDye) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pStainedClay, 8)
                .define('#', Blocks.CLAY).define('X', pDye)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("stained_clay")
                .unlockedBy("has_clay", has(Blocks.CLAY))
                .save(pFinishedRecipeConsumer, variants.MODID + ":" + getItemName (pStainedClay) + "_from_" + getItemName (pDye) + "_and_clay");
    }
    //stonecutter recipes
    protected static void stonecutterModRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pInput, ItemLike pOutput) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pInput), RecipeCategory.BUILDING_BLOCKS, pOutput, 1)
                .unlockedBy(getHasName(pInput), has(pInput))
                .save(pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pInput) + "_stonecutting");
    }

}