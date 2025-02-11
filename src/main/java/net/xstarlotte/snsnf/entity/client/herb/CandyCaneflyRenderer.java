package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneflyVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneflyEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneflyRenderer extends GeoEntityRenderer<CandyCaneflyEntity> {

    private static final Map<CandyCaneflyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneflyVariant.class), map -> {
                map.put(CandyCaneflyVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candycanefly.png"));
            });

    public CandyCaneflyRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneflyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneflyEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
}
