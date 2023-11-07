package net.hinno.variants.item;
import net.hinno.variants.block.modBlocks;
import net.hinno.variants.variants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class modCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
    DeferredRegister.create (Registries.CREATIVE_MODE_TAB, variants.MODID);


    public static final RegistryObject<CreativeModeTab> VARIANTS_TAB = CREATIVE_MODE_TAB.register ("variants_tab",
        () -> CreativeModeTab.builder ().icon (() -> new ItemStack (modBlocks.RED_TERRACOTTA_STAIRS.get ()))
        .title (Component.translatable ("creativetab.creative_tab"))

        .displayItems ((pParameters, pOutput) -> {
                //concretes
            pOutput.accept (modBlocks.WHITE_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.WHITE_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.WHITE_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.LIGHT_GRAY_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.LIGHT_GRAY_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.GRAY_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.GRAY_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.GRAY_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.BLACK_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.BLACK_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.BLACK_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.BROWN_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.BROWN_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.BROWN_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.RED_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.RED_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.RED_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.ORANGE_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.ORANGE_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.ORANGE_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.YELLOW_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.YELLOW_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.YELLOW_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.LIME_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.LIME_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.LIME_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.GREEN_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.GREEN_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.GREEN_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.CYAN_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.CYAN_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.CYAN_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.LIGHT_BLUE_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.LIGHT_BLUE_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.BLUE_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.BLUE_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.BLUE_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.PURPLE_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.PURPLE_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.PURPLE_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.MAGENTA_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.MAGENTA_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.MAGENTA_CONCRETE_WALL.get ());
            pOutput.accept (modBlocks.PINK_CONCRETE_STAIRS.get ());pOutput.accept (modBlocks.PINK_CONCRETE_SLAB.get ());pOutput.accept (modBlocks.PINK_CONCRETE_WALL.get ());
                 //terracotas
            pOutput.accept (modBlocks.TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.WHITE_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.WHITE_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.WHITE_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.GRAY_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.GRAY_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.GRAY_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.BLACK_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.BLACK_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.BLACK_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.BROWN_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.BROWN_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.BROWN_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.RED_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.RED_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.RED_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.ORANGE_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.ORANGE_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.ORANGE_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.YELLOW_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.YELLOW_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.YELLOW_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.LIME_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.LIME_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.LIME_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.GREEN_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.GREEN_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.GREEN_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.CYAN_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.CYAN_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.CYAN_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.BLUE_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.BLUE_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.BLUE_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.PURPLE_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.PURPLE_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.PURPLE_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.MAGENTA_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.MAGENTA_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.MAGENTA_TERRACOTTA_WALL.get ());
            pOutput.accept (modBlocks.PINK_TERRACOTTA_STAIRS.get ());pOutput.accept (modBlocks.PINK_TERRACOTTA_SLAB.get ());pOutput.accept (modBlocks.PINK_TERRACOTTA_WALL.get ());
        })
        .build ()
    );

    public static void register(IEventBus eventBus) {CREATIVE_MODE_TAB.register (eventBus);}
}
