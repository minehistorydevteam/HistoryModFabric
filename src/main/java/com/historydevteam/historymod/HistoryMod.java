package com.historydevteam.historymod;

import com.historydevteam.historymod.items.StoneWheelItem;
import com.historydevteam.historymod.registry.HistoryModRegistry;
import com.historydevteam.historymod.utils.Reference;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class HistoryMod implements ModInitializer
{
    public static final ItemGroup HISTORY_MOD = FabricItemGroupBuilder.build(
            new Identifier(Reference.MOD_ID, "historymod"), () -> new ItemStack(StoneWheelItem.getStoneWheelItem()));
    
    @Override
    public void onInitialize()
    {
        HistoryModRegistry.registerItems();
    }
}