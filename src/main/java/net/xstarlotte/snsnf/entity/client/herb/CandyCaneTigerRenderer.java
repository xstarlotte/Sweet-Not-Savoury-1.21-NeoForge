package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneTigerVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneTigerEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneTigerRenderer extends GeoEntityRenderer<CandyCaneTigerEntity> {

    private static final Map<CandyCaneTigerVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneTigerVariant.class), map -> {
                map.put(CandyCaneTigerVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_tiger.png"));
            });

    public CandyCaneTigerRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneTigerModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneTigerEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CandyCaneTigerEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
