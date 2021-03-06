package com.derpyninjafrog.worldoffood.init;

import com.derpyninjafrog.worldoffood.WorldOfFood;
import com.derpyninjafrog.worldoffood.items.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item APPLE_PIE = new ApplePie();
    public static final Item BISCUIT = new Biscuit();
    public static final Item BUTTER = new Butter();
    public static final Item BUTTERED_TOAST = new ButteredToast();
    public static final Item CARAMEL = new Caramel();
    public static final Item CARAMEL_APPLE = new CaramelApple();
    public static final Item CARAMEL_BUCKET = new CaramelBucket();
    public static final Item CEREAL = new Cereal();
    public static final Item CHEESE = new Cheese();
    public static final Item CHEESE_PUFFS = new CheesePuffs();
    public static final Item CHOCOLATE = new Chocolate();
    public static final Item CHOCOLATE_PIE = new ChocolatePie();
    public static final Item COOKED_EGG = new CookedEgg();
    public static final Item CUSTARD = new Custard();
    public static final Item GELATIN = new Gelatin();
    public static final Item GELATIN_DESSERT = new GelatinDessert();
    public static final Item GLOW_BERRY_PIE = new GlowBerryPie();
    public static final Item MASHED_POTATOES = new MashedPotatoes();
    public static final Item NACHOS = new Nachos();
    public static final Item RAMEN = new Ramen();
    public static final Item SANDWICH = new Sandwich();
    public static final Item SHEPHERDS_PIE = new ShepherdsPie();
    public static final Item SUSHI = new Sushi();
    public static final Item SWEET_BERRY_PIE = new SweetBerryPie();
    public static final Item SWEET_CREAM_BUCKET = new SweetCreamBucket();
    public static final Item TOAST = new Toast();
    public static final Item TORTILLA = new Tortilla();
    public static final Item TORTILLA_CHIPS = new TortillaChips();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "biscuit"), BISCUIT);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "butter"), BUTTER);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "buttered_toast"), BUTTERED_TOAST);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "caramel"), CARAMEL);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "caramel_apple"), CARAMEL_APPLE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "caramel_bucket"), CARAMEL_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "cereal"), CEREAL);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "cheese"), CHEESE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "cheese_puffs"), CHEESE_PUFFS);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "chocolate"), CHOCOLATE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "chocolate_pie"), CHOCOLATE_PIE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "cooked_egg"), COOKED_EGG);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "custard"), CUSTARD);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "gelatin"), GELATIN);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "gelatin_dessert"), GELATIN_DESSERT);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "glow_berry_pie"), GLOW_BERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "mashed_potatoes"), MASHED_POTATOES);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "nachos"), NACHOS);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "ramen"), RAMEN);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "sandwich"), SANDWICH);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "shepherds_pie"), SHEPHERDS_PIE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "sushi"), SUSHI);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "sweet_berry_pie"), SWEET_BERRY_PIE);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "sweet_cream_bucket"), SWEET_CREAM_BUCKET);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "toast"), TOAST);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "tortilla"), TORTILLA);
        Registry.register(Registry.ITEM, new Identifier(WorldOfFood.MOD_ID, "tortilla_chips"), TORTILLA_CHIPS);
    }
}
