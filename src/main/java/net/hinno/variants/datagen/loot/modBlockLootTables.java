package net.hinno.variants.datagen.loot;

import net.hinno.variants.block.modBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class modBlockLootTables extends BlockLootSubProvider {
  public modBlockLootTables() {
  super (Set.of (), FeatureFlags.REGISTRY.allFlags ());
  }

  @Override
  protected void generate() {
        //concretes
      this.add (modBlocks.WHITE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.WHITE_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.WHITE_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.WHITE_CONCRETE_WALL.get ());

      this.add (modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.LIGHT_GRAY_CONCRETE_WALL.get ());

      this.add (modBlocks.GRAY_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.GRAY_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.GRAY_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.GRAY_CONCRETE_WALL.get ());

      this.add (modBlocks.BLACK_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.BLACK_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.BLACK_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.BLACK_CONCRETE_WALL.get ());

      this.add (modBlocks.BROWN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.BROWN_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.BROWN_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.BROWN_CONCRETE_WALL.get ());

      this.add (modBlocks.RED_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.RED_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.RED_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.RED_CONCRETE_WALL.get ());

      this.add (modBlocks.ORANGE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.ORANGE_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.ORANGE_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.ORANGE_CONCRETE_WALL.get ());

      this.add (modBlocks.YELLOW_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.YELLOW_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.YELLOW_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.YELLOW_CONCRETE_WALL.get ());

      this.add (modBlocks.LIME_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIME_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.LIME_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.LIME_CONCRETE_WALL.get ());

      this.add (modBlocks.GREEN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.GREEN_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.GREEN_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.GREEN_CONCRETE_WALL.get ());

      this.add (modBlocks.CYAN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.CYAN_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.CYAN_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.CYAN_CONCRETE_WALL.get ());

      this.add (modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.LIGHT_BLUE_CONCRETE_WALL.get ());

      this.add (modBlocks.BLUE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.BLUE_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.BLUE_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.BLUE_CONCRETE_WALL.get ());

      this.add (modBlocks.PURPLE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.PURPLE_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.PURPLE_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.PURPLE_CONCRETE_WALL.get ());

      this.add (modBlocks.MAGENTA_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.MAGENTA_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.MAGENTA_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.MAGENTA_CONCRETE_WALL.get ());

      this.add (modBlocks.PINK_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modBlocks.PINK_CONCRETE_SLAB.get ()));
      this.dropSelf (modBlocks.PINK_CONCRETE_STAIRS.get ());
      this.dropSelf (modBlocks.PINK_CONCRETE_WALL.get ());

      //terracottas
      this.add (modBlocks.TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.TERRACOTTA_WALL.get ());

      this.add (modBlocks.WHITE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.WHITE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.WHITE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.WHITE_TERRACOTTA_WALL.get ());

      this.add (modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ());

      this.add (modBlocks.GRAY_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.GRAY_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.GRAY_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.GRAY_TERRACOTTA_WALL.get ());

      this.add (modBlocks.BLACK_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.BLACK_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.BLACK_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.BLACK_TERRACOTTA_WALL.get ());

      this.add (modBlocks.BROWN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.BROWN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.BROWN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.BROWN_TERRACOTTA_WALL.get ());

      this.add (modBlocks.RED_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.RED_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.RED_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.RED_TERRACOTTA_WALL.get ());

      this.add (modBlocks.ORANGE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.ORANGE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.ORANGE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.ORANGE_TERRACOTTA_WALL.get ());

      this.add (modBlocks.YELLOW_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.YELLOW_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.YELLOW_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.YELLOW_TERRACOTTA_WALL.get ());

      this.add (modBlocks.LIME_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIME_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.LIME_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.LIME_TERRACOTTA_WALL.get ());

      this.add (modBlocks.GREEN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.GREEN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.GREEN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.GREEN_TERRACOTTA_WALL.get ());

      this.add (modBlocks.CYAN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.CYAN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.CYAN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.CYAN_TERRACOTTA_WALL.get ());

      this.add (modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ());

      this.add (modBlocks.BLUE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.BLUE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.BLUE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.BLUE_TERRACOTTA_WALL.get ());

      this.add (modBlocks.PURPLE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.PURPLE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.PURPLE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.PURPLE_TERRACOTTA_WALL.get ());

      this.add (modBlocks.MAGENTA_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.MAGENTA_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.MAGENTA_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.MAGENTA_TERRACOTTA_WALL.get ());

      this.add (modBlocks.PINK_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modBlocks.PINK_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modBlocks.PINK_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modBlocks.PINK_TERRACOTTA_WALL.get ());
  }

  @Override
  protected Iterable<Block> getKnownBlocks() {
  return modBlocks.BLOCKS.getEntries ().stream ().map (RegistryObject::get)::iterator;
  }
}
