package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.init.BlockInit;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {
    protected BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(BlockInit.COOKIE_DIRT.get());

        this.add(BlockInit.COOKIE_GRASS_BLOCK.get(),
                block -> createSingleItemTableWithSilkTouch(BlockInit.COOKIE_GRASS_BLOCK.get(), BlockInit.COOKIE_DIRT.get()));
    }

    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
