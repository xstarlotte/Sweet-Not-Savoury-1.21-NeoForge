package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneFlyVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneFlyEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyCaneFlyRenderer extends GeoEntityRenderer<CandyCaneFlyEntity> {

    private static final Map<CandyCaneFlyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyCaneFlyVariant.class), map -> {
                map.put(CandyCaneFlyVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_fly.png"));
            });

    public CandyCaneFlyRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyCaneFlyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyCaneFlyEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CandyCaneFlyEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        }
        else {
            poseStack.scale(0.9f, 0.9f, 0.9f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
