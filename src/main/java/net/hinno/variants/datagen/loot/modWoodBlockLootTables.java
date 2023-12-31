package net.hinno.variants.datagen.loot;

import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.block.modWoodBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class modWoodBlockLootTables extends BlockLootSubProvider {
  public modWoodBlockLootTables() {
  super (Set.of (), FeatureFlags.REGISTRY.allFlags ());
  }

    @Override
    protected void generate() {
        //log+planks
        this.dropSelf (modWoodBlocks.OAK_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.OAK_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.OAK_LOG_STAIRS.get ());
        this.add (modWoodBlocks.OAK_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.OAK_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.BIRCH_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.BIRCH_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.BIRCH_LOG_STAIRS.get ());
        this.add (modWoodBlocks.BIRCH_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.BIRCH_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.SPRUCE_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.SPRUCE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.SPRUCE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.SPRUCE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.SPRUCE_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.CHERRY_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.CHERRY_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.CHERRY_LOG_STAIRS.get ());
        this.add (modWoodBlocks.CHERRY_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.CHERRY_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.DARK_OAK_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.DARK_OAK_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.DARK_OAK_LOG_STAIRS.get ());
        this.add (modWoodBlocks.DARK_OAK_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.DARK_OAK_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.ACACIA_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.ACACIA_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.ACACIA_LOG_STAIRS.get ());
        this.add (modWoodBlocks.ACACIA_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.ACACIA_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.JUNGLE_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.JUNGLE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.JUNGLE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.JUNGLE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.JUNGLE_LOG_SLAB.get ()));

         this.dropSelf (modWoodBlocks.MANGROVE_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.MANGROVE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.MANGROVE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.MANGROVE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.MANGROVE_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.BAMBOO_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.BAMBOO_BLOCK_WALL.get ());
        this.dropSelf (modWoodBlocks.BAMBOO_BLOCK_STAIRS.get ());
        this.add (modWoodBlocks.BAMBOO_BLOCK_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.BAMBOO_BLOCK_SLAB.get ()));

        this.dropSelf (modWoodBlocks.WARPED_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.WARPED_STEM_WALL.get ());
        this.dropSelf (modWoodBlocks.WARPED_STEM_STAIRS.get ());
        this.add (modWoodBlocks.WARPED_STEM_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.WARPED_STEM_SLAB.get ()));

        this.dropSelf (modWoodBlocks.CRIMSON_PLANKS_WALL.get ());
        this.dropSelf (modWoodBlocks.CRIMSON_STEM_WALL.get ());
        this.dropSelf (modWoodBlocks.CRIMSON_STEM_STAIRS.get ());
        this.add (modWoodBlocks.CRIMSON_STEM_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.CRIMSON_STEM_SLAB.get ()));


        //stripped logs
        this.dropSelf (modWoodBlocks.STRIPPED_OAK_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_OAK_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_OAK_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_OAK_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_BIRCH_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_BIRCH_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_BIRCH_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_SPRUCE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_SPRUCE_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_DARK_OAK_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_CHERRY_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_CHERRY_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_CHERRY_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_CHERRY_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_ACACIA_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_ACACIA_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_ACACIA_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_JUNGLE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_JUNGLE_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_MANGROVE_LOG_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_MANGROVE_LOG_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_WARPED_STEM_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_WARPED_STEM_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_WARPED_STEM_SLAB.get ()));

        this.dropSelf (modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL.get ());
        this.dropSelf (modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get ());
        this.add (modWoodBlocks.STRIPPED_CRIMSON_STEM_SLAB.get (),
                block->createSlabItemTable (modWoodBlocks.STRIPPED_CRIMSON_STEM_SLAB.get ()));
   }

  @Override
  protected Iterable<Block> getKnownBlocks() {
    return  modWoodBlocks.BLOCKS.getEntries().stream ().map (RegistryObject::get)::iterator;
  }

}
