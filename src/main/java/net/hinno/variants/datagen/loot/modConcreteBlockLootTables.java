package net.hinno.variants.datagen.loot;

import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static java.util.Arrays.stream;

public class modConcreteBlockLootTables extends BlockLootSubProvider {
  public modConcreteBlockLootTables() {
  super (Set.of (), FeatureFlags.REGISTRY.allFlags ());
  }

  @Override
  protected void generate() {
        //concretes
      this.add (modConcreteBlocks.WHITE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.WHITE_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.WHITE_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.WHITE_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.GRAY_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.GRAY_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.GRAY_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.GRAY_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.BLACK_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.BLACK_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.BLACK_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.BLACK_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.BROWN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.BROWN_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.BROWN_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.BROWN_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.RED_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.RED_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.RED_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.RED_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.ORANGE_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.YELLOW_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.LIME_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.LIME_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.LIME_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.LIME_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.GREEN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.GREEN_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.GREEN_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.GREEN_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.CYAN_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.CYAN_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.CYAN_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.CYAN_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.BLUE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.BLUE_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.BLUE_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.BLUE_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.PURPLE_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.MAGENTA_CONCRETE_WALL.get ());

      this.add (modConcreteBlocks.PINK_CONCRETE_SLAB.get (),
              block->createSlabItemTable (modConcreteBlocks.PINK_CONCRETE_SLAB.get ()));
      this.dropSelf (modConcreteBlocks.PINK_CONCRETE_STAIRS.get ());
      this.dropSelf (modConcreteBlocks.PINK_CONCRETE_WALL.get ());
  }



  @Override
  protected Iterable<Block> getKnownBlocks() {
    return  modConcreteBlocks.BLOCKS.getEntries().stream ().map (RegistryObject::get)::iterator;
  }



}
