package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class CheesePuffs extends Item {
    public CheesePuffs() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(6)
                        .saturationModifier(5.0f)
                        .snack()
                        .build()));
    }
}
