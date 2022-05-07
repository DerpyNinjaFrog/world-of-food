package com.derpyninjafrog.worldoffood.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.*;
import net.minecraft.item.*;

public class Butter extends Item {
    public Butter() {
        super(new FabricItemSettings()
                .group(ItemGroup.FOOD)
                .food(new FoodComponent.Builder()
                        .hunger(1)
                        .saturationModifier(0.5f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400), 0.5f)
                        .build()));
    }
}
