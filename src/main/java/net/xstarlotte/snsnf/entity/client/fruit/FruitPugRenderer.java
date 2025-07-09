package net.xstarlotte.snsnf.entity.client.fruit;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.FruitPugVariant;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitPugEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class FruitPugRenderer extends GeoEntityRenderer<FruitPugEntity> {

    private static final Map<FruitPugVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(FruitPugVariant.class), map -> {
                map.put(FruitPugVariant.LEMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/lemon_pug.png"));
                map.put(FruitPugVariant.LIME, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/lime_pug.png"));
                map.put(FruitPugVariant.MANGO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/mango_pug.png"));
                map.put(FruitPugVariant.ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/orange_pug.png"));
                map.put(FruitPugVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/peach_pug.png"));
                map.put(FruitPugVariant.PINEAPPLE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/fruit/pineapple_pug.png"));
            });

    public FruitPugRenderer(EntityRendererProvider.Context context) {
        super(context, new FruitPugModel());
    }

    @Override
    public ResourceLocation getTextureLocation(FruitPugEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(FruitPugEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
