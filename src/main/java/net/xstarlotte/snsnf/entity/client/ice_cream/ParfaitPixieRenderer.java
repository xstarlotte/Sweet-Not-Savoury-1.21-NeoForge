package net.xstarlotte.snsnf.entity.client.ice_cream;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.ParfaitPixieVariant;
import net.xstarlotte.snsnf.entity.custom.ice_cream.ParfaitPixieEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class ParfaitPixieRenderer extends GeoEntityRenderer<ParfaitPixieEntity> {

    private static final Map<ParfaitPixieVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ParfaitPixieVariant.class), map -> {
                map.put(ParfaitPixieVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blackberry_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blueberry_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/chocolate_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/lemon_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/orange_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/raspberry_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/strawberry_parfait_pixie.png"));
                map.put(ParfaitPixieVariant.TOFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/toffee_parfait_pixie.png"));
            });

    public ParfaitPixieRenderer(EntityRendererProvider.Context context) {
        super(context, new ParfaitPixieModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ParfaitPixieEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(ParfaitPixieEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
