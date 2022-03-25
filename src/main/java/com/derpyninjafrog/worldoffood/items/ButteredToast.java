package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ButteredToast extends Item {
    public ButteredToast() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(7)
                        .saturationModifier(1.8f)
                        .build()));
    }
}
