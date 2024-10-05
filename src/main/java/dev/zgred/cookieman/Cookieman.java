package dev.zgred.cookieman;

import dev.zgred.cookieman.entity.EntityInit;
import dev.zgred.cookieman.init.BlockInit;
import dev.zgred.cookieman.init.CreativeTabInit;
import dev.zgred.cookieman.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

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
}
