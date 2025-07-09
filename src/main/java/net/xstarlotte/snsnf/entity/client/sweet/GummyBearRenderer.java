package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.GummyBearVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.GummyBearEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class GummyBearRenderer extends GeoEntityRenderer<GummyBearEntity> {

    private static final Map<GummyBearVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GummyBearVariant.class), map -> {
                map.put(GummyBearVariant.APPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/apple_gummy_bear.png"));
                map.put(GummyBearVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blackberry_gummy_bear.png"));
                map.put(GummyBearVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blueberry_gummy_bear.png"));
                map.put(GummyBearVariant.CHERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/cherry_gummy_bear.png"));
                map.put(GummyBearVariant.COLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/cola_gummy_bear.png"));
                map.put(GummyBearVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/lemon_gummy_bear.png"));
                map.put(GummyBearVariant.LIME, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/lime_gummy_bear.png"));
                map.put(GummyBearVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/mango_gummy_bear.png"));
                map.put(GummyBearVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/orange_gummy_bear.png"));
                map.put(GummyBearVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/peach_gummy_bear.png"));
                map.put(GummyBearVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/pineapple_gummy_bear.png"));
                map.put(GummyBearVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/raspberry_gummy_bear.png"));
                map.put(GummyBearVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/strawberry_gummy_bear.png"));
            });

    public GummyBearRenderer(EntityRendererProvider.Context context) {
        super(context, new GummyBearModel());
    }

    @Override
    public ResourceLocation getTextureLocation(GummyBearEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(GummyBearEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.3f, 0.3f, 0.3f);
        }
        else {
            poseStack.scale(0.6f, 0.6f, 0.6f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
