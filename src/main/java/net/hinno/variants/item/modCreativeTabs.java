package net.hinno.variants.item;
import net.hinno.variants.block.modConcreteBlocks;
import net.hinno.variants.block.modTerracottaBlocks;
import net.hinno.variants.block.modClayBlocks;
import net.hinno.variants.block.modWoodBlocks;
import net.hinno.variants.variants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.CreativeModeTab.Row.TOP;


public class modCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
    DeferredRegister.create (Registries.CREATIVE_MODE_TAB, variants.MODID);

    public static CreativeModeTab.Builder builder(CreativeModeTab.Row pRow, int pColumn) {
        return new CreativeModeTab.Builder(pRow, pColumn);
    }
         public static final RegistryObject<CreativeModeTab> VARIANTS_TAB = CREATIVE_MODE_TAB.register ("variants_tab",
                () -> CreativeModeTab.builder ().icon (() -> new ItemStack (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ()))
                        .title (Component.translatable ("creativetab.creative_tab"))
                .displayItems ((pParameters, pOutput) -> {
                    /*
                      //fulls
                    pOutput.accept (modClayBlocks.WHITE_CLAY.get ()); pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY.get ()); pOutput.accept (modClayBlocks.BROWN_CLAY.get ());
                    pOutput.accept (modClayBlocks.RED_CLAY.get ()); pOutput.accept (modClayBlocks.ORANGE_CLAY.get ());
                    pOutput.accept (modClayBlocks.YELLOW_CLAY.get ()); pOutput.accept (modClayBlocks.LIME_CLAY.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY.get ()); pOutput.accept (modClayBlocks.GREEN_CLAY.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY.get ()); pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY.get ()); pOutput.accept (modClayBlocks.PURPLE_CLAY.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY.get ()); pOutput.accept (modClayBlocks.PINK_CLAY.get ());

                    //slabs
                            //concretes
                    pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_SLAB.get ()); pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_SLAB.get ()); pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_SLAB.get ()); pOutput.accept (modConcreteBlocks.RED_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.LIME_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get ());
                    pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.PINK_CONCRETE_SLAB.get ());
                            //terracottas
                    pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get ()); pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get ());
                    pOutput.accept (modTerracottaBlocks.TERRACOTTA_SLAB.get ());
                            //clays
                    pOutput.accept (modClayBlocks.WHITE_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.RED_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.ORANGE_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.YELLOW_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.GREEN_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.PURPLE_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY_SLAB.get ()); pOutput.accept (modClayBlocks.PINK_CLAY_SLAB.get ());
                    pOutput.accept (modClayBlocks.CLAY_SLAB.get ());

                    //stairs
                            //concretes
                    pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.RED_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.LIME_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get ());
                    pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get ()); pOutput.accept (modConcreteBlocks.PINK_CONCRETE_STAIRS.get ());
                            //terracottas
                    pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get ()); pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get ());
                    pOutput.accept (modTerracottaBlocks.TERRACOTTA_STAIRS.get ());
                            //clays
                    pOutput.accept (modClayBlocks.WHITE_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.RED_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.ORANGE_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.YELLOW_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.GREEN_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.PURPLE_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.PINK_CLAY_STAIRS.get ());
                    pOutput.accept (modClayBlocks.CLAY_STAIRS.get ());
                            //woods
                               //logs
                    pOutput.accept (modWoodBlocks.OAK_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.BIRCH_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.SPRUCE_LOG_STAIRS.get ()); pOutput.accept  (modWoodBlocks.DARK_OAK_LOG_STAIRS.get ());
                    pOutput.accept  (modWoodBlocks.CHERRY_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.ACACIA_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.JUNGLE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.MANGROVE_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.BAMBOO_BLOCK_STAIRS.get ()); pOutput.accept (modWoodBlocks.WARPED_STEM_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.CRIMSON_STEM_STAIRS.get ());
                            //stripped logs
                    pOutput.accept (modWoodBlocks.STRIPPED_OAK_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CHERRY_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get ());

                    //walls
                            //concretes
                    pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.RED_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.LIME_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_WALL.get ()); pOutput.accept (modConcreteBlocks.PINK_CONCRETE_WALL.get ());
                            //Terracottas
                    pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get ()); pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.TERRACOTTA_WALL.get ());
                            //clays
                    pOutput.accept (modClayBlocks.WHITE_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.RED_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.ORANGE_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.YELLOW_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.GREEN_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.PURPLE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY_WALL.get ()); pOutput.accept (modClayBlocks.PINK_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.CLAY_WALL.get ());
                            //woods
                                //planks
                    pOutput.accept (modWoodBlocks.OAK_PLANKS_WALL.get ()); pOutput.accept (modWoodBlocks.BIRCH_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.SPRUCE_PLANKS_WALL.get ()); pOutput.accept (modWoodBlocks.DARK_OAK_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.CHERRY_PLANKS_WALL.get ());pOutput.accept (modWoodBlocks.ACACIA_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.JUNGLE_PLANKS_WALL.get ());pOutput.accept (modWoodBlocks.MANGROVE_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.BAMBOO_PLANKS_WALL.get ());pOutput.accept (modWoodBlocks.WARPED_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.CRIMSON_PLANKS_WALL.get ());
                                //logs
                    pOutput.accept (modWoodBlocks.OAK_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.BIRCH_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.SPRUCE_LOG_WALL.get ()); pOutput.accept  (modWoodBlocks.DARK_OAK_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.CHERRY_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.ACACIA_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.JUNGLE_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.MANGROVE_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.BAMBOO_BLOCK_WALL.get ()); pOutput.accept (modWoodBlocks.WARPED_STEM_WALL.get ());
                    pOutput.accept (modWoodBlocks.CRIMSON_STEM_WALL.get ());
                                //stripped logs
                    pOutput.accept (modWoodBlocks.STRIPPED_OAK_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.STRIPPED_BIRCH_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CHERRY_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.STRIPPED_ACACIA_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL.get ()); pOutput.accept (modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get ()); pOutput.accept (modWoodBlocks.STRIPPED_WARPED_STEM_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL.get ());

                  */
                        //concretes
                    pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.WHITE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.LIGHT_GRAY_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.GRAY_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.BLACK_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.BROWN_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.RED_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.RED_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.RED_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.ORANGE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.YELLOW_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.LIME_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.LIME_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.LIME_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.GREEN_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.CYAN_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.LIGHT_BLUE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.BLUE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.PURPLE_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.MAGENTA_CONCRETE_WALL.get ());
                    pOutput.accept (modConcreteBlocks.PINK_CONCRETE_STAIRS.get ());pOutput.accept (modConcreteBlocks.PINK_CONCRETE_SLAB.get ());pOutput.accept (modConcreteBlocks.PINK_CONCRETE_WALL.get ());
                            //terracottas
                    pOutput.accept (modTerracottaBlocks.TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.WHITE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.GRAY_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.BLACK_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.BROWN_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.RED_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.ORANGE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.YELLOW_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.LIME_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.GREEN_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.CYAN_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.BLUE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.PURPLE_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.MAGENTA_TERRACOTTA_WALL.get ());
                    pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_STAIRS.get ());pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_SLAB.get ());pOutput.accept (modTerracottaBlocks.PINK_TERRACOTTA_WALL.get ());
                                //Clays
                    pOutput.accept (modClayBlocks.CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.CLAY_SLAB.get ());pOutput.accept (modClayBlocks.CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.WHITE_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.WHITE_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.WHITE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.GRAY_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.GRAY_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.BLACK_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.BLACK_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.BROWN_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.BROWN_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.RED_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.RED_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.RED_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.ORANGE_CLAY_STAIRS.get ()); pOutput.accept (modClayBlocks.ORANGE_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.ORANGE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.YELLOW_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.YELLOW_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.YELLOW_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.LIME_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.LIME_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.GREEN_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.GREEN_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.GREEN_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.CYAN_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.CYAN_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.BLUE_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.BLUE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.PURPLE_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.PURPLE_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.PURPLE_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.MAGENTA_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.MAGENTA_CLAY_WALL.get ());
                    pOutput.accept (modClayBlocks.PINK_CLAY_STAIRS.get ());pOutput.accept (modClayBlocks.PINK_CLAY_SLAB.get ());pOutput.accept (modClayBlocks.PINK_CLAY_WALL.get ());

                    pOutput.accept (modClayBlocks.WHITE_CLAY.get ()); pOutput.accept (modClayBlocks.LIGHT_GRAY_CLAY.get ());
                    pOutput.accept (modClayBlocks.GRAY_CLAY.get ()); pOutput.accept (modClayBlocks.BLACK_CLAY.get ());
                    pOutput.accept (modClayBlocks.BROWN_CLAY.get ()); pOutput.accept (modClayBlocks.BROWN_CLAY.get ());
                    pOutput.accept (modClayBlocks.RED_CLAY.get ()); pOutput.accept (modClayBlocks.ORANGE_CLAY.get ());
                    pOutput.accept (modClayBlocks.YELLOW_CLAY.get ()); pOutput.accept (modClayBlocks.LIME_CLAY.get ());
                    pOutput.accept (modClayBlocks.LIME_CLAY.get ()); pOutput.accept (modClayBlocks.GREEN_CLAY.get ());
                    pOutput.accept (modClayBlocks.CYAN_CLAY.get ()); pOutput.accept (modClayBlocks.LIGHT_BLUE_CLAY.get ());
                    pOutput.accept (modClayBlocks.BLUE_CLAY.get ()); pOutput.accept (modClayBlocks.PURPLE_CLAY.get ());
                    pOutput.accept (modClayBlocks.MAGENTA_CLAY.get ()); pOutput.accept (modClayBlocks.PINK_CLAY.get ());

                    //woods
                    pOutput.accept (modWoodBlocks.OAK_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.OAK_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_OAK_LOG_STAIRS.get ());  pOutput.accept (modWoodBlocks.STRIPPED_OAK_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.OAK_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.SPRUCE_LOG_STAIRS.get ());  pOutput.accept (modWoodBlocks.SPRUCE_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_SPRUCE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_SPRUCE_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.SPRUCE_PLANKS_WALL.get ());
                    pOutput.accept  (modWoodBlocks.DARK_OAK_LOG_STAIRS.get ()); pOutput.accept  (modWoodBlocks.DARK_OAK_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_DARK_OAK_LOG_STAIRS.get ()); pOutput.accept  (modWoodBlocks.STRIPPED_DARK_OAK_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.DARK_OAK_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.BIRCH_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.BIRCH_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_BIRCH_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_BIRCH_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.BIRCH_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.BAMBOO_BLOCK_STAIRS.get ()); pOutput.accept (modWoodBlocks.BAMBOO_BLOCK_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_BAMBOO_BLOCK_WALL.get ());
                    pOutput.accept  (modWoodBlocks.BAMBOO_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.JUNGLE_LOG_STAIRS.get ()); pOutput.accept  (modWoodBlocks.JUNGLE_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_JUNGLE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_JUNGLE_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.JUNGLE_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.ACACIA_LOG_STAIRS.get ()); pOutput.accept  (modWoodBlocks.ACACIA_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_ACACIA_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_ACACIA_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.ACACIA_PLANKS_WALL.get ());
                    pOutput.accept  (modWoodBlocks.CHERRY_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.CHERRY_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CHERRY_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_CHERRY_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.CHERRY_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.MANGROVE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.MANGROVE_LOG_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_MANGROVE_LOG_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_MANGROVE_LOG_WALL.get ());
                    pOutput.accept  (modWoodBlocks.MANGROVE_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.WARPED_STEM_STAIRS.get ()); pOutput.accept (modWoodBlocks.WARPED_STEM_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_WARPED_STEM_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_WARPED_STEM_WALL.get ());
                    pOutput.accept  (modWoodBlocks.WARPED_PLANKS_WALL.get ());
                    pOutput.accept (modWoodBlocks.CRIMSON_STEM_STAIRS.get ()); pOutput.accept (modWoodBlocks.CRIMSON_STEM_WALL.get ());
                    pOutput.accept (modWoodBlocks.STRIPPED_CRIMSON_STEM_STAIRS.get ()); pOutput.accept (modWoodBlocks.STRIPPED_CRIMSON_STEM_WALL.get ());
                    pOutput.accept  (modWoodBlocks.CRIMSON_PLANKS_WALL.get ());
                })
                .build ()
         );


    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register (eventBus);}
}
