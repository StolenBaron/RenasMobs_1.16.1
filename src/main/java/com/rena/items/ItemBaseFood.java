package com.rena.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBaseFood extends Item {
    public ItemBaseFood() {
        super(new Item.Properties().group(ItemGroup.FOOD));
    }
}
