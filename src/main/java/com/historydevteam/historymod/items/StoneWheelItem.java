package com.historydevteam.historymod.items;

import com.historydevteam.historymod.registry.HistoryModRegistry;
import net.minecraft.item.Item;

public class StoneWheelItem extends Item
{
    public StoneWheelItem(Settings settings)
    {
        super(settings);
    }
    
    public static Item getStoneWheelItem()
    {
        return HistoryModRegistry.STONE_WHEEL;
    }
}
