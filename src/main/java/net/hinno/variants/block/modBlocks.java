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

public class modBlocks {
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

    //terracottas
    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock ("terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock ("terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> TERRACOTTA_WALL = registerBlock ("terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock ("white_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock ("white_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock ("white_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock ("light_gray_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock ("light_gray_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock ("light_gray_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock ("gray_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_STAIRS = registerBlock ("gray_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlock ("gray_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock ("black_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock ("black_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock ("black_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock ("brown_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_STAIRS = registerBlock ("brown_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlock ("brown_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock ("red_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock ("red_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock ("red_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock ("orange_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock ("orange_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock ("orange_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock ("yellow_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_STAIRS = registerBlock ("yellow_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlock ("yellow_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock ("lime_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_STAIRS = registerBlock ("lime_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlock ("lime_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock ("green_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_STAIRS = registerBlock ("green_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlock ("green_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock ("cyan_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_STAIRS = registerBlock ("cyan_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlock ("cyan_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock ("light_blue_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock ("light_blue_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock ("light_blue_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock ("blue_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_STAIRS = registerBlock ("blue_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlock ("blue_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock ("purple_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_STAIRS = registerBlock ("purple_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlock ("purple_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock ("magenta_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_STAIRS = registerBlock ("magenta_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlock ("magenta_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));

    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock ("pink_terracotta_slab",
            () -> new SlabBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_STAIRS = registerBlock ("pink_terracotta_stairs",
            () -> new StairBlock (Blocks.TERRACOTTA::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)));
    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlock ("pink_terracotta_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.TERRACOTTA)));










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

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) modBlocks.BLOCKS.getEntries (), (renderType) -> {
            return renderType == RenderType.translucent ();
        });
    }
}
