package com.derpyninjafrog.worldoffood;

import com.derpyninjafrog.worldoffood.init.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldOfFood implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("world_of_food");

    //Mod ID
    public static final String MOD_ID = "world_of_food";

    @Override
    public void onInitialize() {
        //Registration
        ModItems.registerItems();

    }
}
