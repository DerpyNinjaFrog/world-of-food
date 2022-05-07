package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Cereal extends StewItem {
    public Cereal() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .food(new FoodComponent.Builder()
                        .hunger(4)
                        .saturationModifier(4.0f)
                        .build()));
    }
}
