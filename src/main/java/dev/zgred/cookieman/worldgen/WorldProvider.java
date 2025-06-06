package dev.zgred.cookieman.worldgen;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.worldgen.biome.CookieBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.DIMENSION_TYPE, CookieWorld::bootstrapType)
            .add(Registries.BIOME, CookieBiomes::boostrap)
            .add(Registries.LEVEL_STEM, CookieWorld::bootstrapStem)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, BiomeModifi::bootstrap);


    public WorldProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, Set<String> modIds) {
        super(output, registries, BUILDER, Set.of(Cookieman.MODID));
    }
}