package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class CaramelBucket extends Item {
    public CaramelBucket() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .maxCount(1)
                .recipeRemainder(Items.BUCKET));
    }
}
