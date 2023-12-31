package net.hinno.variants.datagen;

import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.block.modWoodBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.WoodType;
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


        //woods
        blockToSlab (pWriter,  Blocks.OAK_LOG, modWoodBlocks.OAK_LOG_SLAB.get (), Blocks.OAK_LOG, "Log Slabs");
        blockToStairs(pWriter, Blocks.OAK_LOG, modWoodBlocks.OAK_LOG_STAIRS.get (), Blocks.OAK_PLANKS,  "Log Stairs");
        woodWall (pWriter, Blocks.OAK_LOG, Blocks.OAK_PLANKS, modWoodBlocks.OAK_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.OAK_PLANKS, Blocks.OAK_LOG, modWoodBlocks.OAK_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.BIRCH_LOG, modWoodBlocks.BIRCH_LOG_SLAB.get (), Blocks.BIRCH_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.BIRCH_LOG,  modWoodBlocks.BIRCH_LOG_STAIRS.get (), Blocks.BIRCH_PLANKS,"Log Stairs");
        woodWall (pWriter, Blocks.BIRCH_LOG, Blocks.BIRCH_PLANKS, modWoodBlocks.BIRCH_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, modWoodBlocks.BIRCH_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.SPRUCE_LOG, modWoodBlocks.SPRUCE_LOG_SLAB.get (), Blocks.SPRUCE_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.SPRUCE_LOG,  modWoodBlocks.SPRUCE_LOG_STAIRS.get (), Blocks.SPRUCE_PLANKS,"Log Stairs");
        woodWall (pWriter, Blocks.SPRUCE_LOG, Blocks.SPRUCE_PLANKS, modWoodBlocks.SPRUCE_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, modWoodBlocks.SPRUCE_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.DARK_OAK_LOG, modWoodBlocks.DARK_OAK_LOG_SLAB.get (), Blocks.DARK_OAK_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.DARK_OAK_LOG, modWoodBlocks.DARK_OAK_LOG_STAIRS.get (), Blocks.DARK_OAK_PLANKS, "Log Stairs");
        woodWall (pWriter, Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_PLANKS, modWoodBlocks.DARK_OAK_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, modWoodBlocks.DARK_OAK_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.CHERRY_LOG, modWoodBlocks.CHERRY_LOG_SLAB.get (), Blocks.CHERRY_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.CHERRY_LOG, modWoodBlocks.CHERRY_LOG_STAIRS.get (), Blocks.CHERRY_PLANKS, "Log Stairs");
        woodWall (pWriter, Blocks.CHERRY_LOG, Blocks.CHERRY_PLANKS, modWoodBlocks.CHERRY_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.CHERRY_PLANKS, Blocks.CHERRY_LOG, modWoodBlocks.CHERRY_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.ACACIA_LOG, modWoodBlocks.ACACIA_LOG_SLAB.get (), Blocks.ACACIA_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.ACACIA_LOG, modWoodBlocks.ACACIA_LOG_STAIRS.get (), Blocks.ACACIA_PLANKS, "Log Stairs");
        woodWall (pWriter, Blocks.ACACIA_LOG, Blocks.ACACIA_PLANKS, modWoodBlocks.ACACIA_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, modWoodBlocks.ACACIA_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.JUNGLE_LOG, modWoodBlocks.JUNGLE_LOG_SLAB.get (), Blocks.JUNGLE_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.JUNGLE_LOG,  modWoodBlocks.JUNGLE_LOG_STAIRS.get (), Blocks.JUNGLE_PLANKS,"Log Stairs");
        woodWall (pWriter, Blocks.JUNGLE_LOG, Blocks.JUNGLE_PLANKS, modWoodBlocks.JUNGLE_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, modWoodBlocks.JUNGLE_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.MANGROVE_LOG, modWoodBlocks.MANGROVE_LOG_SLAB.get (), Blocks.MANGROVE_LOG, "Log Slabs");
        blockToStairs (pWriter, Blocks.MANGROVE_LOG, modWoodBlocks.MANGROVE_LOG_STAIRS.get (), Blocks.MANGROVE_PLANKS, "Log Stairs");
        woodWall (pWriter, Blocks.MANGROVE_LOG, Blocks.MANGROVE_PLANKS, modWoodBlocks.MANGROVE_LOG_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_LOG, modWoodBlocks.MANGROVE_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.BAMBOO_BLOCK, modWoodBlocks.BAMBOO_BLOCK_SLAB.get (), Blocks.BAMBOO_BLOCK, "Log Slabs");
        blockToStairs (pWriter, Blocks.BAMBOO_BLOCK,  modWoodBlocks.BAMBOO_BLOCK_STAIRS.get (), Blocks.BAMBOO_PLANKS,"Log Stairs");
        woodWall (pWriter, Blocks.BAMBOO_BLOCK, Blocks.BAMBOO_PLANKS, modWoodBlocks.BAMBOO_BLOCK_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_BLOCK, modWoodBlocks.BAMBOO_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.WARPED_STEM, modWoodBlocks.WARPED_STEM_SLAB.get (), Blocks.WARPED_STEM, "Log Slabs");
        blockToStairs (pWriter, Blocks.WARPED_STEM, modWoodBlocks.WARPED_STEM_STAIRS.get (), Blocks.WARPED_PLANKS, "Log Stairs");
        woodWall (pWriter, Blocks.WARPED_STEM, Blocks.WARPED_PLANKS, modWoodBlocks.WARPED_STEM_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, modWoodBlocks.WARPED_PLANKS_WALL.get (), "Plank Walls");

        blockToSlab (pWriter,  Blocks.CRIMSON_STEM, modWoodBlocks.CRIMSON_STEM_SLAB.get (), Blocks.CRIMSON_STEM, "Log Slabs");
        blockToStairs (pWriter, Blocks.CRIMSON_STEM, modWoodBlocks.CRIMSON_STEM_STAIRS.get (),  Blocks.CRIMSON_PLANKS,"Log Stairs");
        woodWall (pWriter, Blocks.CRIMSON_STEM, Blocks.CRIMSON_PLANKS, modWoodBlocks.CRIMSON_STEM_WALL.get (), "Log Walls");
        woodWall (pWriter, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, modWoodBlocks.CRIMSON_PLANKS_WALL.get (), "Plank Walls");

        //stripped wood
        blockToSlab (pWriter,  Blocks.STRIPPED_OAK_LOG, modWoodBlocks.STRIPPED_OAK_LOG_SLAB.get (), Blocks.OAK_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_OAK_LOG,  modWoodBlocks.STRIPPED_OAK_LOG_STAIRS.get (), Blocks.OAK_LOG,"Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_OAK_LOG, Blocks.OAK_LOG,  modWoodBlocks.STRIPPED_OAK_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_BIRCH_LOG, modWoodBlocks.STRIPPED_BIRCH_LOG_SLAB.get (), Blocks.BIRCH_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_BIRCH_LOG,  modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS.get (),Blocks.BIRCH_LOG, "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_LOG,  modWoodBlocks.STRIPPED_BIRCH_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_SPRUCE_LOG, modWoodBlocks.STRIPPED_SPRUCE_LOG_SLAB.get (), Blocks.SPRUCE_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_SPRUCE_LOG, modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get (),  Blocks.SPRUCE_LOG, "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_LOG,  modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_DARK_OAK_LOG, modWoodBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get (), Blocks.BIRCH_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_DARK_OAK_LOG,  modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get (), Blocks.DARK_OAK_LOG,"Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_LOG,  modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_CHERRY_LOG, modWoodBlocks.STRIPPED_CHERRY_LOG_SLAB.get (), Blocks.CHERRY_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_CHERRY_LOG,  modWoodBlocks.STRIPPED_CHERRY_LOG_STAIRS.get (), Blocks.CHERRY_LOG,"Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_CHERRY_LOG, Blocks.CHERRY_LOG,  modWoodBlocks.STRIPPED_CHERRY_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_ACACIA_LOG, modWoodBlocks.STRIPPED_ACACIA_LOG_SLAB.get (), Blocks.ACACIA_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_ACACIA_LOG, modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS.get (), Blocks.ACACIA_LOG,  "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_LOG, modWoodBlocks.STRIPPED_ACACIA_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_JUNGLE_LOG, modWoodBlocks.STRIPPED_JUNGLE_LOG_SLAB.get (), Blocks.JUNGLE_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_JUNGLE_LOG, modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get (), Blocks.JUNGLE_LOG,  "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_LOG,  modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL.get (), "Stripped Log Walls");

        blockToSlab (pWriter,  Blocks.STRIPPED_MANGROVE_LOG, modWoodBlocks.STRIPPED_MANGROVE_LOG_SLAB.get (), Blocks.MANGROVE_LOG, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_MANGROVE_LOG, modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get (),  Blocks.MANGROVE_LOG, "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_MANGROVE_LOG, Blocks.MANGROVE_LOG, modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL.get (), "Stripped Log Walls");

        woodWall (pWriter, Blocks.STRIPPED_BAMBOO_BLOCK, Blocks.BAMBOO_BLOCK, modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get (), "Stripped Log Walls");
        blockToStairs (pWriter, Blocks.STRIPPED_BAMBOO_BLOCK,  modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get (), Blocks.BAMBOO_BLOCK,"Stripped Log Stairs");
        blockToSlab (pWriter,  Blocks.STRIPPED_BAMBOO_BLOCK, modWoodBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get (), Blocks.BAMBOO_BLOCK, "Stripped Log Slabs");

        woodWall (pWriter, Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_STEM, modWoodBlocks.STRIPPED_WARPED_STEM_WALL.get (), "Stripped Log Walls");
        blockToStairs (pWriter, Blocks.STRIPPED_WARPED_STEM, modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS.get (), Blocks.WARPED_STEM,  "Stripped Log Stairs");
        blockToSlab (pWriter,  Blocks.STRIPPED_WARPED_STEM, modWoodBlocks.STRIPPED_WARPED_STEM_SLAB.get (), Blocks.WARPED_STEM, "Stripped Log Slabs");

        blockToSlab (pWriter,  Blocks.STRIPPED_CRIMSON_STEM, modWoodBlocks.STRIPPED_CRIMSON_STEM_SLAB.get (), Blocks.CRIMSON_STEM, "Stripped Log Slabs");
        blockToStairs (pWriter, Blocks.STRIPPED_CRIMSON_STEM, modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get (),  Blocks.CRIMSON_STEM, "Stripped Log Stairs");
        woodWall (pWriter, Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_STEM, modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL.get (), "Stripped Log Walls");


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
    protected static void woodWall (Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pBase, ItemLike pAlt, ItemLike pOutput, String pGroup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pOutput, 6)
                .group (pGroup)
                .define('#', pBase).define('X', pAlt)
                .pattern("#X#")
                .pattern("###")
                .unlockedBy(getHasName(pBase), has(pBase))
                .save (pFinishedRecipeConsumer, variants.MODID + ":" + getConversionRecipeName(pOutput, pBase));
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