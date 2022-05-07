package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;

public class Gelatin extends Item {
    public Gelatin() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD));
    }
}
