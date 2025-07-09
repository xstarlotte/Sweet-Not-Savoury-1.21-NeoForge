package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyflossLionVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.CandyflossLionEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyflossLionRenderer extends GeoEntityRenderer<CandyflossLionEntity> {

    private static final Map<CandyflossLionVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyflossLionVariant.class), map -> {
                map.put(CandyflossLionVariant.BLUE_RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blue_raspberry_candyfloss_lion.png"));
                map.put(CandyflossLionVariant.PINK_VANILLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/pink_vanilla_candyfloss_lion.png"));
            });

    public CandyflossLionRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyflossLionModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyflossLionEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CandyflossLionEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.8f, 0.8f, 0.8f);
        }
        else {
            poseStack.scale(1.9f, 1.9f, 1.9f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
