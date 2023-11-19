package net.hinno.variants.datagen.loot;

import net.hinno.variants.block.modClayBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class modClayBlockLootTables extends BlockLootSubProvider {
  public modClayBlockLootTables() {
  super (Set.of (), FeatureFlags.REGISTRY.allFlags ());
  }

  @Override
  protected void generate() {

      this.add (modClayBlocks.CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.CLAY_WALL.get ());

      this.add (modClayBlocks.WHITE_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.WHITE_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.WHITE_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.WHITE_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.WHITE_CLAY.get ());

      this.add (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.LIGHT_GRAY_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.LIGHT_GRAY_CLAY.get ());

      this.add (modClayBlocks.GRAY_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.GRAY_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.GRAY_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.GRAY_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.GRAY_CLAY.get ());

      this.add (modClayBlocks.BLACK_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.BLACK_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.BLACK_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.BLACK_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.BLACK_CLAY.get ());

      this.add (modClayBlocks.BROWN_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.BROWN_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.BROWN_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.BROWN_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.BROWN_CLAY.get ());

      this.add (modClayBlocks.RED_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.RED_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.RED_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.RED_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.RED_CLAY.get ());

      this.add (modClayBlocks.ORANGE_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.ORANGE_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.ORANGE_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.ORANGE_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.ORANGE_CLAY.get ());

      this.add (modClayBlocks.YELLOW_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.YELLOW_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.YELLOW_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.YELLOW_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.YELLOW_CLAY.get ());

      this.add (modClayBlocks.LIME_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.LIME_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.LIME_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.LIME_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.LIME_CLAY.get ());

      this.add (modClayBlocks.GREEN_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.GREEN_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.GREEN_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.GREEN_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.GREEN_CLAY.get ());

      this.add (modClayBlocks.CYAN_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.CYAN_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.CYAN_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.CYAN_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.CYAN_CLAY.get ());

      this.add (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.LIGHT_BLUE_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.LIGHT_BLUE_CLAY.get ());

      this.add (modClayBlocks.BLUE_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.BLUE_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.BLUE_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.BLUE_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.BLUE_CLAY.get ());

      this.add (modClayBlocks.PURPLE_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.PURPLE_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.PURPLE_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.PURPLE_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.PURPLE_CLAY.get ());

      this.add (modClayBlocks.MAGENTA_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.MAGENTA_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.MAGENTA_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.MAGENTA_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.MAGENTA_CLAY.get ());

      this.add (modClayBlocks.PINK_CLAY_SLAB.get (),
              block->createSlabItemTable (modClayBlocks.PINK_CLAY_SLAB.get ()));
      this.dropSelf (modClayBlocks.PINK_CLAY_STAIRS.get ());
      this.dropSelf (modClayBlocks.PINK_CLAY_WALL.get ());
      this.dropSelf (modClayBlocks.PINK_CLAY.get ());
  }


  @Override
  protected Iterable<Block> getKnownBlocks() {
    return  modClayBlocks.BLOCKS.getEntries().stream ().map (RegistryObject::get)::iterator;
  }

}
