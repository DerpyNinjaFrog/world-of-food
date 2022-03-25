package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedEgg extends Item {
    public CookedEgg() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(8)
                        .saturationModifier(1.4f)
                        .build()));
    }
}
