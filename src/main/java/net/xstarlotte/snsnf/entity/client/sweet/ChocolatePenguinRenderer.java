package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.ChocolatePenguinVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.ChocolatePenguinEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class ChocolatePenguinRenderer extends GeoEntityRenderer<ChocolatePenguinEntity> {

    private static final Map<ChocolatePenguinVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(ChocolatePenguinVariant.class), map -> {
                map.put(ChocolatePenguinVariant.DARK, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/dark_chocolate_penguin.png"));
                map.put(ChocolatePenguinVariant.MILK, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/milk_chocolate_penguin.png"));
                map.put(ChocolatePenguinVariant.WHITE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/white_chocolate_penguin.png"));
            });

    public ChocolatePenguinRenderer(EntityRendererProvider.Context context) {
        super(context, new ChocolatePenguinModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ChocolatePenguinEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(ChocolatePenguinEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
