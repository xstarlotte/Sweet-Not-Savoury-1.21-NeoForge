package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.JellyBabyVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.JellyBabyEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class JellyBabyRenderer extends GeoEntityRenderer<JellyBabyEntity> {

    private static final Map<JellyBabyVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(JellyBabyVariant.class), map -> {
                map.put(JellyBabyVariant.APPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/apple_jelly_baby.png"));
                map.put(JellyBabyVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blackberry_jelly_baby.png"));
                map.put(JellyBabyVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blueberry_jelly_baby.png"));
                map.put(JellyBabyVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/lemon_jelly_baby.png"));
                map.put(JellyBabyVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/mango_jelly_baby.png"));
                map.put(JellyBabyVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/orange_jelly_baby.png"));
                map.put(JellyBabyVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/peach_jelly_baby.png"));
                map.put(JellyBabyVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/pineapple_jelly_baby.png"));
                map.put(JellyBabyVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/raspberry_jelly_baby.png"));
                map.put(JellyBabyVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/strawberry_jelly_baby.png"));
            });

    public JellyBabyRenderer(EntityRendererProvider.Context context) {
        super(context, new JellyBabyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(JellyBabyEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(JellyBabyEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.35f, 0.35f, 0.35f);
        }
        else {
            poseStack.scale(0.7f, 0.7f, 0.7f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
