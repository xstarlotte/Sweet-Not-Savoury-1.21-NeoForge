package net.xstarlotte.snsnf.entity.client.fruit;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.FruitElfVariant;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class FruitElfRenderer extends GeoEntityRenderer<FruitElfEntity> {

    private static final Map<FruitElfVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(FruitElfVariant.class), map -> {
                map.put(FruitElfVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/lemon_fruit_elf.png"));
                map.put(FruitElfVariant.LIME, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/lime_fruit_elf.png"));
                map.put(FruitElfVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/mango_fruit_elf.png"));
                map.put(FruitElfVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/orange_fruit_elf.png"));
                map.put(FruitElfVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/peach_fruit_elf.png"));
                map.put(FruitElfVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/pineapple_fruit_elf.png"));
            });

    public FruitElfRenderer(EntityRendererProvider.Context context) {
        super(context, new FruitElfModel());
    }

    @Override
    public ResourceLocation getTextureLocation(FruitElfEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(FruitElfEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
