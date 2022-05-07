package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class GlowBerryPie extends Item {
    public GlowBerryPie() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(8)
                        .saturationModifier(4.8f)
                        .build()));
    }
}
