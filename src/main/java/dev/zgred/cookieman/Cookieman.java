package dev.zgred.cookieman;

import com.mojang.logging.LogUtils;
import dev.zgred.cookieman.entity.EntityInit;
import dev.zgred.cookieman.entity.client.CookiemanRenderer;
import dev.zgred.cookieman.entity.client.OreomanRenderer;
import dev.zgred.cookieman.init.BlockInit;
import dev.zgred.cookieman.init.CreativeTabInit;
import dev.zgred.cookieman.init.ItemInit;
import dev.zgred.cookieman.worldgen.BiomeModifi;
import dev.zgred.cookieman.worldgen.CookieWorld;
import dev.zgred.cookieman.worldgen.biome.CookieBiomes;
import dev.zgred.cookieman.worldgen.biome.CookiePlains;
import dev.zgred.cookieman.worldgen.biome.cookie.CookieSurfaceRuleData;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;
import software.bernie.geckolib.GeckoLib;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import dev.zgred.cookieman.datagen.DataGenerators;

import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

@Mod(Cookieman.MODID)
public class Cookieman {
    public static final String MODID = "cookieman";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Cookieman() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        GeckoLib.initialize();
        EntityInit.ENTITIES.register(bus);
        bus.addListener(this::commonSetup);
    }

    @Mod.EventBusSubscriber(modid = Cookieman.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(EntityInit.OREOMAN.get(), OreomanRenderer::new);
            EntityRenderers.register(EntityInit.COOKIEMAN.get(), CookiemanRenderer::new);
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() ->
        {
            Regions.register(new CookiePlains(new ResourceLocation(Cookieman.MODID, "cookie_plains"), RegionType.OVERWORLD, 2));
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Cookieman.MODID, CookieSurfaceRuleData.makeRules());
        });
    }

    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
        });
    }

    public void DataGen(GatherDataEvent event) {
        DataGenerators.gatherData(event);
    }
}
