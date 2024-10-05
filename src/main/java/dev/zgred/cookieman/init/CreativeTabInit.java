package dev.zgred.cookieman.init;

import dev.zgred.cookieman.Cookieman;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Cookieman.MODID);

    public static final List<Supplier<? extends ItemLike>> COOKIES_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> COOKIES_TAB = TABS.register("cookies_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.cookies_tab"))
                    .icon(ItemInit.GOLD_COOKIE.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            COOKIES_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        COOKIES_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
