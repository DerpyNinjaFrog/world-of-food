package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class GelatinDessert extends StewItem {
    public GelatinDessert() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .food(new FoodComponent.Builder()
                        .hunger(5)
                        .saturationModifier(3.0f)
                        .build()));
    }
}
