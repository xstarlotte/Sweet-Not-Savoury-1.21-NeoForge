package net.xstarlotte.snsnf.entity.client.ice_cream;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.ice_cream.IceCreamCowModel;
import net.xstarlotte.snsnf.entity.client.variant.IceCreamCowVariant;
import net.xstarlotte.snsnf.entity.custom.ice_cream.IceCreamCowEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class IceCreamCowRenderer extends GeoEntityRenderer<IceCreamCowEntity> {

    private static final Map<IceCreamCowVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(IceCreamCowVariant.class), map -> {
                map.put(IceCreamCowVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blackberry_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/blueberry_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/chocolate_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/lemon_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/mango_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/orange_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/peach_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/pineapple_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/raspberry_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/strawberry_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.TOFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/toffee_ice_cream_cow.png"));
                map.put(IceCreamCowVariant.VANILLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/ice_cream/vanilla_ice_cream_cow.png"));
            });

    public IceCreamCowRenderer(EntityRendererProvider.Context context) {
        super(context, new IceCreamCowModel());
    }

    @Override
    public ResourceLocation getTextureLocation(IceCreamCowEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(IceCreamCowEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
