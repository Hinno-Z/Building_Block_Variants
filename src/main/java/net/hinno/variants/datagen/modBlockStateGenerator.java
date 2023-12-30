package net.hinno.variants.datagen;

import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.block.modWoodBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class modBlockStateGenerator extends BlockStateProvider {
    public modBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super (output, variants.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //concretes
        stairsBlock ((StairBlock) modConcreteBlocks.WHITE_CONCRETE_STAIRS.get (), blockTexture (Blocks.WHITE_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.WHITE_CONCRETE_SLAB.get (), blockTexture (Blocks.WHITE_CONCRETE), blockTexture (Blocks.WHITE_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.WHITE_CONCRETE_WALL.get (),blockTexture (Blocks.WHITE_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIGHT_GRAY_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (), blockTexture (Blocks.LIGHT_GRAY_CONCRETE), blockTexture (Blocks.LIGHT_GRAY_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get (),blockTexture (Blocks.LIGHT_GRAY_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.GRAY_CONCRETE_STAIRS.get (), blockTexture (Blocks.GRAY_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.GRAY_CONCRETE_SLAB.get (), blockTexture (Blocks.GRAY_CONCRETE), blockTexture (Blocks.GRAY_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.GRAY_CONCRETE_WALL.get (),blockTexture (Blocks.GRAY_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.BLACK_CONCRETE_STAIRS.get (), blockTexture (Blocks.BLACK_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.BLACK_CONCRETE_SLAB.get (), blockTexture (Blocks.BLACK_CONCRETE), blockTexture (Blocks.BLACK_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.BLACK_CONCRETE_WALL.get (),blockTexture (Blocks.BLACK_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.BROWN_CONCRETE_STAIRS.get (), blockTexture (Blocks.BROWN_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.BROWN_CONCRETE_SLAB.get (), blockTexture (Blocks.BROWN_CONCRETE), blockTexture (Blocks.BROWN_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.BROWN_CONCRETE_WALL.get (),blockTexture (Blocks.BROWN_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.RED_CONCRETE_STAIRS.get (), blockTexture (Blocks.RED_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.RED_CONCRETE_SLAB.get (), blockTexture (Blocks.RED_CONCRETE), blockTexture (Blocks.RED_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.RED_CONCRETE_WALL.get (),blockTexture (Blocks.RED_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get (), blockTexture (Blocks.ORANGE_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.ORANGE_CONCRETE_SLAB.get (), blockTexture (Blocks.ORANGE_CONCRETE), blockTexture (Blocks.ORANGE_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.ORANGE_CONCRETE_WALL.get (),blockTexture (Blocks.ORANGE_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get (), blockTexture (Blocks.YELLOW_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.YELLOW_CONCRETE_SLAB.get (), blockTexture (Blocks.YELLOW_CONCRETE), blockTexture (Blocks.YELLOW_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.YELLOW_CONCRETE_WALL.get (),blockTexture (Blocks.YELLOW_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.LIME_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIME_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.LIME_CONCRETE_SLAB.get (), blockTexture (Blocks.LIME_CONCRETE), blockTexture (Blocks.LIME_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.LIME_CONCRETE_WALL.get (),blockTexture (Blocks.LIME_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.GREEN_CONCRETE_STAIRS.get (), blockTexture (Blocks.GREEN_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.GREEN_CONCRETE_SLAB.get (), blockTexture (Blocks.GREEN_CONCRETE), blockTexture (Blocks.GREEN_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.GREEN_CONCRETE_WALL.get (),blockTexture (Blocks.GREEN_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.CYAN_CONCRETE_STAIRS.get (), blockTexture (Blocks.CYAN_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.CYAN_CONCRETE_SLAB.get (), blockTexture (Blocks.CYAN_CONCRETE), blockTexture (Blocks.CYAN_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.CYAN_CONCRETE_WALL.get (),blockTexture (Blocks.CYAN_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIGHT_BLUE_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (), blockTexture (Blocks.LIGHT_BLUE_CONCRETE), blockTexture (Blocks.LIGHT_BLUE_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get (),blockTexture (Blocks.LIGHT_BLUE_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.BLUE_CONCRETE_STAIRS.get (), blockTexture (Blocks.BLUE_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.BLUE_CONCRETE_SLAB.get (), blockTexture (Blocks.BLUE_CONCRETE), blockTexture (Blocks.BLUE_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.BLUE_CONCRETE_WALL.get (),blockTexture (Blocks.BLUE_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get (), blockTexture (Blocks.PURPLE_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.PURPLE_CONCRETE_SLAB.get (), blockTexture (Blocks.PURPLE_CONCRETE), blockTexture (Blocks.PURPLE_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.PURPLE_CONCRETE_WALL.get (),blockTexture (Blocks.PURPLE_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get (), blockTexture (Blocks.MAGENTA_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get (), blockTexture (Blocks.MAGENTA_CONCRETE), blockTexture (Blocks.MAGENTA_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.MAGENTA_CONCRETE_WALL.get (),blockTexture (Blocks.MAGENTA_CONCRETE));

        stairsBlock ((StairBlock) modConcreteBlocks.PINK_CONCRETE_STAIRS.get (), blockTexture (Blocks.PINK_CONCRETE));
        slabBlock ((SlabBlock) modConcreteBlocks.PINK_CONCRETE_SLAB.get (), blockTexture (Blocks.PINK_CONCRETE), blockTexture (Blocks.PINK_CONCRETE));
        modWallBlock ((WallBlock) modConcreteBlocks.PINK_CONCRETE_WALL.get (),blockTexture (Blocks.PINK_CONCRETE));


        //terracottas
        stairsBlock ((StairBlock) modTerracottaBlocks.TERRACOTTA_STAIRS.get (), blockTexture (Blocks.TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.TERRACOTTA_SLAB.get (), blockTexture (Blocks.TERRACOTTA), blockTexture (Blocks.TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.TERRACOTTA_WALL.get (),blockTexture (Blocks.TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.WHITE_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.WHITE_TERRACOTTA), blockTexture (Blocks.WHITE_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get (),blockTexture (Blocks.WHITE_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.GRAY_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get (), blockTexture (Blocks.GRAY_TERRACOTTA), blockTexture (Blocks.GRAY_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get (),blockTexture (Blocks.GRAY_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BLACK_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BLACK_TERRACOTTA), blockTexture (Blocks.BLACK_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get (),blockTexture (Blocks.BLACK_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BROWN_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BROWN_TERRACOTTA), blockTexture (Blocks.BROWN_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get (),blockTexture (Blocks.BROWN_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.RED_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.RED_TERRACOTTA_SLAB.get (), blockTexture (Blocks.RED_TERRACOTTA), blockTexture (Blocks.RED_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.RED_TERRACOTTA_WALL.get (),blockTexture (Blocks.RED_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.ORANGE_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.ORANGE_TERRACOTTA), blockTexture (Blocks.ORANGE_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get (),blockTexture (Blocks.ORANGE_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.YELLOW_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get (), blockTexture (Blocks.YELLOW_TERRACOTTA), blockTexture (Blocks.YELLOW_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get (),blockTexture (Blocks.YELLOW_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIME_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIME_TERRACOTTA), blockTexture (Blocks.LIME_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.LIME_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIME_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.GREEN_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.GREEN_TERRACOTTA), blockTexture (Blocks.GREEN_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get (),blockTexture (Blocks.GREEN_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.CYAN_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.CYAN_TERRACOTTA), blockTexture (Blocks.CYAN_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get (),blockTexture (Blocks.CYAN_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BLUE_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BLUE_TERRACOTTA), blockTexture (Blocks.BLUE_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get (),blockTexture (Blocks.BLUE_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.PURPLE_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.PURPLE_TERRACOTTA), blockTexture (Blocks.PURPLE_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get (),blockTexture (Blocks.PURPLE_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.MAGENTA_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get (), blockTexture (Blocks.MAGENTA_TERRACOTTA), blockTexture (Blocks.MAGENTA_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get (),blockTexture (Blocks.MAGENTA_TERRACOTTA));

        stairsBlock ((StairBlock) modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.PINK_TERRACOTTA));
        slabBlock ((SlabBlock) modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get (), blockTexture (Blocks.PINK_TERRACOTTA), blockTexture (Blocks.PINK_TERRACOTTA));
        modWallBlock ((WallBlock) modTerracottaBlocks.PINK_TERRACOTTA_WALL.get (),blockTexture (Blocks.PINK_TERRACOTTA));

        //Clay blocks
        stairsBlock ((StairBlock) modClayBlocks.CLAY_STAIRS.get (), blockTexture (Blocks.CLAY));
        slabBlock ((SlabBlock) modClayBlocks.CLAY_SLAB.get (), blockTexture (Blocks.CLAY), blockTexture (Blocks.CLAY));
        modWallBlock ((WallBlock) modClayBlocks.CLAY_WALL.get (),blockTexture (Blocks.CLAY));

        blockWithItem (modClayBlocks.WHITE_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.WHITE_CLAY_STAIRS.get (), blockTexture (modClayBlocks.WHITE_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.WHITE_CLAY_SLAB.get (), blockTexture (modClayBlocks.WHITE_CLAY.get ()), blockTexture (modClayBlocks.WHITE_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.WHITE_CLAY_WALL.get (),blockTexture (modClayBlocks.WHITE_CLAY.get ()));

        blockWithItem (modClayBlocks.LIGHT_GRAY_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get (), blockTexture (modClayBlocks.LIGHT_GRAY_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get (), blockTexture (modClayBlocks.LIGHT_GRAY_CLAY.get ()), blockTexture (modClayBlocks.LIGHT_GRAY_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.LIGHT_GRAY_CLAY_WALL.get (),blockTexture (modClayBlocks.LIGHT_GRAY_CLAY.get ()));

        blockWithItem (modClayBlocks.GRAY_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.GRAY_CLAY_STAIRS.get (), blockTexture (modClayBlocks.GRAY_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.GRAY_CLAY_SLAB.get (), blockTexture (modClayBlocks.GRAY_CLAY.get ()), blockTexture (modClayBlocks.GRAY_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.GRAY_CLAY_WALL.get (),blockTexture (modClayBlocks.GRAY_CLAY.get ()));

        blockWithItem (modClayBlocks.BLACK_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.BLACK_CLAY_STAIRS.get (), blockTexture (modClayBlocks.BLACK_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.BLACK_CLAY_SLAB.get (), blockTexture (modClayBlocks.BLACK_CLAY.get ()), blockTexture (modClayBlocks.BLACK_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.BLACK_CLAY_WALL.get (),blockTexture (modClayBlocks.BLACK_CLAY.get ()));

        blockWithItem (modClayBlocks.BROWN_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.BROWN_CLAY_STAIRS.get (), blockTexture (modClayBlocks.BROWN_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.BROWN_CLAY_SLAB.get (), blockTexture (modClayBlocks.BROWN_CLAY.get ()), blockTexture (modClayBlocks.BROWN_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.BROWN_CLAY_WALL.get (),blockTexture (modClayBlocks.BROWN_CLAY.get ()));

        blockWithItem (modClayBlocks.RED_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.RED_CLAY_STAIRS.get (), blockTexture (modClayBlocks.RED_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.RED_CLAY_SLAB.get (), blockTexture (modClayBlocks.RED_CLAY.get ()), blockTexture (modClayBlocks.RED_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.RED_CLAY_WALL.get (),blockTexture (modClayBlocks.RED_CLAY.get ()));

        blockWithItem (modClayBlocks.ORANGE_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.ORANGE_CLAY_STAIRS.get (), blockTexture (modClayBlocks.ORANGE_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.ORANGE_CLAY_SLAB.get (), blockTexture (modClayBlocks.ORANGE_CLAY.get ()), blockTexture (modClayBlocks.ORANGE_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.ORANGE_CLAY_WALL.get (),blockTexture (modClayBlocks.ORANGE_CLAY.get ()));

        blockWithItem (modClayBlocks.YELLOW_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.YELLOW_CLAY_STAIRS.get (), blockTexture (modClayBlocks.YELLOW_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.YELLOW_CLAY_SLAB.get (), blockTexture (modClayBlocks.YELLOW_CLAY.get ()), blockTexture (modClayBlocks.YELLOW_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.YELLOW_CLAY_WALL.get (),blockTexture (modClayBlocks.YELLOW_CLAY.get ()));
        
        blockWithItem (modClayBlocks.LIME_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.LIME_CLAY_STAIRS.get (), blockTexture (modClayBlocks.LIME_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.LIME_CLAY_SLAB.get (), blockTexture (modClayBlocks.LIME_CLAY.get ()), blockTexture (modClayBlocks.LIME_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.LIME_CLAY_WALL.get (),blockTexture (modClayBlocks.LIME_CLAY.get ()));

        blockWithItem (modClayBlocks.GREEN_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.GREEN_CLAY_STAIRS.get (), blockTexture (modClayBlocks.GREEN_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.GREEN_CLAY_SLAB.get (), blockTexture (modClayBlocks.GREEN_CLAY.get ()), blockTexture (modClayBlocks.GREEN_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.GREEN_CLAY_WALL.get (),blockTexture (modClayBlocks.GREEN_CLAY.get ()));

        blockWithItem (modClayBlocks.CYAN_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.CYAN_CLAY_STAIRS.get (), blockTexture (modClayBlocks.CYAN_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.CYAN_CLAY_SLAB.get (), blockTexture (modClayBlocks.CYAN_CLAY.get ()), blockTexture (modClayBlocks.CYAN_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.CYAN_CLAY_WALL.get (),blockTexture (modClayBlocks.CYAN_CLAY.get ()));

        blockWithItem (modClayBlocks.LIGHT_BLUE_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get (), blockTexture (modClayBlocks.LIGHT_BLUE_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get (), blockTexture (modClayBlocks.LIGHT_BLUE_CLAY.get ()), blockTexture (modClayBlocks.LIGHT_BLUE_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.LIGHT_BLUE_CLAY_WALL.get (),blockTexture (modClayBlocks.LIGHT_BLUE_CLAY.get ()));

        blockWithItem (modClayBlocks.BLUE_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.BLUE_CLAY_STAIRS.get (), blockTexture (modClayBlocks.BLUE_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.BLUE_CLAY_SLAB.get (), blockTexture (modClayBlocks.BLUE_CLAY.get ()), blockTexture (modClayBlocks.BLUE_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.BLUE_CLAY_WALL.get (),blockTexture (modClayBlocks.BLUE_CLAY.get ()));

        blockWithItem (modClayBlocks.PURPLE_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.PURPLE_CLAY_STAIRS.get (), blockTexture (modClayBlocks.PURPLE_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.PURPLE_CLAY_SLAB.get (), blockTexture (modClayBlocks.PURPLE_CLAY.get ()), blockTexture (modClayBlocks.PURPLE_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.PURPLE_CLAY_WALL.get (),blockTexture (modClayBlocks.PURPLE_CLAY.get ()));

        blockWithItem (modClayBlocks.MAGENTA_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.MAGENTA_CLAY_STAIRS.get (), blockTexture (modClayBlocks.MAGENTA_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.MAGENTA_CLAY_SLAB.get (), blockTexture (modClayBlocks.MAGENTA_CLAY.get ()), blockTexture (modClayBlocks.MAGENTA_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.MAGENTA_CLAY_WALL.get (),blockTexture (modClayBlocks.MAGENTA_CLAY.get ()));

        blockWithItem (modClayBlocks.PINK_CLAY);
        stairsBlock ((StairBlock) modClayBlocks.PINK_CLAY_STAIRS.get (), blockTexture (modClayBlocks.PINK_CLAY.get ()));
        slabBlock ((SlabBlock) modClayBlocks.PINK_CLAY_SLAB.get (), blockTexture (modClayBlocks.PINK_CLAY.get ()), blockTexture (modClayBlocks.PINK_CLAY.get ()));
        modWallBlock ((WallBlock) modClayBlocks.PINK_CLAY_WALL.get (),blockTexture (modClayBlocks.PINK_CLAY.get ()));

        //wood wall blocks
        modWallBlock ((WallBlock) modWoodBlocks.OAK_PLANKS_WALL.get (),blockTexture (Blocks.OAK_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.OAK_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/oak_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_OAK_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/stripped_oak_log"));

        modWallBlock ((WallBlock) modWoodBlocks.BIRCH_PLANKS_WALL .get (),blockTexture (Blocks.  BIRCH_PLANKS ));
        modWallBlock ((WallBlock) modWoodBlocks.BIRCH_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/birch_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_BIRCH_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/stripped_birch_log"));

        modWallBlock ((WallBlock) modWoodBlocks.SPRUCE_PLANKS_WALL.get (),blockTexture (Blocks.SPRUCE_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.SPRUCE_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/spruce_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/stripped_spruce_log"));

        modWallBlock ((WallBlock) modWoodBlocks.DARK_OAK_PLANKS_WALL.get (),blockTexture (Blocks.DARK_OAK_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.DARK_OAK_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/dark_oak_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/stripped_dark_oak_log"));

        modWallBlock ((WallBlock) modWoodBlocks.CHERRY_PLANKS_WALL.get (),blockTexture (Blocks.CHERRY_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.CHERRY_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/cherry_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_CHERRY_LOG_WALL.get (),ResourceLocation.tryParse ("minecraft:block/stripped_cherry_log"));

        modWallBlock ((WallBlock) modWoodBlocks.ACACIA_PLANKS_WALL .get (),blockTexture (Blocks.ACACIA_PLANKS ));
        modWallBlock ((WallBlock) modWoodBlocks.ACACIA_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/acacia_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_ACACIA_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/stripped_acacia_log"));

        modWallBlock ((WallBlock) modWoodBlocks.JUNGLE_PLANKS_WALL.get (),blockTexture (Blocks.JUNGLE_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.JUNGLE_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/jungle_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/stripped_jungle_log"));

        modWallBlock ((WallBlock) modWoodBlocks.MANGROVE_PLANKS_WALL.get (),blockTexture (Blocks.MANGROVE_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.MANGROVE_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/mangrove_log"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL.get (), ResourceLocation.tryParse ("minecraft:block/stripped_mangrove_log"));

        modWallBlock ((WallBlock) modWoodBlocks.BAMBOO_PLANKS_WALL.get (),blockTexture (Blocks.BAMBOO_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.BAMBOO_BLOCK_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/bamboo_block"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_bamboo_block"));

        modWallBlock ((WallBlock) modWoodBlocks.WARPED_PLANKS_WALL.get (),blockTexture (Blocks.WARPED_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.WARPED_STEM_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/warped_stem"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_WARPED_STEM_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_warped_stem"));

        modWallBlock ((WallBlock) modWoodBlocks.CRIMSON_PLANKS_WALL.get (),blockTexture (Blocks.CRIMSON_PLANKS));
        modWallBlock ((WallBlock) modWoodBlocks.CRIMSON_STEM_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/crimson_stem"));
        modWallBlock ((WallBlock) modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_crimson_stem"));

        //Log stairs blocks
        stairsBlock ((StairBlock) modWoodBlocks.OAK_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/oak_log"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_OAK_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/stripped_oak_log"));

        stairsBlock ((StairBlock) modWoodBlocks.BIRCH_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/birch_log"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/stripped_birch_log"));

        stairsBlock ((StairBlock)modWoodBlocks.SPRUCE_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/spruce_log"));
        stairsBlock ((StairBlock)modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/stripped_spruce_log"));

        stairsBlock ((StairBlock)modWoodBlocks.DARK_OAK_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/dark_oak_log"));
        stairsBlock ((StairBlock)modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/stripped_dark_oak_log"));

        stairsBlock ((StairBlock)modWoodBlocks.CHERRY_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/cherry_log"));
        stairsBlock ((StairBlock)modWoodBlocks.STRIPPED_CHERRY_LOG_STAIRS.get (),ResourceLocation.tryParse ("minecraft:block/stripped_cherry_log"));

        stairsBlock ((StairBlock)modWoodBlocks.ACACIA_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/acacia_log"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/stripped_acacia_log"));

        stairsBlock ((StairBlock) modWoodBlocks.JUNGLE_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/jungle_log"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/stripped_jungle_log"));

        stairsBlock ((StairBlock) modWoodBlocks.MANGROVE_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/mangrove_log"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get (), ResourceLocation.tryParse ("minecraft:block/stripped_mangrove_log"));

        stairsBlock ((StairBlock) modWoodBlocks.BAMBOO_BLOCK_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/bamboo_block"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_bamboo_block"));

        stairsBlock ((StairBlock) modWoodBlocks.WARPED_STEM_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/warped_stem"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_warped_stem"));

        stairsBlock ((StairBlock) modWoodBlocks.CRIMSON_STEM_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/crimson_stem"));
        stairsBlock ((StairBlock) modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get (),  ResourceLocation.tryParse ("minecraft:block/stripped_crimson_stem"));

    }

    public BlockModelBuilder modWallBlock(WallBlock block, ResourceLocation texture){
        wallBlock(block, Objects.requireNonNull (ForgeRegistries.BLOCKS.getKey (block)).getPath(), texture);
        return models ().wallInventory (Objects.requireNonNull (ForgeRegistries.BLOCKS.getKey (block)).getPath() + "_inventory", texture);
    }
    
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
