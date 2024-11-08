package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.init.BlockInit;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateProvide extends BlockStateProvider {
    public BlockStateProvide(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeallWithItem(BlockInit.COOKIE_DIRT);
        cubeallWithItem(BlockInit.COOKIE_DIRT);
    }

    private void cubeallWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
