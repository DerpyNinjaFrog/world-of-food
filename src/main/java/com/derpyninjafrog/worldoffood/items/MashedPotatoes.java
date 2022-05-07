package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class MashedPotatoes extends StewItem {
    public MashedPotatoes() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .recipeRemainder(Items.BOWL)
                .food(new FoodComponent.Builder()
                        .hunger(6)
                        .saturationModifier(6.5f)
                        .build()));
    }
}
