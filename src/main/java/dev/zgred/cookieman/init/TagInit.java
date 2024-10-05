package dev.zgred.cookieman.init;

import dev.zgred.cookieman.Cookieman;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class TagInit {
    public static final TagKey<Block> NEEDS_COOKIE_TOOL = tag("needs_cookie_tool");

    public static final TagKey<Block> NEEDS_ICE_TOOL = tag("needs_ice_tool");

    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Cookieman.MODID, name));
    }
}