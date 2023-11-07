package net.hinno.variants.item;

import net.hinno.variants.variants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems  {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create (ForgeRegistries.ITEMS, variants.MODID);



    public static void register(IEventBus eventBus){
        ITEMS.register (eventBus);
    }
}
