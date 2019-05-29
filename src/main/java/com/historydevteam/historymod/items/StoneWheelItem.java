package com.historydevteam.historymod.items;

import com.historydevteam.historymod.registry.ItemRegistry;
import net.minecraft.item.Item;

public class StoneWheelItem extends Item
{
    public StoneWheelItem(Settings settings)
    {
        super(settings);
    }
    
    public static Item getStoneWheelItem()
    {
        return ItemRegistry.STONE_WHEEL;
    }
}
