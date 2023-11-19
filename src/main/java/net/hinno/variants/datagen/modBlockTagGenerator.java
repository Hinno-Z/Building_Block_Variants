package net.hinno.variants.datagen;

import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.variants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class modBlockTagGenerator extends BlockTagsProvider {
    public modBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super (output, lookupProvider, variants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag (BlockTags.MINEABLE_WITH_PICKAXE)
                .add (
                        //concretes
                    (modConcreteBlocks.WHITE_CONCRETE_STAIRS.get ()), (modConcreteBlocks.WHITE_CONCRETE_SLAB.get ()), (modConcreteBlocks.WHITE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ()), (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()), (modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.GRAY_CONCRETE_STAIRS.get ()), (modConcreteBlocks.GRAY_CONCRETE_SLAB.get ()), (modConcreteBlocks.GRAY_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BLACK_CONCRETE_STAIRS.get ()), (modConcreteBlocks.BLACK_CONCRETE_SLAB.get ()), (modConcreteBlocks.BLACK_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BROWN_CONCRETE_STAIRS.get ()), (modConcreteBlocks.BROWN_CONCRETE_SLAB.get ()), (modConcreteBlocks.BROWN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.RED_CONCRETE_STAIRS.get ()), (modConcreteBlocks.RED_CONCRETE_SLAB.get ()), (modConcreteBlocks.RED_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get ()), (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get ()), (modConcreteBlocks.ORANGE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get ()), (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get ()), (modConcreteBlocks.YELLOW_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIME_CONCRETE_STAIRS.get ()), (modConcreteBlocks.LIME_CONCRETE_SLAB.get ()), (modConcreteBlocks.LIME_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.GREEN_CONCRETE_STAIRS.get ()), (modConcreteBlocks.GREEN_CONCRETE_SLAB.get ()), (modConcreteBlocks.GREEN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.CYAN_CONCRETE_STAIRS.get ()), (modConcreteBlocks.CYAN_CONCRETE_SLAB.get ()), (modConcreteBlocks.CYAN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ()), (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()), (modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BLUE_CONCRETE_STAIRS.get ()), (modConcreteBlocks.BLUE_CONCRETE_SLAB.get ()), (modConcreteBlocks.BLUE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get ()), (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get ()), (modConcreteBlocks.PURPLE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get ()), (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get ()), (modConcreteBlocks.MAGENTA_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.PINK_CONCRETE_STAIRS.get ()), (modConcreteBlocks.PINK_CONCRETE_SLAB.get ()), (modConcreteBlocks.PINK_CONCRETE_WALL.get ()),
                        //terracottas
                    (modTerracottaBlocks.TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.RED_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.LIME_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get ()), (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get ()), (modTerracottaBlocks.PINK_TERRACOTTA_WALL.get ())
                );
        this.tag (BlockTags.MINEABLE_WITH_SHOVEL)
                .add (
                    (modClayBlocks.CLAY_STAIRS.get ()), (modClayBlocks.CLAY_SLAB.get ()), (modClayBlocks.CLAY_WALL.get ()),
                    (modClayBlocks.WHITE_CLAY.get ()), (modClayBlocks.WHITE_CLAY_STAIRS.get ()), (modClayBlocks.WHITE_CLAY_SLAB.get ()), (modClayBlocks.WHITE_CLAY_WALL.get ()),
                    (modClayBlocks.LIGHT_GRAY_CLAY.get ()), (modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get ()), (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get ()), (modClayBlocks.LIGHT_GRAY_CLAY_WALL.get ()),
                    (modClayBlocks.GRAY_CLAY.get ()), (modClayBlocks.GRAY_CLAY_STAIRS.get ()), (modClayBlocks.GRAY_CLAY_SLAB.get ()), (modClayBlocks.GRAY_CLAY_WALL.get ()),
                    (modClayBlocks.BLACK_CLAY.get ()), (modClayBlocks.BLACK_CLAY_STAIRS.get ()), (modClayBlocks.BLACK_CLAY_SLAB.get ()), (modClayBlocks.BLACK_CLAY_WALL.get ()),
                    (modClayBlocks.BROWN_CLAY.get ()), (modClayBlocks.BROWN_CLAY_STAIRS.get ()), (modClayBlocks.BROWN_CLAY_SLAB.get ()), (modClayBlocks.BROWN_CLAY_WALL.get ()),
                    (modClayBlocks.RED_CLAY.get ()), (modClayBlocks.RED_CLAY_STAIRS.get ()), (modClayBlocks.RED_CLAY_SLAB.get ()), (modClayBlocks.RED_CLAY_WALL.get ()),
                    (modClayBlocks.ORANGE_CLAY.get ()), (modClayBlocks.ORANGE_CLAY_STAIRS.get ()), (modClayBlocks.ORANGE_CLAY_SLAB.get ()), (modClayBlocks.ORANGE_CLAY_WALL.get ()),
                    (modClayBlocks.YELLOW_CLAY.get ()), (modClayBlocks.YELLOW_CLAY_STAIRS.get ()), (modClayBlocks.YELLOW_CLAY_SLAB.get ()), (modClayBlocks.YELLOW_CLAY_WALL.get ()),
                    (modClayBlocks.LIME_CLAY.get ()), (modClayBlocks.LIME_CLAY_STAIRS.get ()), (modClayBlocks.LIME_CLAY_SLAB.get ()), (modClayBlocks.LIME_CLAY_WALL.get ()),
                    (modClayBlocks.GREEN_CLAY.get ()),(modClayBlocks.GREEN_CLAY_STAIRS.get ()), (modClayBlocks.GREEN_CLAY_SLAB.get ()), (modClayBlocks.GREEN_CLAY_WALL.get ()),
                    (modClayBlocks.CYAN_CLAY.get ()),(modClayBlocks.CYAN_CLAY_STAIRS.get ()), (modClayBlocks.CYAN_CLAY_SLAB.get ()), (modClayBlocks.CYAN_CLAY_WALL.get ()),
                    (modClayBlocks.LIGHT_BLUE_CLAY.get ()),(modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get ()), (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get ()), (modClayBlocks.LIGHT_BLUE_CLAY_WALL.get ()),
                    (modClayBlocks.BLUE_CLAY.get ()),(modClayBlocks.BLUE_CLAY_STAIRS.get ()), (modClayBlocks.BLUE_CLAY_SLAB.get ()), (modClayBlocks.BLUE_CLAY_WALL.get ()),
                    (modClayBlocks.PURPLE_CLAY.get ()),(modClayBlocks.PURPLE_CLAY_STAIRS.get ()), (modClayBlocks.PURPLE_CLAY_SLAB.get ()), (modClayBlocks.PURPLE_CLAY_WALL.get ()),
                    (modClayBlocks.MAGENTA_CLAY.get ()),(modClayBlocks.MAGENTA_CLAY_STAIRS.get ()), (modClayBlocks.MAGENTA_CLAY_SLAB.get ()), (modClayBlocks.MAGENTA_CLAY_WALL.get ()),
                    (modClayBlocks.PINK_CLAY.get ()),(modClayBlocks.PINK_CLAY_STAIRS.get ()), (modClayBlocks.PINK_CLAY_SLAB.get ()), (modClayBlocks.PINK_CLAY_WALL.get ())
                );
        this.tag (BlockTags.SLABS)
                .add (
                        //concretes
                    (modConcreteBlocks.PINK_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.BLUE_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.CYAN_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.GREEN_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.LIME_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.RED_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.BROWN_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.BLACK_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.GRAY_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()),
                    (modConcreteBlocks.WHITE_CONCRETE_SLAB.get ()),
                        //terracottas
                    (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get ()),
                    (modTerracottaBlocks.TERRACOTTA_SLAB.get ()),
                        //clays
                    (modClayBlocks.PINK_CLAY_SLAB.get ()),
                    (modClayBlocks.MAGENTA_CLAY_SLAB.get ()),
                    (modClayBlocks.PURPLE_CLAY_SLAB.get ()),
                    (modClayBlocks.BLUE_CLAY_SLAB.get ()),
                    (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get ()),
                    (modClayBlocks.CYAN_CLAY_SLAB.get ()),
                    (modClayBlocks.GREEN_CLAY_SLAB.get ()),
                    (modClayBlocks.LIME_CLAY_SLAB.get ()),
                    (modClayBlocks.YELLOW_CLAY_SLAB.get ()),
                    (modClayBlocks.ORANGE_CLAY_SLAB.get ()),
                    (modClayBlocks.RED_CLAY_SLAB.get ()),
                    (modClayBlocks.BROWN_CLAY_SLAB.get ()),
                    (modClayBlocks.BLACK_CLAY_SLAB.get ()),
                    (modClayBlocks.GRAY_CLAY_SLAB.get ()),
                    (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get ()),
                    (modClayBlocks.WHITE_CLAY_SLAB.get ()),
                    (modClayBlocks.CLAY_SLAB.get ())
                );
        this.tag (BlockTags.STAIRS)
                .add (
                        //concretes
                    (modConcreteBlocks.PINK_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.BLUE_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.CYAN_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.GREEN_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.LIME_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.RED_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.BROWN_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.BLACK_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.GRAY_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ()),
                    (modConcreteBlocks.WHITE_CONCRETE_STAIRS.get ()),
                        //terracottas
                    (modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get ()),
                    (modTerracottaBlocks.TERRACOTTA_STAIRS.get ()),
                        //clays
                    (modClayBlocks.PINK_CLAY_STAIRS.get ()),
                    (modClayBlocks.MAGENTA_CLAY_STAIRS.get ()),
                    (modClayBlocks.PURPLE_CLAY_STAIRS.get ()),
                    (modClayBlocks.BLUE_CLAY_STAIRS.get ()),
                    (modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get ()),
                    (modClayBlocks.CYAN_CLAY_STAIRS.get ()),
                    (modClayBlocks.GREEN_CLAY_STAIRS.get ()),
                    (modClayBlocks.LIME_CLAY_STAIRS.get ()),
                    (modClayBlocks.YELLOW_CLAY_STAIRS.get ()),
                    (modClayBlocks.ORANGE_CLAY_STAIRS.get ()),
                    (modClayBlocks.RED_CLAY_STAIRS.get ()),
                    (modClayBlocks.BROWN_CLAY_STAIRS.get ()),
                    (modClayBlocks.BLACK_CLAY_STAIRS.get ()),
                    (modClayBlocks.GRAY_CLAY_STAIRS.get ()),
                    (modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get ()),
                    (modClayBlocks.WHITE_CLAY_STAIRS.get ()),
                    (modClayBlocks.CLAY_STAIRS.get ())
                );
        this.tag (BlockTags.WALLS)
                .add (
                        //concretes
                    (modConcreteBlocks.PINK_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.MAGENTA_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.PURPLE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BLUE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.CYAN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.GREEN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIME_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.YELLOW_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.ORANGE_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.RED_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BROWN_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.BLACK_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.GRAY_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get ()),
                    (modConcreteBlocks.WHITE_CONCRETE_WALL.get ()),
                        //terracottas
                    (modTerracottaBlocks.PINK_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIME_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.RED_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get ()),
                    (modTerracottaBlocks.TERRACOTTA_WALL.get ()),
                        //clays
                    (modClayBlocks.PINK_CLAY_WALL.get ()),
                    (modClayBlocks.MAGENTA_CLAY_WALL.get ()),
                    (modClayBlocks.PURPLE_CLAY_WALL.get ()),
                    (modClayBlocks.BLUE_CLAY_WALL.get ()),
                    (modClayBlocks.LIGHT_BLUE_CLAY_WALL.get ()),
                    (modClayBlocks.CYAN_CLAY_WALL.get ()),
                    (modClayBlocks.GREEN_CLAY_WALL.get ()),
                    (modClayBlocks.LIME_CLAY_WALL.get ()),
                    (modClayBlocks.YELLOW_CLAY_WALL.get ()),
                    (modClayBlocks.ORANGE_CLAY_WALL.get ()),
                    (modClayBlocks.RED_CLAY_WALL.get ()),
                    (modClayBlocks.BROWN_CLAY_WALL.get ()),
                    (modClayBlocks.BLACK_CLAY_WALL.get ()),
                    (modClayBlocks.GRAY_CLAY_WALL.get ()),
                    (modClayBlocks.LIGHT_GRAY_CLAY_WALL.get ()),
                    (modClayBlocks.WHITE_CLAY_WALL.get ()),
                    (modClayBlocks.CLAY_WALL.get ())
                );
    }
}
