package com.jvsrivas.vamparasol.proxy;

import com.jvsrivas.vamparasol.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@SuppressWarnings("unused")
public class ServerProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void registerModels(ModelRegistryEvent event) {
        ModItems.initModels();
    }
}