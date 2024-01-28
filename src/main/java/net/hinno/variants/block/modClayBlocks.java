package net.hinno.variants.block;


import net.hinno.variants.item.modItems;
import net.hinno.variants.variants;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modClayBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create (ForgeRegistries.BLOCKS, variants.MODID);

    public static final RegistryObject<Block> CLAY_SLAB = registerBlock ("clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.CLAY)));
    public static final RegistryObject<Block> CLAY_STAIRS = registerBlock ("clay_stairs",
            () -> new StairBlock (Blocks.CLAY::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CLAY)));
    public static final RegistryObject<Block> CLAY_WALL = registerBlock ("clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.CLAY)));

    public static final RegistryObject<Block> WHITE_CLAY = registerBlock ("white_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.CLAY).mapColor (Blocks.QUARTZ_BLOCK.defaultMapColor ())));
    public static final RegistryObject<Block> WHITE_CLAY_SLAB = registerBlock ("white_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.WHITE_CLAY.get())));
    public static final RegistryObject<Block> WHITE_CLAY_STAIRS = registerBlock ("white_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.WHITE_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.WHITE_CLAY.get())));
    public static final RegistryObject<Block> WHITE_CLAY_WALL = registerBlock ("white_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.WHITE_CLAY.get())));

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY= registerBlock ("light_gray_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.CLAY)));
    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_SLAB = registerBlock ("light_gray_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIGHT_GRAY_CLAY.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_STAIRS = registerBlock ("light_gray_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.LIGHT_GRAY_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.LIGHT_GRAY_CLAY.get())));
    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_WALL = registerBlock ("light_gray_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIGHT_GRAY_CLAY.get())));

    public static final RegistryObject<Block> GRAY_CLAY = registerBlock ("gray_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.GRAVEL)));
    public static final RegistryObject<Block> GRAY_CLAY_SLAB = registerBlock ("gray_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.GRAY_CLAY.get())));
    public static final RegistryObject<Block> GRAY_CLAY_STAIRS = registerBlock ("gray_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.GRAY_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.GRAY_CLAY.get())));
    public static final RegistryObject<Block> GRAY_CLAY_WALL = registerBlock ("gray_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.GRAY_CLAY.get())));

    public static final RegistryObject<Block> BLACK_CLAY = registerBlock ("black_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.BLACK_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CLAY_SLAB = registerBlock ("black_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.BLACK_CLAY.get())));
    public static final RegistryObject<Block> BLACK_CLAY_STAIRS = registerBlock ("black_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.BLACK_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.BLACK_CLAY.get())));
    public static final RegistryObject<Block> BLACK_CLAY_WALL = registerBlock ("black_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.BLACK_CLAY.get())));

    public static final RegistryObject<Block> BROWN_CLAY = registerBlock ("brown_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.PACKED_MUD)));
    public static final RegistryObject<Block> BROWN_CLAY_SLAB = registerBlock ("brown_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.BROWN_CLAY.get())));
    public static final RegistryObject<Block> BROWN_CLAY_STAIRS = registerBlock ("brown_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.BROWN_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.BROWN_CLAY.get())));
    public static final RegistryObject<Block> BROWN_CLAY_WALL = registerBlock ("brown_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.BROWN_CLAY.get())));

    public static final RegistryObject<Block> RED_CLAY = registerBlock ("red_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.RED_CONCRETE_POWDER)));
    public static final RegistryObject<Block> RED_CLAY_SLAB = registerBlock ("red_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.RED_CLAY.get())));
    public static final RegistryObject<Block> RED_CLAY_STAIRS = registerBlock ("red_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.RED_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.RED_CLAY.get())));
    public static final RegistryObject<Block> RED_CLAY_WALL = registerBlock ("red_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.RED_CLAY.get())));

    public static final RegistryObject<Block> ORANGE_CLAY = registerBlock ("orange_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.ORANGE_WOOL)));
    public static final RegistryObject<Block> ORANGE_CLAY_SLAB = registerBlock ("orange_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.ORANGE_CLAY.get())));
    public static final RegistryObject<Block> ORANGE_CLAY_STAIRS = registerBlock ("orange_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.ORANGE_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.ORANGE_CLAY.get())));
    public static final RegistryObject<Block> ORANGE_CLAY_WALL = registerBlock ("orange_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.ORANGE_CLAY.get())));

    public static final RegistryObject<Block> YELLOW_CLAY = registerBlock ("yellow_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.BONE_BLOCK)));
    public static final RegistryObject<Block> YELLOW_CLAY_SLAB = registerBlock ("yellow_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.YELLOW_CLAY.get())));
    public static final RegistryObject<Block> YELLOW_CLAY_STAIRS = registerBlock ("yellow_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.YELLOW_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.YELLOW_CLAY.get())));
    public static final RegistryObject<Block> YELLOW_CLAY_WALL = registerBlock ("yellow_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.YELLOW_CLAY.get())));

    public static final RegistryObject<Block> LIME_CLAY = registerBlock ("lime_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.LIME_CONCRETE)));
    public static final RegistryObject<Block> LIME_CLAY_SLAB = registerBlock ("lime_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIME_CLAY.get())));
    public static final RegistryObject<Block> LIME_CLAY_STAIRS = registerBlock ("lime_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.LIME_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.LIME_CLAY.get())));
    public static final RegistryObject<Block> LIME_CLAY_WALL = registerBlock ("lime_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIME_CLAY.get())));

    public static final RegistryObject<Block> GREEN_CLAY = registerBlock ("green_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.GREEN_WOOL)));
    public static final RegistryObject<Block> GREEN_CLAY_SLAB = registerBlock ("green_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.GREEN_CLAY.get())));
    public static final RegistryObject<Block> GREEN_CLAY_STAIRS = registerBlock ("green_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.GREEN_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.GREEN_CLAY.get())));
    public static final RegistryObject<Block> GREEN_CLAY_WALL = registerBlock ("green_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.GREEN_CLAY.get())));

    public static final RegistryObject<Block> CYAN_CLAY = registerBlock ("cyan_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.WARPED_WART_BLOCK)));
    public static final RegistryObject<Block> CYAN_CLAY_SLAB = registerBlock ("cyan_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.CYAN_CLAY.get())));
    public static final RegistryObject<Block> CYAN_CLAY_STAIRS = registerBlock ("cyan_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.CYAN_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.CYAN_CLAY.get())));
    public static final RegistryObject<Block> CYAN_CLAY_WALL = registerBlock ("cyan_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.CYAN_CLAY.get())));

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY = registerBlock ("light_blue_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.LIGHT_BLUE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_SLAB = registerBlock ("light_blue_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIGHT_BLUE_CLAY.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_STAIRS = registerBlock ("light_blue_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.LIGHT_BLUE_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.LIGHT_BLUE_CLAY.get())));
    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_WALL = registerBlock ("light_blue_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.LIGHT_BLUE_CLAY.get())));

    public static final RegistryObject<Block> BLUE_CLAY = registerBlock ("blue_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.BLUE_CONCRETE_POWDER)));
    public static final RegistryObject<Block> BLUE_CLAY_SLAB = registerBlock ("blue_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.BLUE_CLAY.get())));
    public static final RegistryObject<Block> BLUE_CLAY_STAIRS = registerBlock ("blue_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.BLUE_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.BLUE_CLAY.get())));
    public static final RegistryObject<Block> BLUE_CLAY_WALL = registerBlock ("blue_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.BLUE_CLAY.get())));

    public static final RegistryObject<Block> PURPLE_CLAY = registerBlock ("purple_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.PURPLE_GLAZED_TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_CLAY_SLAB = registerBlock ("purple_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.PURPLE_CLAY.get())));
    public static final RegistryObject<Block> PURPLE_CLAY_STAIRS = registerBlock ("purple_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.PURPLE_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.PURPLE_CLAY.get())));
    public static final RegistryObject<Block> PURPLE_CLAY_WALL = registerBlock ("purple_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.PURPLE_CLAY.get())));

    public static final RegistryObject<Block> MAGENTA_CLAY = registerBlock ("magenta_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.MAGENTA_WOOL)));
    public static final RegistryObject<Block> MAGENTA_CLAY_SLAB = registerBlock ("magenta_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.MAGENTA_CLAY.get())));
    public static final RegistryObject<Block> MAGENTA_CLAY_STAIRS = registerBlock ("magenta_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.MAGENTA_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.MAGENTA_CLAY.get())));
    public static final RegistryObject<Block> MAGENTA_CLAY_WALL = registerBlock ("magenta_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.MAGENTA_CLAY.get())));

    public static final RegistryObject<Block> PINK_CLAY = registerBlock ("pink_stained_clay",
            () -> new Block (BlockBehaviour.Properties.copy (Blocks.PINK_WOOL)));
    public static final RegistryObject<Block> PINK_CLAY_SLAB = registerBlock ("pink_stained_clay_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (modClayBlocks.PINK_CLAY.get())));
    public static final RegistryObject<Block> PINK_CLAY_STAIRS = registerBlock ("pink_stained_clay_stairs",
            () -> new StairBlock (modClayBlocks.PINK_CLAY.get()::defaultBlockState, BlockBehaviour.Properties.copy(modClayBlocks.PINK_CLAY.get())));
    public static final RegistryObject<Block> PINK_CLAY_WALL = registerBlock ("pink_stained_clay_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (modClayBlocks.PINK_CLAY.get())));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register (name, block);
        registerBlockItem (name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return modItems.ITEMS.register (name, () -> new BlockItem (block.get (), new Item.Properties ()));
    }


    public static void register(IEventBus eventBus) {
            BLOCKS.register (eventBus);
        }

}
