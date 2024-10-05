package dev.zgred.cookieman.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier COOKIE = new ForgeTier(
            4,
            1800,
            4,
            7,
            20,
            TagInit.NEEDS_COOKIE_TOOL,
            () -> Ingredient.of(ItemInit.GOLD_COOKIE::get)
    );
    public static final ForgeTier ICE = new ForgeTier(
            4,
            1800,
            4,
            7,
            20,
            TagInit.NEEDS_ICE_TOOL,
            () -> Ingredient.of(Items.BLUE_ICE)
    );
}