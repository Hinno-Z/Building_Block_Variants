package net.hinno.variants.datagen;

import net.hinno.variants.block.modBlocks;
import net.hinno.variants.variants;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItemModelGenerator extends ItemModelProvider {
    public modItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super (output, variants.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
    //concretes
        // slabs
        BlockItem(modBlocks.PINK_CONCRETE_SLAB);
        BlockItem(modBlocks.MAGENTA_CONCRETE_SLAB);
        BlockItem(modBlocks.PURPLE_CONCRETE_SLAB);
        BlockItem(modBlocks.BLUE_CONCRETE_SLAB);
        BlockItem(modBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        BlockItem(modBlocks.CYAN_CONCRETE_SLAB);
        BlockItem(modBlocks.GREEN_CONCRETE_SLAB);
        BlockItem(modBlocks.LIME_CONCRETE_SLAB);
        BlockItem(modBlocks.YELLOW_CONCRETE_SLAB);
        BlockItem(modBlocks.ORANGE_CONCRETE_SLAB);
        BlockItem(modBlocks.RED_CONCRETE_SLAB);
        BlockItem(modBlocks.BROWN_CONCRETE_SLAB);
        BlockItem(modBlocks.BLACK_CONCRETE_SLAB);
        BlockItem(modBlocks.GRAY_CONCRETE_SLAB);
        BlockItem(modBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        BlockItem(modBlocks.WHITE_CONCRETE_SLAB);
        //stairs
        BlockItem(modBlocks.PINK_CONCRETE_STAIRS);
        BlockItem(modBlocks.MAGENTA_CONCRETE_STAIRS);
        BlockItem(modBlocks.PURPLE_CONCRETE_STAIRS);
        BlockItem(modBlocks.BLUE_CONCRETE_STAIRS);
        BlockItem(modBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        BlockItem(modBlocks.CYAN_CONCRETE_STAIRS);
        BlockItem(modBlocks.GREEN_CONCRETE_STAIRS);
        BlockItem(modBlocks.LIME_CONCRETE_STAIRS);
        BlockItem(modBlocks.YELLOW_CONCRETE_STAIRS);
        BlockItem(modBlocks.ORANGE_CONCRETE_STAIRS);
        BlockItem(modBlocks.RED_CONCRETE_STAIRS);
        BlockItem(modBlocks.BROWN_CONCRETE_STAIRS);
        BlockItem(modBlocks.BLACK_CONCRETE_STAIRS);
        BlockItem(modBlocks.GRAY_CONCRETE_STAIRS);
        BlockItem(modBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        BlockItem(modBlocks.WHITE_CONCRETE_STAIRS);
        //walls
        WallBlockItem(modBlocks.PINK_CONCRETE_WALL);
        WallBlockItem(modBlocks.MAGENTA_CONCRETE_WALL);
        WallBlockItem(modBlocks.PURPLE_CONCRETE_WALL);
        WallBlockItem(modBlocks.BLUE_CONCRETE_WALL);
        WallBlockItem(modBlocks.LIGHT_BLUE_CONCRETE_WALL);
        WallBlockItem(modBlocks.CYAN_CONCRETE_WALL);
        WallBlockItem(modBlocks.GREEN_CONCRETE_WALL);
        WallBlockItem(modBlocks.LIME_CONCRETE_WALL);
        WallBlockItem(modBlocks.YELLOW_CONCRETE_WALL);
        WallBlockItem(modBlocks.ORANGE_CONCRETE_WALL);
        WallBlockItem(modBlocks.RED_CONCRETE_WALL);
        WallBlockItem(modBlocks.BROWN_CONCRETE_WALL);
        WallBlockItem(modBlocks.BLACK_CONCRETE_WALL);
        WallBlockItem(modBlocks.GRAY_CONCRETE_WALL);
        WallBlockItem(modBlocks.LIGHT_GRAY_CONCRETE_WALL);
        WallBlockItem(modBlocks.WHITE_CONCRETE_WALL);
    //terracottas
        //slabs
        BlockItem(modBlocks.PINK_TERRACOTTA_SLAB);
        BlockItem(modBlocks.MAGENTA_TERRACOTTA_SLAB);
        BlockItem(modBlocks.PURPLE_TERRACOTTA_SLAB);
        BlockItem(modBlocks.BLUE_TERRACOTTA_SLAB);
        BlockItem(modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        BlockItem(modBlocks.CYAN_TERRACOTTA_SLAB);
        BlockItem(modBlocks.GREEN_TERRACOTTA_SLAB);
        BlockItem(modBlocks.LIME_TERRACOTTA_SLAB);
        BlockItem(modBlocks.YELLOW_TERRACOTTA_SLAB);
        BlockItem(modBlocks.ORANGE_TERRACOTTA_SLAB);
        BlockItem(modBlocks.RED_TERRACOTTA_SLAB);
        BlockItem(modBlocks.BROWN_TERRACOTTA_SLAB);
        BlockItem(modBlocks.BLACK_TERRACOTTA_SLAB);
        BlockItem(modBlocks.GRAY_TERRACOTTA_SLAB);
        BlockItem(modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        BlockItem(modBlocks.WHITE_TERRACOTTA_SLAB);
        BlockItem(modBlocks.TERRACOTTA_SLAB);
        //stairs
        BlockItem(modBlocks.PINK_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.MAGENTA_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.PURPLE_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.BLUE_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.CYAN_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.GREEN_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.LIME_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.YELLOW_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.ORANGE_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.RED_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.BROWN_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.BLACK_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.GRAY_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.WHITE_TERRACOTTA_STAIRS);
        BlockItem(modBlocks.TERRACOTTA_STAIRS);
        //walls
        WallBlockItem(modBlocks.PINK_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.MAGENTA_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.PURPLE_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.BLUE_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.CYAN_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.GREEN_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.LIME_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.YELLOW_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.ORANGE_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.RED_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.BROWN_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.BLACK_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.GRAY_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.WHITE_TERRACOTTA_WALL);
        WallBlockItem(modBlocks.TERRACOTTA_WALL);
    }


    public void BlockItem(RegistryObject<Block> block) {
        this.withExistingParent(variants.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void WallBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(variants.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_inventory"));
    }

}
