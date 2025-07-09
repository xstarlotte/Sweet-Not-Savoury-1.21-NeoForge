package net.xstarlotte.snsnf.entity.client.cake;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.berry.JamsterModel;
import net.xstarlotte.snsnf.entity.client.variant.CakeRabbitVariant;
import net.xstarlotte.snsnf.entity.client.variant.JamsterVariant;
import net.xstarlotte.snsnf.entity.custom.berry.JamsterEntity;
import net.xstarlotte.snsnf.entity.custom.cake.CakeRabbitEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CakeRabbitRenderer extends GeoEntityRenderer<CakeRabbitEntity> {

    private static final Map<CakeRabbitVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CakeRabbitVariant.class), map -> {
                map.put(CakeRabbitVariant.ANGEL, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/angel_cake_rabbit.png"));
                map.put(CakeRabbitVariant.BANANA_BREAD, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/banana_bread_rabbit.png"));
                map.put(CakeRabbitVariant.BANOFFEE_PIE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/banoffee_pie_rabbit.png"));
                map.put(CakeRabbitVariant.CARROT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/carrot_cake_rabbit.png"));
                map.put(CakeRabbitVariant.CHOCOLATE_CHERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/chocolate_cherry_cake_rabbit.png"));
                map.put(CakeRabbitVariant.CHOCOLATE_ORANGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/chocolate_orange_cake_rabbit.png"));
                map.put(CakeRabbitVariant.COFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/coffee_cake_rabbit.png"));
                map.put(CakeRabbitVariant.FRUIT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/fruit_cake_rabbit.png"));
                map.put(CakeRabbitVariant.LEMON_CURD, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/lemon_curd_cake_rabbit.png"));
                map.put(CakeRabbitVariant.PEACH, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/peach_cake_rabbit.png"));
                map.put(CakeRabbitVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/raspberry_cake_rabbit.png"));
                map.put(CakeRabbitVariant.RED_VELVET, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/red_velvet_cake_rabbit.png"));
                map.put(CakeRabbitVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/strawberry_cake_rabbit.png"));
                map.put(CakeRabbitVariant.VANILLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/vanilla_cake_rabbit.png"));
                map.put(CakeRabbitVariant.VICTORIA_SPONGE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/victoria_sponge_cake_rabbit.png"));
            });

    public CakeRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, new CakeRabbitModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CakeRabbitEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CakeRabbitEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
