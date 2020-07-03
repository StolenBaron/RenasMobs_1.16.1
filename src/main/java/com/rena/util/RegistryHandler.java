package com.rena.util;

import com.rena.RenasMobs;
import com.rena.items.ItemBaseFood;
import com.rena.items.ItemBaseMisc;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RenasMobs.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    // Items
    public static final RegistryObject<Item> PEANUTS = ITEMS.register( "peanuts", ItemBaseFood::new);
    public static final RegistryObject<Item> SPICY_NUTS = ITEMS.register( "spicy_nuts", ItemBaseFood::new);
    public static final RegistryObject<Item> GREEN_BLAZE_POWDER = ITEMS.register( "green_blaze_powder", ItemBaseMisc::new);
}
