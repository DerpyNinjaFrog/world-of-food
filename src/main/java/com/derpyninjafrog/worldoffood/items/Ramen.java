package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Ramen extends StewItem {
    public Ramen() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .food(new FoodComponent.Builder()
                        .hunger(7)
                        .saturationModifier(9.0f)
                        .build()));
    }
}
