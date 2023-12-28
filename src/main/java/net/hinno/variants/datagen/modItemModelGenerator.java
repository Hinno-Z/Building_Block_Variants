package net.hinno.variants.datagen;

import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modWoodBlocks;
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
        BlockItem(modConcreteBlocks.PINK_CONCRETE_SLAB); BlockItem(modConcreteBlocks.MAGENTA_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.PURPLE_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.BLUE_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.CYAN_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.GREEN_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.LIME_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.YELLOW_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.ORANGE_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.RED_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.BROWN_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.BLACK_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.GRAY_CONCRETE_SLAB);
        BlockItem(modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB);   BlockItem(modConcreteBlocks.WHITE_CONCRETE_SLAB);
        //stairs
        BlockItem(modConcreteBlocks.PINK_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.MAGENTA_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.PURPLE_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.BLUE_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.CYAN_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.GREEN_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.LIME_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.YELLOW_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.ORANGE_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.RED_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.BROWN_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.BLACK_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.GRAY_CONCRETE_STAIRS);
        BlockItem(modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS);   BlockItem(modConcreteBlocks.WHITE_CONCRETE_STAIRS);
        //walls
        WallBlockItem(modConcreteBlocks.PINK_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.MAGENTA_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.PURPLE_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.BLUE_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.CYAN_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.GREEN_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.LIME_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.YELLOW_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.ORANGE_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.RED_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.BROWN_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.BLACK_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.GRAY_CONCRETE_WALL);
        WallBlockItem(modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL);  WallBlockItem(modConcreteBlocks.WHITE_CONCRETE_WALL);
    //terracottas
        //slabs
        BlockItem(modTerracottaBlocks.PINK_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.BLUE_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.CYAN_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.GREEN_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.LIME_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.RED_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.BROWN_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.BLACK_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.GRAY_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);   BlockItem(modTerracottaBlocks.WHITE_TERRACOTTA_SLAB);
        BlockItem(modTerracottaBlocks.TERRACOTTA_SLAB);
        //stairs
        BlockItem(modTerracottaBlocks.PINK_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.LIME_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.RED_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);   BlockItem(modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS);
        BlockItem(modTerracottaBlocks.TERRACOTTA_STAIRS);
        //walls
        WallBlockItem(modTerracottaBlocks.PINK_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.PURPLE_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.BLUE_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.CYAN_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.GREEN_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.LIME_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.YELLOW_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.ORANGE_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.RED_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.BROWN_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.BLACK_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.GRAY_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL);  WallBlockItem(modTerracottaBlocks.WHITE_TERRACOTTA_WALL);
        WallBlockItem(modTerracottaBlocks.TERRACOTTA_WALL);

    //Clays
        //slabs
        BlockItem(modClayBlocks.PINK_CLAY_SLAB);   BlockItem(modClayBlocks.MAGENTA_CLAY_SLAB);
        BlockItem(modClayBlocks.PURPLE_CLAY_SLAB);   BlockItem(modClayBlocks.BLUE_CLAY_SLAB);
        BlockItem(modClayBlocks.LIGHT_BLUE_CLAY_SLAB);   BlockItem(modClayBlocks.CYAN_CLAY_SLAB);
        BlockItem(modClayBlocks.GREEN_CLAY_SLAB);   BlockItem(modClayBlocks.LIME_CLAY_SLAB);
        BlockItem(modClayBlocks.YELLOW_CLAY_SLAB);   BlockItem(modClayBlocks.ORANGE_CLAY_SLAB);
        BlockItem(modClayBlocks.RED_CLAY_SLAB);   BlockItem(modClayBlocks.BROWN_CLAY_SLAB);
        BlockItem(modClayBlocks.BLACK_CLAY_SLAB);   BlockItem(modClayBlocks.GRAY_CLAY_SLAB);
        BlockItem(modClayBlocks.LIGHT_GRAY_CLAY_SLAB);   BlockItem(modClayBlocks.WHITE_CLAY_SLAB);
        BlockItem(modClayBlocks.CLAY_SLAB);
        //stairs
        BlockItem(modClayBlocks.PINK_CLAY_STAIRS);   BlockItem(modClayBlocks.MAGENTA_CLAY_STAIRS);
        BlockItem(modClayBlocks.PURPLE_CLAY_STAIRS);   BlockItem(modClayBlocks.BLUE_CLAY_STAIRS);
        BlockItem(modClayBlocks.LIGHT_BLUE_CLAY_STAIRS);   BlockItem(modClayBlocks.CYAN_CLAY_STAIRS);
        BlockItem(modClayBlocks.GREEN_CLAY_STAIRS);   BlockItem(modClayBlocks.LIME_CLAY_STAIRS);
        BlockItem(modClayBlocks.YELLOW_CLAY_STAIRS);   BlockItem(modClayBlocks.ORANGE_CLAY_STAIRS);
        BlockItem(modClayBlocks.RED_CLAY_STAIRS);   BlockItem(modClayBlocks.BROWN_CLAY_STAIRS);
        BlockItem(modClayBlocks.BLACK_CLAY_STAIRS);   BlockItem(modClayBlocks.GRAY_CLAY_STAIRS);
        BlockItem(modClayBlocks.LIGHT_GRAY_CLAY_STAIRS);   BlockItem(modClayBlocks.WHITE_CLAY_STAIRS);
        BlockItem(modClayBlocks.CLAY_STAIRS);
        //walls
        WallBlockItem(modClayBlocks.PINK_CLAY_WALL);  WallBlockItem(modClayBlocks.MAGENTA_CLAY_WALL);
        WallBlockItem(modClayBlocks.PURPLE_CLAY_WALL);  WallBlockItem(modClayBlocks.BLUE_CLAY_WALL);
        WallBlockItem(modClayBlocks.LIGHT_BLUE_CLAY_WALL);  WallBlockItem(modClayBlocks.CYAN_CLAY_WALL);
        WallBlockItem(modClayBlocks.GREEN_CLAY_WALL);  WallBlockItem(modClayBlocks.LIME_CLAY_WALL);
        WallBlockItem(modClayBlocks.YELLOW_CLAY_WALL);  WallBlockItem(modClayBlocks.ORANGE_CLAY_WALL);
        WallBlockItem(modClayBlocks.RED_CLAY_WALL);  WallBlockItem(modClayBlocks.BROWN_CLAY_WALL);
        WallBlockItem(modClayBlocks.BLACK_CLAY_WALL);  WallBlockItem(modClayBlocks.GRAY_CLAY_WALL);
        WallBlockItem(modClayBlocks.LIGHT_GRAY_CLAY_WALL);  WallBlockItem(modClayBlocks.WHITE_CLAY_WALL);
        WallBlockItem(modClayBlocks.CLAY_WALL);

    //Woods
        //walls
        WallBlockItem(modWoodBlocks.OAK_PLANKS_WALL);  WallBlockItem(modWoodBlocks.OAK_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_OAK_LOG_WALL);
        WallBlockItem(modWoodBlocks.BIRCH_PLANKS_WALL);  WallBlockItem(modWoodBlocks.BIRCH_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_BIRCH_LOG_WALL);
        WallBlockItem(modWoodBlocks.SPRUCE_PLANKS_WALL);  WallBlockItem(modWoodBlocks.SPRUCE_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL);
        WallBlockItem(modWoodBlocks.DARK_OAK_PLANKS_WALL);  WallBlockItem(modWoodBlocks.DARK_OAK_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL);
        WallBlockItem(modWoodBlocks.ACACIA_PLANKS_WALL);  WallBlockItem(modWoodBlocks.ACACIA_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_ACACIA_LOG_WALL);
        WallBlockItem(modWoodBlocks.JUNGLE_PLANKS_WALL);  WallBlockItem(modWoodBlocks.JUNGLE_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL);
        WallBlockItem(modWoodBlocks.MANGROVE_PLANKS_WALL);  WallBlockItem(modWoodBlocks.MANGROVE_LOG_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL);
        WallBlockItem(modWoodBlocks.BAMBOO_PLANKS_WALL);  WallBlockItem(modWoodBlocks.BAMBOO_BLOCK_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL);
        WallBlockItem(modWoodBlocks.WARPED_PLANKS_WALL);  WallBlockItem(modWoodBlocks.WARPED_STEM_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_WARPED_STEM_WALL);
        WallBlockItem(modWoodBlocks.CRIMSON_PLANKS_WALL);  WallBlockItem(modWoodBlocks.CRIMSON_STEM_WALL);  WallBlockItem(modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL);
        //log stairs
        BlockItem(modWoodBlocks.OAK_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_OAK_LOG_STAIRS);
        BlockItem(modWoodBlocks.BIRCH_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS);
        BlockItem(modWoodBlocks.SPRUCE_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS);
        BlockItem(modWoodBlocks.DARK_OAK_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS);
        BlockItem(modWoodBlocks.ACACIA_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS);
        BlockItem(modWoodBlocks.JUNGLE_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS);
        BlockItem(modWoodBlocks.MANGROVE_LOG_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS);
        BlockItem(modWoodBlocks.BAMBOO_BLOCK_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS);
        BlockItem(modWoodBlocks.WARPED_STEM_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS);
        BlockItem(modWoodBlocks.CRIMSON_STEM_STAIRS);   BlockItem(modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS);
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
