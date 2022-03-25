package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class GelatinDessert extends Item {
    public GelatinDessert() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(4)
                        .saturationModifier(1.2f)
                        .build()));
    }
}
