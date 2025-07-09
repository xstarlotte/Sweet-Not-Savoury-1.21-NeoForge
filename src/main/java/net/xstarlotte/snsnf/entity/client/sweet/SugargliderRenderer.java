package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.SugargliderVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.SugargliderEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class SugargliderRenderer extends GeoEntityRenderer<SugargliderEntity> {

    private static final Map<SugargliderVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SugargliderVariant.class), map -> {
                map.put(SugargliderVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/sugarglider.png"));
            });

    public SugargliderRenderer(EntityRendererProvider.Context context) {
        super(context, new SugargliderModel());
    }

    @Override
    public ResourceLocation getTextureLocation(SugargliderEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(SugargliderEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(0.8f, 0.8f, 0.8f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
