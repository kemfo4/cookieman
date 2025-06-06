package dev.zgred.cookieman.init;

import dev.zgred.cookieman.Cookieman;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static dev.zgred.cookieman.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Cookieman.MODID);

    public static final RegistryObject<Item> GOLD_COOKIE = addToTab(ITEMS.register("gold_cookie",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationMod(.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 12000, 5), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 24000, 8), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 12000, 2), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 1), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 120, 5), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 12000, 5), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12000, 1), 1f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> GINGERBREAD = addToTab(ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(.1f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> GELATINE = addToTab(ITEMS.register("gelatine",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> JELLY = addToTab(ITEMS.register("jelly",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> DELICJE = addToTab(ITEMS.register("delicje",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(2)
                            .saturationMod(.3f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> BUTTER_COOKIES  = addToTab(ITEMS.register("butter_cookies",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(.3f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> BUTTER = addToTab(ITEMS.register("butter",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> CHOCOLATE = addToTab(ITEMS.register("chocolate",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> CHOCOLATE_COOKIE = addToTab(ITEMS.register("chocolate_cookie",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(.3f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> PINE_CONE_COOKIE = addToTab(ITEMS.register("pine_cone_cookie",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(.1f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> HONEY_COOKIE = addToTab(ITEMS.register("honey_cookie",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(10)
                            .saturationMod(.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 120, 5), 1f)
                            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 12000, 5), 1f)
                            .alwaysEat()
                            .build()))));

    public static final RegistryObject<Item> COOKIE_INGOT = addToTab(ITEMS.register("cookie_ingot",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> RAW_COOKIE_INGOT = addToTab(ITEMS.register("raw_cookie_ingot",
            () -> new Item(new Item.Properties())));

    public static final RegistryObject<BlockItem> COOKIE_GRASS_BLOCK = addToTab(ITEMS.register("cookie_grass_block",
            () -> new BlockItem(BlockInit.COOKIE_GRASS_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_DIRT = addToTab(ITEMS.register("cookie_dirt",
            () -> new BlockItem(BlockInit.COOKIE_DIRT.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_COBBLESTONE = addToTab(ITEMS.register("cookie_cobblestone",
            () -> new BlockItem(BlockInit.COOKIE_COBBLESTONE.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_STONE = addToTab(ITEMS.register("cookie_stone",
            () -> new BlockItem(BlockInit.COOKIE_STONE.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_STONE_BRICKS = addToTab(ITEMS.register("cookie_stone_bricks",
            () -> new BlockItem(BlockInit.COOKIE_STONE_BRICKS.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_PLANKS = addToTab(ITEMS.register("cookie_planks",
            () -> new BlockItem(BlockInit.COOKIE_PLANKS.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_LOG = addToTab(ITEMS.register("cookie_log",
            () -> new BlockItem(BlockInit.COOKIE_LOG.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_WOOD = addToTab(ITEMS.register("cookie_wood",
            () -> new BlockItem(BlockInit.COOKIE_WOOD.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> COOKIE_LEAVES = addToTab(ITEMS.register("cookie_leaves",
            () -> new BlockItem(BlockInit.COOKIE_LEAVES.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));
    
    public static final RegistryObject<BlockItem> OREO_STONE = addToTab(ITEMS.register("oreo_stone",
            () -> new BlockItem(BlockInit.OREO_STONE.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));

    public static final RegistryObject<BlockItem> OREO_COBBLESTONE = addToTab(ITEMS.register("oreo_cobblestone",
            () -> new BlockItem(BlockInit.OREO_COBBLESTONE.get(),
                    new Item.Properties()
                            .rarity(Rarity.COMMON))));
    
    public static final RegistryObject<SwordItem> COOKIE_SWORD = addToTab(ITEMS.register("cookie_sword",
            () -> new SwordItem(
                    TierInit.COOKIE,
                    3,
                    1.5f,
                    new Item.Properties()
            )));

    public static final RegistryObject<PickaxeItem> COOKIE_PICKAXE = addToTab(ITEMS.register("cookie_pickaxe",
            () -> new PickaxeItem(
                    TierInit.COOKIE,
                    3,
                    1.5f,
                    new Item.Properties()
            )));

    public static final RegistryObject<ShovelItem> COOKIE_SHOVEL = addToTab(ITEMS.register("cookie_shovel",
            () -> new ShovelItem(
                    TierInit.COOKIE,
                    3,
                    1.5f,
                    new Item.Properties()
            )));

    public static final RegistryObject<AxeItem> COOKIE_AXE = addToTab(ITEMS.register("cookie_axe",
            () -> new AxeItem(
                    TierInit.COOKIE,
                    3,
                    1.5f,
                    new Item.Properties()
            )));

    public static final RegistryObject<HoeItem> COOKIE_HOE = addToTab(ITEMS.register("cookie_hoe",
            () -> new HoeItem(
                    TierInit.COOKIE,
                    3,
                    1.5f,
                    new Item.Properties()
            )));

    public static final RegistryObject<Item> MACAROONS = addToTab(ITEMS.register("macaroons",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(.4f)
                            .alwaysEat()
                            .build()))));


}
