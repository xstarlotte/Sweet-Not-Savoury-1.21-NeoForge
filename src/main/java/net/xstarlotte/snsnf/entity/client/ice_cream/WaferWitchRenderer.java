package net.xstarlotte.snsnf.entity.client.ice_cream;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.WaferWitchVariant;
import net.xstarlotte.snsnf.entity.custom.ice_cream.WaferWitchEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class WaferWitchRenderer extends GeoEntityRenderer<WaferWitchEntity> {

    private static final Map<WaferWitchVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WaferWitchVariant.class), map -> {
                map.put(WaferWitchVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blackberry_wafer_witch.png"));
                map.put(WaferWitchVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blueberry_wafer_witch.png"));
                map.put(WaferWitchVariant.CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/chocolate_wafer_witch.png"));
                map.put(WaferWitchVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/lemon_wafer_witch.png"));
                map.put(WaferWitchVariant.LIME, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/lime_wafer_witch.png"));
                map.put(WaferWitchVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/mango_wafer_witch.png"));
                map.put(WaferWitchVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/orange_wafer_witch.png"));
                map.put(WaferWitchVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/peach_wafer_witch.png"));
                map.put(WaferWitchVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/pineapple_wafer_witch.png"));
                map.put(WaferWitchVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/raspberry_wafer_witch.png"));
                map.put(WaferWitchVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/strawberry_wafer_witch.png"));
                map.put(WaferWitchVariant.TOFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/toffee_wafer_witch.png"));
                map.put(WaferWitchVariant.VANILLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/vanilla_wafer_witch.png"));
                map.put(WaferWitchVariant.WHITE_CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/white_chocolate_wafer_witch.png"));
            });

    public WaferWitchRenderer(EntityRendererProvider.Context context) {
        super(context, new WaferWitchModel());
    }

    @Override
    public ResourceLocation getTextureLocation(WaferWitchEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(WaferWitchEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        }
        else {
            poseStack.scale(1.1f, 1.1f, 1.1f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
