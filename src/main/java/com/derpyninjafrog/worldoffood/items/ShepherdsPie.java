package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class ShepherdsPie extends StewItem {
    public ShepherdsPie() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .food(new FoodComponent.Builder()
                        .hunger(14)
                        .saturationModifier(18.1f)
                        .build()));
    }
}
