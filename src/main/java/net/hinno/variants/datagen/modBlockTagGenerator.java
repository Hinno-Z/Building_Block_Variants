package net.hinno.variants.datagen;

import net.hinno.variants.block.modBlocks;
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
                    (modBlocks.WHITE_CONCRETE_STAIRS.get ()), (modBlocks.WHITE_CONCRETE_SLAB.get ()), (modBlocks.WHITE_CONCRETE_WALL.get ()),
                    (modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ()), (modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()), (modBlocks.LIGHT_GRAY_CONCRETE_WALL.get ()),
                    (modBlocks.GRAY_CONCRETE_STAIRS.get ()), (modBlocks.GRAY_CONCRETE_SLAB.get ()), (modBlocks.GRAY_CONCRETE_WALL.get ()),
                    (modBlocks.BLACK_CONCRETE_STAIRS.get ()), (modBlocks.BLACK_CONCRETE_SLAB.get ()), (modBlocks.BLACK_CONCRETE_WALL.get ()),
                    (modBlocks.BROWN_CONCRETE_STAIRS.get ()), (modBlocks.BROWN_CONCRETE_SLAB.get ()), (modBlocks.BROWN_CONCRETE_WALL.get ()),
                    (modBlocks.RED_CONCRETE_STAIRS.get ()), (modBlocks.RED_CONCRETE_SLAB.get ()), (modBlocks.RED_CONCRETE_WALL.get ()),
                    (modBlocks.ORANGE_CONCRETE_STAIRS.get ()), (modBlocks.ORANGE_CONCRETE_SLAB.get ()), (modBlocks.ORANGE_CONCRETE_WALL.get ()),
                    (modBlocks.YELLOW_CONCRETE_STAIRS.get ()), (modBlocks.YELLOW_CONCRETE_SLAB.get ()), (modBlocks.YELLOW_CONCRETE_WALL.get ()),
                    (modBlocks.LIME_CONCRETE_STAIRS.get ()), (modBlocks.LIME_CONCRETE_SLAB.get ()), (modBlocks.LIME_CONCRETE_WALL.get ()),
                    (modBlocks.GREEN_CONCRETE_STAIRS.get ()), (modBlocks.GREEN_CONCRETE_SLAB.get ()), (modBlocks.GREEN_CONCRETE_WALL.get ()),
                    (modBlocks.CYAN_CONCRETE_STAIRS.get ()), (modBlocks.CYAN_CONCRETE_SLAB.get ()), (modBlocks.CYAN_CONCRETE_WALL.get ()),
                    (modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ()), (modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()), (modBlocks.LIGHT_BLUE_CONCRETE_WALL.get ()),
                    (modBlocks.BLUE_CONCRETE_STAIRS.get ()), (modBlocks.BLUE_CONCRETE_SLAB.get ()), (modBlocks.BLUE_CONCRETE_WALL.get ()),
                    (modBlocks.PURPLE_CONCRETE_STAIRS.get ()), (modBlocks.PURPLE_CONCRETE_SLAB.get ()), (modBlocks.PURPLE_CONCRETE_WALL.get ()),
                    (modBlocks.MAGENTA_CONCRETE_STAIRS.get ()), (modBlocks.MAGENTA_CONCRETE_SLAB.get ()), (modBlocks.MAGENTA_CONCRETE_WALL.get ()),
                    (modBlocks.PINK_CONCRETE_STAIRS.get ()), (modBlocks.PINK_CONCRETE_SLAB.get ()), (modBlocks.PINK_CONCRETE_WALL.get ()),
                        //terracottas
                    (modBlocks.TERRACOTTA_STAIRS.get ()), (modBlocks.TERRACOTTA_SLAB.get ()), (modBlocks.TERRACOTTA_WALL.get ()),
                    (modBlocks.WHITE_TERRACOTTA_STAIRS.get ()), (modBlocks.WHITE_TERRACOTTA_SLAB.get ()), (modBlocks.WHITE_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ()), (modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()), (modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ()),
                    (modBlocks.GRAY_TERRACOTTA_STAIRS.get ()), (modBlocks.GRAY_TERRACOTTA_SLAB.get ()), (modBlocks.GRAY_TERRACOTTA_WALL.get ()),
                    (modBlocks.BLACK_TERRACOTTA_STAIRS.get ()), (modBlocks.BLACK_TERRACOTTA_SLAB.get ()), (modBlocks.BLACK_TERRACOTTA_WALL.get ()),
                    (modBlocks.BROWN_TERRACOTTA_STAIRS.get ()), (modBlocks.BROWN_TERRACOTTA_SLAB.get ()), (modBlocks.BROWN_TERRACOTTA_WALL.get ()),
                    (modBlocks.RED_TERRACOTTA_STAIRS.get ()), (modBlocks.RED_TERRACOTTA_SLAB.get ()), (modBlocks.RED_TERRACOTTA_WALL.get ()),
                    (modBlocks.ORANGE_TERRACOTTA_STAIRS.get ()), (modBlocks.ORANGE_TERRACOTTA_SLAB.get ()), (modBlocks.ORANGE_TERRACOTTA_WALL.get ()),
                    (modBlocks.YELLOW_TERRACOTTA_STAIRS.get ()), (modBlocks.YELLOW_TERRACOTTA_SLAB.get ()), (modBlocks.YELLOW_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIME_TERRACOTTA_STAIRS.get ()), (modBlocks.LIME_TERRACOTTA_SLAB.get ()), (modBlocks.LIME_TERRACOTTA_WALL.get ()),
                    (modBlocks.GREEN_TERRACOTTA_STAIRS.get ()), (modBlocks.GREEN_TERRACOTTA_SLAB.get ()), (modBlocks.GREEN_TERRACOTTA_WALL.get ()),
                    (modBlocks.CYAN_TERRACOTTA_STAIRS.get ()), (modBlocks.CYAN_TERRACOTTA_SLAB.get ()), (modBlocks.CYAN_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ()), (modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()), (modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ()),
                    (modBlocks.BLUE_TERRACOTTA_STAIRS.get ()), (modBlocks.BLUE_TERRACOTTA_SLAB.get ()), (modBlocks.BLUE_TERRACOTTA_WALL.get ()),
                    (modBlocks.PURPLE_TERRACOTTA_STAIRS.get ()), (modBlocks.PURPLE_TERRACOTTA_SLAB.get ()), (modBlocks.PURPLE_TERRACOTTA_WALL.get ()),
                    (modBlocks.MAGENTA_TERRACOTTA_STAIRS.get ()), (modBlocks.MAGENTA_TERRACOTTA_SLAB.get ()), (modBlocks.MAGENTA_TERRACOTTA_WALL.get ()),
                    (modBlocks.PINK_TERRACOTTA_STAIRS.get ()), (modBlocks.PINK_TERRACOTTA_SLAB.get ()), (modBlocks.PINK_TERRACOTTA_WALL.get ())

                );
        this.tag (BlockTags.SLABS)
                .add (
                        //concretes
                    (modBlocks.PINK_CONCRETE_SLAB.get ()),
                    (modBlocks.MAGENTA_CONCRETE_SLAB.get ()),
                    (modBlocks.PURPLE_CONCRETE_SLAB.get ()),
                    (modBlocks.BLUE_CONCRETE_SLAB.get ()),
                    (modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ()),
                    (modBlocks.CYAN_CONCRETE_SLAB.get ()),
                    (modBlocks.GREEN_CONCRETE_SLAB.get ()),
                    (modBlocks.LIME_CONCRETE_SLAB.get ()),
                    (modBlocks.YELLOW_CONCRETE_SLAB.get ()),
                    (modBlocks.ORANGE_CONCRETE_SLAB.get ()),
                    (modBlocks.RED_CONCRETE_SLAB.get ()),
                    (modBlocks.BROWN_CONCRETE_SLAB.get ()),
                    (modBlocks.BLACK_CONCRETE_SLAB.get ()),
                    (modBlocks.GRAY_CONCRETE_SLAB.get ()),
                    (modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ()),
                    (modBlocks.WHITE_CONCRETE_SLAB.get ()),

                        //terracottas
                    (modBlocks.PINK_TERRACOTTA_SLAB.get ()),
                    (modBlocks.MAGENTA_TERRACOTTA_SLAB.get ()),
                    (modBlocks.PURPLE_TERRACOTTA_SLAB.get ()),
                    (modBlocks.BLUE_TERRACOTTA_SLAB.get ()),
                    (modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ()),
                    (modBlocks.CYAN_TERRACOTTA_SLAB.get ()),
                    (modBlocks.GREEN_TERRACOTTA_SLAB.get ()),
                    (modBlocks.LIME_TERRACOTTA_SLAB.get ()),
                    (modBlocks.YELLOW_TERRACOTTA_SLAB.get ()),
                    (modBlocks.ORANGE_TERRACOTTA_SLAB.get ()),
                    (modBlocks.RED_TERRACOTTA_SLAB.get ()),
                    (modBlocks.BROWN_TERRACOTTA_SLAB.get ()),
                    (modBlocks.BLACK_TERRACOTTA_SLAB.get ()),
                    (modBlocks.GRAY_TERRACOTTA_SLAB.get ()),
                    (modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ()),
                    (modBlocks.WHITE_TERRACOTTA_SLAB.get ()),
                    (modBlocks.TERRACOTTA_SLAB.get ())
                );

        this.tag (BlockTags.STAIRS)
                .add (
                        //concretes
                    (modBlocks.PINK_CONCRETE_STAIRS.get ()),
                    (modBlocks.MAGENTA_CONCRETE_STAIRS.get ()),
                    (modBlocks.PURPLE_CONCRETE_STAIRS.get ()),
                    (modBlocks.BLUE_CONCRETE_STAIRS.get ()),
                    (modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ()),
                    (modBlocks.CYAN_CONCRETE_STAIRS.get ()),
                    (modBlocks.GREEN_CONCRETE_STAIRS.get ()),
                    (modBlocks.LIME_CONCRETE_STAIRS.get ()),
                    (modBlocks.YELLOW_CONCRETE_STAIRS.get ()),
                    (modBlocks.ORANGE_CONCRETE_STAIRS.get ()),
                    (modBlocks.RED_CONCRETE_STAIRS.get ()),
                    (modBlocks.BROWN_CONCRETE_STAIRS.get ()),
                    (modBlocks.BLACK_CONCRETE_STAIRS.get ()),
                    (modBlocks.GRAY_CONCRETE_STAIRS.get ()),
                    (modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ()),
                    (modBlocks.WHITE_CONCRETE_STAIRS.get ()),
                        //terracottas
                    (modBlocks.PINK_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.MAGENTA_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.PURPLE_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.BLUE_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.CYAN_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.GREEN_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.LIME_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.YELLOW_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.ORANGE_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.RED_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.BROWN_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.BLACK_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.GRAY_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.WHITE_TERRACOTTA_STAIRS.get ()),
                    (modBlocks.TERRACOTTA_STAIRS.get ())
                );

        this.tag (BlockTags.WALLS)
                .add (
                        //concretes
                    (modBlocks.PINK_CONCRETE_WALL.get ()),
                    (modBlocks.MAGENTA_CONCRETE_WALL.get ()),
                    (modBlocks.PURPLE_CONCRETE_WALL.get ()),
                    (modBlocks.BLUE_CONCRETE_WALL.get ()),
                    (modBlocks.LIGHT_BLUE_CONCRETE_WALL.get ()),
                    (modBlocks.CYAN_CONCRETE_WALL.get ()),
                    (modBlocks.GREEN_CONCRETE_WALL.get ()),
                    (modBlocks.LIME_CONCRETE_WALL.get ()),
                    (modBlocks.YELLOW_CONCRETE_WALL.get ()),
                    (modBlocks.ORANGE_CONCRETE_WALL.get ()),
                    (modBlocks.RED_CONCRETE_WALL.get ()),
                    (modBlocks.BROWN_CONCRETE_WALL.get ()),
                    (modBlocks.BLACK_CONCRETE_WALL.get ()),
                    (modBlocks.GRAY_CONCRETE_WALL.get ()),
                    (modBlocks.LIGHT_GRAY_CONCRETE_WALL.get ()),
                    (modBlocks.WHITE_CONCRETE_WALL.get ()),
                        //terracottas
                    (modBlocks.PINK_TERRACOTTA_WALL.get ()),
                    (modBlocks.MAGENTA_TERRACOTTA_WALL.get ()),
                    (modBlocks.PURPLE_TERRACOTTA_WALL.get ()),
                    (modBlocks.BLUE_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ()),
                    (modBlocks.CYAN_TERRACOTTA_WALL.get ()),
                    (modBlocks.GREEN_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIME_TERRACOTTA_WALL.get ()),
                    (modBlocks.YELLOW_TERRACOTTA_WALL.get ()),
                    (modBlocks.ORANGE_TERRACOTTA_WALL.get ()),
                    (modBlocks.RED_TERRACOTTA_WALL.get ()),
                    (modBlocks.BROWN_TERRACOTTA_WALL.get ()),
                    (modBlocks.BLACK_TERRACOTTA_WALL.get ()),
                    (modBlocks.GRAY_TERRACOTTA_WALL.get ()),
                    (modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ()),
                    (modBlocks.WHITE_TERRACOTTA_WALL.get ()),
                    (modBlocks.TERRACOTTA_WALL.get ())
                );
    }
}
