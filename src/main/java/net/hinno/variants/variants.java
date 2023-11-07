package net.hinno.variants;

import com.mojang.logging.LogUtils;
import net.hinno.variants.block.modBlocks;
import net.hinno.variants.item.modCreativeTabs;
import net.hinno.variants.item.modItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(variants.MODID)
public class variants
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "variants";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public variants()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();



        modCreativeTabs.register (modEventBus);
        modItems.register (modEventBus);
        modBlocks.register (modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}
    private void addCreative(BuildCreativeModeTabContentsEvent event) {     }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {  }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {  }
    }
}
