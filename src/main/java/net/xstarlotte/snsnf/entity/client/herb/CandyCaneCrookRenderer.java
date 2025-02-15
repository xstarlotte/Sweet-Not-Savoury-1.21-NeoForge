package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneCatVariant;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneCrookVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCrookEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneCrookRenderer extends GeoEntityRenderer<CandyCaneCrookEntity> {

    private static final Map<CandyCaneCrookVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneCrookVariant.class), map -> {
                map.put(CandyCaneCrookVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_crook.png"));
                map.put(CandyCaneCrookVariant.REVERSE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_crook_reverse.png"));
            });

    public CandyCaneCrookRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneCrookModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneCrookEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }

}
