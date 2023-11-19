package net.hinno.variants.datagen.loot;

import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class modTerracottaBlockLootTables extends BlockLootSubProvider {
  public modTerracottaBlockLootTables() {
  super (Set.of (), FeatureFlags.REGISTRY.allFlags ());
  }

  @Override
  protected void generate() {

      this.add (modTerracottaBlocks.TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.RED_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.LIME_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get ());

      this.add (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get (),
              block->createSlabItemTable (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get ()));
      this.dropSelf (modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get ());
      this.dropSelf (modTerracottaBlocks.PINK_TERRACOTTA_WALL.get ());
  }


  @Override
  protected Iterable<Block> getKnownBlocks() {
    return  modTerracottaBlocks.BLOCKS.getEntries().stream ().map (RegistryObject::get)::iterator;
  }

}
