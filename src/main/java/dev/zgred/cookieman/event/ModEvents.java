package dev.zgred.cookieman.event;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.entity.EntityInit;
import dev.zgred.cookieman.entity.custom.OreomanEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Cookieman.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(EntityInit.OREOMAN.get(), OreomanEntity.setAttributes());
        event.put(EntityInit.COOKIEMAN.get(), OreomanEntity.setAttributes());
    }
}
