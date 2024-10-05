package dev.zgred.cookieman.init;

import dev.zgred.cookieman.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial AXO = new ModArmorMaterial(
            new int[] {400, 1200, 600, 400 },
            new int[] {400, 1200, 600, 400 },
            20,
            SoundEvents.AXOLOTL_SWIM,
            () -> Ingredient.of(ItemInit.AXO_HELMET::get),
            "axo_helmet.png",
            10,
            19
    );
}
