package com.rena.util;

import com.rena.entities.render.ExampleEntityRender;
import com.rena.init.ModEntityTypes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientEventBusSubscriber {

    public static void clientSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EXAMPLE_ENTITY.get(), ExampleEntityRender::new);
    }

}