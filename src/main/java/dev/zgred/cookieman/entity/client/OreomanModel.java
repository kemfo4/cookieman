package dev.zgred.cookieman.entity.client;

import dev.zgred.cookieman.Cookieman;
import dev.zgred.cookieman.entity.custom.OreomanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OreomanModel extends GeoModel<OreomanEntity> {
    @Override
    public ResourceLocation getModelResource(OreomanEntity oreomanEntity) {
        return new ResourceLocation(Cookieman.MODID, "geo/oreoman.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(OreomanEntity oreomanEntity) {
        return new ResourceLocation(Cookieman.MODID, "geo/oreoman.png");
    }

    @Override
    public ResourceLocation getAnimationResource(OreomanEntity oreomanEntity) {
        return new ResourceLocation(Cookieman.MODID, "animations/oreoman_idle.json");
    }
}
