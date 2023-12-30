package net.hinno.variants.block;


import net.hinno.variants.item.modItems;
import net.hinno.variants.variants;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class modWoodBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create (ForgeRegistries.BLOCKS, variants.MODID);


    public static final RegistryObject<Block> OAK_PLANKS_WALL = registerBlock ("oak_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_LOG_WALL = registerBlock ("oak_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_WALL = registerBlock ("stripped_oak_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_LOG_STAIRS = registerBlock ("oak_log_stairs",
            () -> new StairBlock (Blocks.OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_STAIRS = registerBlock ("stripped_oak_log_stairs",
            () -> new StairBlock (Blocks.OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.OAK_PLANKS)));


    public static final RegistryObject<Block> BIRCH_PLANKS_WALL = registerBlock ("birch_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_LOG_WALL = registerBlock ("birch_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_WALL = registerBlock ("stripped_birch_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_LOG_STAIRS  = registerBlock ("birch_log_stairs",
            () -> new StairBlock (Blocks.BIRCH_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_STAIRS  = registerBlock ("stripped_birch_log_stairs",
            () -> new StairBlock (Blocks.BIRCH_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_PLANKS_WALL = registerBlock ("spruce_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_LOG_WALL = registerBlock ("spruce_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_WALL = registerBlock ("stripped_spruce_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_LOG_STAIRS = registerBlock ("spruce_log_stairs",
            () -> new StairBlock (Blocks.SPRUCE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_STAIRS = registerBlock ("stripped_spruce_log_stairs",
            () -> new StairBlock (Blocks.SPRUCE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_PLANKS_WALL = registerBlock ("dark_oak_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_LOG_WALL = registerBlock ("dark_oak_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_WALL = registerBlock ("stripped_dark_oak_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_LOG_STAIRS = registerBlock ("dark_oak_log_stairs",
            () -> new StairBlock (Blocks.DARK_OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_STAIRS = registerBlock ("stripped_dark_oak_log_stairs",
            () -> new StairBlock (Blocks.DARK_OAK_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> CHERRY_PLANKS_WALL = registerBlock ("cherry_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks. CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_LOG_WALL = registerBlock ("cherry_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_WALL = registerBlock ("stripped_cherry_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks. CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_LOG_STAIRS = registerBlock ("cherry_log_stairs",
            () -> new StairBlock (Blocks.CHERRY_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks. CHERRY_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_STAIRS = registerBlock ("stripped_cherry_log_stairs",
            () -> new StairBlock (Blocks.CHERRY_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks. CHERRY_PLANKS)));

    public static final RegistryObject<Block> ACACIA_PLANKS_WALL = registerBlock ("acacia_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_LOG_WALL = registerBlock ("acacia_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_WALL = registerBlock ("stripped_acacia_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_LOG_STAIRS = registerBlock ("acacia_log_stairs",
            () -> new StairBlock (Blocks.ACACIA_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_STAIRS = registerBlock ("stripped_acacia_log_stairs",
            () -> new StairBlock (Blocks.ACACIA_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_PLANKS_WALL = registerBlock ("jungle_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_LOG_WALL = registerBlock ("jungle_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_WALL = registerBlock ("stripped_jungle_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_LOG_STAIRS = registerBlock ("jungle_log_stairs",
            () -> new StairBlock (Blocks.JUNGLE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_STAIRS = registerBlock ("stripped_jungle_log_stairs",
            () -> new StairBlock (Blocks.JUNGLE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.JUNGLE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_PLANKS_WALL = registerBlock ("mangrove_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_LOG_WALL = registerBlock ("mangrove_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_WALL = registerBlock ("stripped_mangrove_log_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_LOG_STAIRS = registerBlock ("mangrove_log_stairs",
            () -> new StairBlock (Blocks.MANGROVE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_STAIRS = registerBlock ("stripped_mangrove_log_stairs",
            () -> new StairBlock (Blocks.MANGROVE_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.MANGROVE_PLANKS)));


    public static final RegistryObject<Block> BAMBOO_PLANKS_WALL = registerBlock ("bamboo_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_WALL = registerBlock ("bamboo_block_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_WALL = registerBlock ("stripped_bamboo_block_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_BLOCK_STAIRS = registerBlock ("bamboo_block_stairs",
            () -> new StairBlock (Blocks.BAMBOO_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_BAMBOO_BLOCK_STAIRS = registerBlock ("stripped_bamboo_block_stairs",
            () -> new StairBlock (Blocks.BAMBOO_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.BAMBOO_PLANKS)));

    public static final RegistryObject<Block> WARPED_PLANKS_WALL = registerBlock ("warped_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_STEM_WALL = registerBlock ("warped_stem_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_WALL = registerBlock ("stripped_warped_stem_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_STEM_STAIRS = registerBlock ("warped_stem_stairs",
            () -> new StairBlock (Blocks.WARPED_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_WARPED_STEM_STAIRS = registerBlock ("stripped_warped_stem_stairs",
            () -> new StairBlock (Blocks.WARPED_PLANKS::defaultBlockState, BlockBehaviour.Properties.copy (Blocks.WARPED_PLANKS)));

    public static final RegistryObject<Block> CRIMSON_PLANKS_WALL = registerBlock ("crimson_planks_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_STEM_WALL = registerBlock ("crimson_stem_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_WALL = registerBlock ("stripped_crimson_stem_wall",
            () -> new WallBlock (BlockBehaviour.Properties.copy (Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_STEM_STAIRS = registerBlock ("crimson_stem_stairs",
            () -> new StairBlock (Blocks.CRIMSON_PLANKS::defaultBlockState,BlockBehaviour.Properties.copy (Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> STRIPPED_CRIMSON_STEM_STAIRS = registerBlock ("stripped_crimson_stem_stairs",
            () -> new StairBlock (Blocks.CRIMSON_PLANKS::defaultBlockState,BlockBehaviour.Properties.copy (Blocks.CRIMSON_PLANKS)));


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
