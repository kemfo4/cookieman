package dev.zgred.cookieman.worldgen.biome.cookie;

import dev.zgred.cookieman.init.BlockInit;
import dev.zgred.cookieman.worldgen.biome.CookieBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class CookieSurfaceRuleData {
    private static final SurfaceRules.RuleSource COOKIE_DIRT = makeStateRule(BlockInit.COOKIE_DIRT.get());
    private static final SurfaceRules.RuleSource COOKIE_GRASS_BLOCK = makeStateRule(BlockInit.COOKIE_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource OREO_STONE = makeStateRule(BlockInit.OREO_STONE.get());


    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, COOKIE_GRASS_BLOCK), COOKIE_DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(CookieBiomes.COOKIE_PLAINS),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, COOKIE_DIRT)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, COOKIE_GRASS_BLOCK)),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(CookieBiomes.OREO_MOUNTAINS),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, OREO_STONE)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, OREO_STONE)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}