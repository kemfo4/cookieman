package dev.zgred.cookieman.init.client.armor;

import dev.zgred.cookieman.Cookieman;
import net.minecraft.resources.ResourceLocation;
import software.bernie.example.item.GeckoArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AxoArmorRenderer extends GeoArmorRenderer<GeckoArmorItem> {
    public AxoArmorRenderer() {
        super(new DefaultedItemGeoModel<>(new ResourceLocation(Cookieman.MODID, "armor/axo_helmet")));
    }
}
