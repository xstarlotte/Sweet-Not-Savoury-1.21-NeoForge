package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;

import net.xstarlotte.snsnf.entity.client.variant.BonbonbiniVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.BonbonbiniEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class BonbonbiniRenderer extends GeoEntityRenderer<BonbonbiniEntity> {

    private static final Map<BonbonbiniVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(BonbonbiniVariant.class), map -> {
                map.put(BonbonbiniVariant.APPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/apple_bonbonbini.png"));
                map.put(BonbonbiniVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blackberry_bonbonbini.png"));
                map.put(BonbonbiniVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blueberry_bonbonbini.png"));
                map.put(BonbonbiniVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/lemon_bonbonbini.png"));
                map.put(BonbonbiniVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/orange_bonbonbini.png"));
                map.put(BonbonbiniVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/raspberry_bonbonbini.png"));
                map.put(BonbonbiniVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/strawberry_bonbonbini.png"));
                map.put(BonbonbiniVariant.TOFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/toffee_bonbonbini.png"));
            });

    public BonbonbiniRenderer(EntityRendererProvider.Context context) {
        super(context, new BonbonbiniModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BonbonbiniEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(BonbonbiniEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
        else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
