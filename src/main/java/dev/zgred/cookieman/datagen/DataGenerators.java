package dev.zgred.cookieman.datagen;

import dev.zgred.cookieman.Cookieman;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Cookieman.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), LootTableProvide.create(packOutput));

        generator.addProvider(event.includeClient(), new BlockStateProvide(packOutput, Cookieman.MODID, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelProvider(packOutput, Cookieman.MODID ,existingFileHelper));

        BlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new BlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
    }
}