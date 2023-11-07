package net.hinno.variants.datagen;

import net.hinno.variants.block.modBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class modBlockStateGenerator extends BlockStateProvider {
    public modBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super (output, variants.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //concretes
        stairsBlock ((StairBlock) modBlocks.WHITE_CONCRETE_STAIRS.get (), blockTexture (Blocks.WHITE_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.WHITE_CONCRETE_SLAB.get (), blockTexture (Blocks.WHITE_CONCRETE), blockTexture (Blocks.WHITE_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.WHITE_CONCRETE_WALL.get (),blockTexture (Blocks.WHITE_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIGHT_GRAY_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (), blockTexture (Blocks.LIGHT_GRAY_CONCRETE), blockTexture (Blocks.LIGHT_GRAY_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.LIGHT_GRAY_CONCRETE_WALL.get (),blockTexture (Blocks.LIGHT_GRAY_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.GRAY_CONCRETE_STAIRS.get (), blockTexture (Blocks.GRAY_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.GRAY_CONCRETE_SLAB.get (), blockTexture (Blocks.GRAY_CONCRETE), blockTexture (Blocks.GRAY_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.GRAY_CONCRETE_WALL.get (),blockTexture (Blocks.GRAY_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.BLACK_CONCRETE_STAIRS.get (), blockTexture (Blocks.BLACK_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.BLACK_CONCRETE_SLAB.get (), blockTexture (Blocks.BLACK_CONCRETE), blockTexture (Blocks.BLACK_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.BLACK_CONCRETE_WALL.get (),blockTexture (Blocks.BLACK_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.BROWN_CONCRETE_STAIRS.get (), blockTexture (Blocks.BROWN_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.BROWN_CONCRETE_SLAB.get (), blockTexture (Blocks.BROWN_CONCRETE), blockTexture (Blocks.BROWN_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.BROWN_CONCRETE_WALL.get (),blockTexture (Blocks.BROWN_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.RED_CONCRETE_STAIRS.get (), blockTexture (Blocks.RED_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.RED_CONCRETE_SLAB.get (), blockTexture (Blocks.RED_CONCRETE), blockTexture (Blocks.RED_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.RED_CONCRETE_WALL.get (),blockTexture (Blocks.RED_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.ORANGE_CONCRETE_STAIRS.get (), blockTexture (Blocks.ORANGE_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.ORANGE_CONCRETE_SLAB.get (), blockTexture (Blocks.ORANGE_CONCRETE), blockTexture (Blocks.ORANGE_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.ORANGE_CONCRETE_WALL.get (),blockTexture (Blocks.ORANGE_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.YELLOW_CONCRETE_STAIRS.get (), blockTexture (Blocks.YELLOW_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.YELLOW_CONCRETE_SLAB.get (), blockTexture (Blocks.YELLOW_CONCRETE), blockTexture (Blocks.YELLOW_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.YELLOW_CONCRETE_WALL.get (),blockTexture (Blocks.YELLOW_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.LIME_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIME_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.LIME_CONCRETE_SLAB.get (), blockTexture (Blocks.LIME_CONCRETE), blockTexture (Blocks.LIME_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.LIME_CONCRETE_WALL.get (),blockTexture (Blocks.LIME_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.GREEN_CONCRETE_STAIRS.get (), blockTexture (Blocks.GREEN_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.GREEN_CONCRETE_SLAB.get (), blockTexture (Blocks.GREEN_CONCRETE), blockTexture (Blocks.GREEN_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.GREEN_CONCRETE_WALL.get (),blockTexture (Blocks.GREEN_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.CYAN_CONCRETE_STAIRS.get (), blockTexture (Blocks.CYAN_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.CYAN_CONCRETE_SLAB.get (), blockTexture (Blocks.CYAN_CONCRETE), blockTexture (Blocks.CYAN_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.CYAN_CONCRETE_WALL.get (),blockTexture (Blocks.CYAN_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get (), blockTexture (Blocks.LIGHT_BLUE_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (), blockTexture (Blocks.LIGHT_BLUE_CONCRETE), blockTexture (Blocks.LIGHT_BLUE_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.LIGHT_BLUE_CONCRETE_WALL.get (),blockTexture (Blocks.LIGHT_BLUE_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.BLUE_CONCRETE_STAIRS.get (), blockTexture (Blocks.BLUE_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.BLUE_CONCRETE_SLAB.get (), blockTexture (Blocks.BLUE_CONCRETE), blockTexture (Blocks.BLUE_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.BLUE_CONCRETE_WALL.get (),blockTexture (Blocks.BLUE_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.PURPLE_CONCRETE_STAIRS.get (), blockTexture (Blocks.PURPLE_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.PURPLE_CONCRETE_SLAB.get (), blockTexture (Blocks.PURPLE_CONCRETE), blockTexture (Blocks.PURPLE_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.PURPLE_CONCRETE_WALL.get (),blockTexture (Blocks.PURPLE_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.MAGENTA_CONCRETE_STAIRS.get (), blockTexture (Blocks.MAGENTA_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.MAGENTA_CONCRETE_SLAB.get (), blockTexture (Blocks.MAGENTA_CONCRETE), blockTexture (Blocks.MAGENTA_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.MAGENTA_CONCRETE_WALL.get (),blockTexture (Blocks.MAGENTA_CONCRETE));

        stairsBlock ((StairBlock) modBlocks.PINK_CONCRETE_STAIRS.get (), blockTexture (Blocks.PINK_CONCRETE));
        slabBlock ((SlabBlock) modBlocks.PINK_CONCRETE_SLAB.get (), blockTexture (Blocks.PINK_CONCRETE), blockTexture (Blocks.PINK_CONCRETE));
        modWallBlock ((WallBlock) modBlocks.PINK_CONCRETE_WALL.get (),blockTexture (Blocks.PINK_CONCRETE));


        //terracottas
        stairsBlock ((StairBlock) modBlocks.TERRACOTTA_STAIRS.get (), blockTexture (Blocks.TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.TERRACOTTA_SLAB.get (), blockTexture (Blocks.TERRACOTTA), blockTexture (Blocks.TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.TERRACOTTA_WALL.get (),blockTexture (Blocks.TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.WHITE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.WHITE_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.WHITE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.WHITE_TERRACOTTA), blockTexture (Blocks.WHITE_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.WHITE_TERRACOTTA_WALL.get (),blockTexture (Blocks.WHITE_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIGHT_GRAY_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.GRAY_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.GRAY_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.GRAY_TERRACOTTA_SLAB.get (), blockTexture (Blocks.GRAY_TERRACOTTA), blockTexture (Blocks.GRAY_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.GRAY_TERRACOTTA_WALL.get (),blockTexture (Blocks.GRAY_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.BLACK_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BLACK_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.BLACK_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BLACK_TERRACOTTA), blockTexture (Blocks.BLACK_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.BLACK_TERRACOTTA_WALL.get (),blockTexture (Blocks.BLACK_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.BROWN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BROWN_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.BROWN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BROWN_TERRACOTTA), blockTexture (Blocks.BROWN_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.BROWN_TERRACOTTA_WALL.get (),blockTexture (Blocks.BROWN_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.RED_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.RED_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.RED_TERRACOTTA_SLAB.get (), blockTexture (Blocks.RED_TERRACOTTA), blockTexture (Blocks.RED_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.RED_TERRACOTTA_WALL.get (),blockTexture (Blocks.RED_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.ORANGE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.ORANGE_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.ORANGE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.ORANGE_TERRACOTTA), blockTexture (Blocks.ORANGE_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.ORANGE_TERRACOTTA_WALL.get (),blockTexture (Blocks.ORANGE_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.YELLOW_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.YELLOW_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.YELLOW_TERRACOTTA_SLAB.get (), blockTexture (Blocks.YELLOW_TERRACOTTA), blockTexture (Blocks.YELLOW_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.YELLOW_TERRACOTTA_WALL.get (),blockTexture (Blocks.YELLOW_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.LIME_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIME_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.LIME_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIME_TERRACOTTA), blockTexture (Blocks.LIME_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.LIME_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIME_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.GREEN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.GREEN_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.GREEN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.GREEN_TERRACOTTA), blockTexture (Blocks.GREEN_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.GREEN_TERRACOTTA_WALL.get (),blockTexture (Blocks.GREEN_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.CYAN_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.CYAN_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.CYAN_TERRACOTTA_SLAB.get (), blockTexture (Blocks.CYAN_TERRACOTTA), blockTexture (Blocks.CYAN_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.CYAN_TERRACOTTA_WALL.get (),blockTexture (Blocks.CYAN_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get (),blockTexture (Blocks.LIGHT_BLUE_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.BLUE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.BLUE_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.BLUE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.BLUE_TERRACOTTA), blockTexture (Blocks.BLUE_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.BLUE_TERRACOTTA_WALL.get (),blockTexture (Blocks.BLUE_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.PURPLE_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.PURPLE_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.PURPLE_TERRACOTTA_SLAB.get (), blockTexture (Blocks.PURPLE_TERRACOTTA), blockTexture (Blocks.PURPLE_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.PURPLE_TERRACOTTA_WALL.get (),blockTexture (Blocks.PURPLE_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.MAGENTA_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.MAGENTA_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.MAGENTA_TERRACOTTA_SLAB.get (), blockTexture (Blocks.MAGENTA_TERRACOTTA), blockTexture (Blocks.MAGENTA_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.MAGENTA_TERRACOTTA_WALL.get (),blockTexture (Blocks.MAGENTA_TERRACOTTA));

        stairsBlock ((StairBlock) modBlocks.PINK_TERRACOTTA_STAIRS.get (), blockTexture (Blocks.PINK_TERRACOTTA));
        slabBlock ((SlabBlock) modBlocks.PINK_TERRACOTTA_SLAB.get (), blockTexture (Blocks.PINK_TERRACOTTA), blockTexture (Blocks.PINK_TERRACOTTA));
        modWallBlock ((WallBlock) modBlocks.PINK_TERRACOTTA_WALL.get (),blockTexture (Blocks.PINK_TERRACOTTA));

    }






    public BlockModelBuilder modWallBlock(WallBlock block, ResourceLocation texture){
        wallBlock(block, Objects.requireNonNull (ForgeRegistries.BLOCKS.getKey (block)).getPath(), texture);
        return models ().wallInventory (Objects.requireNonNull (ForgeRegistries.BLOCKS.getKey (block)).getPath() + "_inventory", texture);
    }

}
