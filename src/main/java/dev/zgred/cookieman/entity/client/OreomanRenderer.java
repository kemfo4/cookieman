package dev.zgred.cookieman.entity.client;

import dev.zgred.cookieman.entity.custom.OreomanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class OreomanRenderer extends GeoEntityRenderer<OreomanEntity> {
    public OreomanRenderer(EntityRendererProvider.Context context) {
        super(context, new OreomanModel());
    }
}
