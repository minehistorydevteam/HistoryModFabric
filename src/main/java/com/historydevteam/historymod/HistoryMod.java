package com.historydevteam.historymod;

import com.historydevteam.historymod.registry.HistoryModRegistry;
import net.fabricmc.api.ModInitializer;

public class HistoryMod implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        HistoryModRegistry.registerItems();
    }
}