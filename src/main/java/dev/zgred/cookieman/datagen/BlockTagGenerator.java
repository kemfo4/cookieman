package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.init.BlockInit;
import dev.zgred.cookieman.init.TagInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGenerator extends BlockTagsProvider {
    public BlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Cookieman.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(TagInit.NEEDS_COOKIE_TOOL)
                .add(BlockInit.COOKIE_COBBLESTONE.get(), BlockInit.COOKIE_STONE.get(), BlockInit.COOKIE_STONE_BRICKS.get(), BlockInit.OREO_STONE.get(), BlockInit.OREO_COBBLESTONE.get())
    }
}
