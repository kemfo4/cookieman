package dev.zgred.cookieman.entity.client;

import dev.zgred.cookieman.entity.custom.CookiemanEntity;
import dev.zgred.cookieman.entity.custom.OreomanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CookiemanRenderer extends GeoEntityRenderer<CookiemanEntity> {
    public CookiemanRenderer(EntityRendererProvider.Context context) {
        super(context, new CookiemanModel());
    }
}
