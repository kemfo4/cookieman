package dev.zgred.cookieman.entity.client;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.entity.custom.CookiemanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CookiemanModel extends GeoModel<CookiemanEntity> {
    @Override
    public ResourceLocation getModelResource(CookiemanEntity CookiemanEntity) {
        return new ResourceLocation(Cookieman.MODID, "geo/cookieman.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CookiemanEntity CookiemanEntity) {
        return new ResourceLocation(Cookieman.MODID, "geo/cookieman.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CookiemanEntity CookiemanEntity) {
        return new ResourceLocation(Cookieman.MODID, "animations/cookieman_idle.json");
    }
}
