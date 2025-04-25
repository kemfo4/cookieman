package dev.zgred.cookieman.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier COOKIE = new ForgeTier(
            4,
            1800,
            2,
            2,
            4,
            TagInit.NEEDS_COOKIE_TOOL,
            () -> Ingredient.of(ItemInit.COOKIE_INGOT::get)
    );
}