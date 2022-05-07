package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Custard extends StewItem {
    public Custard() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .food(new FoodComponent.Builder()
                        .hunger(5)
                        .saturationModifier(5.0f)
                        .build()));
    }
}
