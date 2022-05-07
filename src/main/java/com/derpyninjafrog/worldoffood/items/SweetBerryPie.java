package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class SweetBerryPie extends Item {
    public SweetBerryPie() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(7)
                        .saturationModifier(4.5f)
                        .build()));
    }
}
