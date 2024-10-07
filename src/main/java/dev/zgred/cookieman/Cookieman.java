package dev.zgred.cookieman;

import dev.zgred.cookieman.entity.EntityInit;
import dev.zgred.cookieman.entity.client.CookiemanRenderer;
import dev.zgred.cookieman.entity.client.OreomanRenderer;
import dev.zgred.cookieman.init.BlockInit;
import dev.zgred.cookieman.init.CreativeTabInit;
import dev.zgred.cookieman.init.ItemInit;
import dev.zgred.cookieman.init.client.armor.AxoArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.GeckoLib;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

@Mod(Cookieman.MODID)
public class Cookieman {
    public static final String MODID = "cookieman";

    public Cookieman() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
        GeckoLib.initialize();
        EntityInit.ENTITIES.register(bus);
    }

    @Mod.EventBusSubscriber(modid = Cookieman.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(EntityInit.OREOMAN.get(), OreomanRenderer::new);
            EntityRenderers.register(EntityInit.COOKIEMAN.get(), CookiemanRenderer::new);
        }
    }
}
