package com.historydevteam.historymod.registry;

import com.historydevteam.historymod.HistoryMod;
import com.historydevteam.historymod.items.StoneWheelItem;
import com.historydevteam.historymod.utils.Reference;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HistoryModRegistry
{
    public static final Item STONE_WHEEL = new StoneWheelItem(new Item.Settings().itemGroup(HistoryMod.HISTORY_MOD));
    
    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "stone_wheel"), STONE_WHEEL);
    }
}
