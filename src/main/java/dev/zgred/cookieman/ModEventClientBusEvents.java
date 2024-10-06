package dev.zgred.cookieman;

import dev.zgred.cookieman.entity.EntityInit;
import dev.zgred.cookieman.entity.client.OreomanRenderer;
import dev.zgred.cookieman.entity.custom.OreomanEntity;
import dev.zgred.cookieman.init.client.armor.AxoArmorRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid =Cookieman.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventClientBusEvents {

    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            public @NotNull GeoArmorRenderer<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new AxoArmorRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be nul however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
        });
    }
}
