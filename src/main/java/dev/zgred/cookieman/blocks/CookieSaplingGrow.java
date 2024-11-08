package dev.zgred.cookieman.blocks;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class CookieSaplingGrow extends AbstractTreeGrower {
    public CookieSaplingGrow() {
    }

    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource p_256345_, boolean p_255618_) {
        return CookieSapling.COOKIE;
    }
}