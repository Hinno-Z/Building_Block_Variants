package net.hinno.variants.block;


import net.hinno.variants.variants;
import net.hinno.variants.item.modItems;
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

public class modConcreteBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create (ForgeRegistries.BLOCKS, variants.MODID);
    
    // concretes
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock ("white_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock ("white_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock ("white_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock ("light_gray_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = registerBlock ("light_gray_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock ("light_gray_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock ("gray_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = registerBlock ("gray_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlock ("gray_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock ("black_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = registerBlock ("black_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlock ("black_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock ("brown_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = registerBlock ("brown_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlock ("brown_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock ("red_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = registerBlock ("red_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlock ("red_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock ("orange_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = registerBlock ("orange_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock ("orange_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock ("yellow_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = registerBlock ("yellow_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlock ("yellow_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock ("lime_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = registerBlock ("lime_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlock ("lime_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock ("green_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = registerBlock ("green_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlock ("green_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock ("cyan_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = registerBlock ("cyan_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlock ("cyan_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock ("light_blue_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = registerBlock ("light_blue_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock ("light_blue_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock ("blue_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = registerBlock ("blue_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlock ("blue_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock ("purple_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = registerBlock ("purple_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlock ("purple_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock ("magenta_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = registerBlock ("magenta_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlock ("magenta_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock ("pink_concrete_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = registerBlock ("pink_concrete_stairs",
            () -> new StairBlock (Blocks.WHITE_CONCRETE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE)));
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlock ("pink_concrete_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WHITE_CONCRETE)));

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
