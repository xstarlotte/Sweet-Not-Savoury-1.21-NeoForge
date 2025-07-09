package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneCatVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneCatRenderer extends GeoEntityRenderer<CandyCaneCatEntity> {

    private static final Map<CandyCaneCatVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneCatVariant.class), map -> {
                map.put(CandyCaneCatVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat.png"));
            });

    public CandyCaneCatRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneCatModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneCatEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CandyCaneCatEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
