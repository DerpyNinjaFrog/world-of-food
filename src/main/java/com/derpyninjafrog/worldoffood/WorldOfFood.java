package com.derpyninjafrog.worldoffood;

import com.derpyninjafrog.worldoffood.init.ModItems;
import net.fabricmc.api.ModInitializer;

public class WorldOfFood implements ModInitializer {

    //Mod ID
    public static final String MOD_ID = "world_of_food";

    @Override
    public void onInitialize() {
        //Registration
        ModItems.registerItems();

    }
}
