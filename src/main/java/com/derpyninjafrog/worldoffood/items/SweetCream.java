package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SweetCream extends Item {
    public SweetCream() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD));
    }
}
