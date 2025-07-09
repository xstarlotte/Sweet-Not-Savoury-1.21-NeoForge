package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.ChocolateChickenVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.ChocolateChickenEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class ChocolateChickenRenderer extends GeoEntityRenderer<ChocolateChickenEntity> {

    private static final Map<ChocolateChickenVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ChocolateChickenVariant.class), map -> {
                map.put(ChocolateChickenVariant.DARK, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/dark_chocolate_chicken.png"));
                map.put(ChocolateChickenVariant.MILK, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/milk_chocolate_chicken.png"));
                map.put(ChocolateChickenVariant.WHITE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/white_chocolate_chicken.png"));
            });

    public ChocolateChickenRenderer(EntityRendererProvider.Context context) {
        super(context, new ChocolateChickenModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ChocolateChickenEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(ChocolateChickenEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
