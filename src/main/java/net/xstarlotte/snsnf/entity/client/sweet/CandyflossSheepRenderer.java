package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyflossSheepVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.CandyflossSheepEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CandyflossSheepRenderer extends GeoEntityRenderer<CandyflossSheepEntity> {

    private static final Map<CandyflossSheepVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CandyflossSheepVariant.class), map -> {
                map.put(CandyflossSheepVariant.BLUE_RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/blue_raspberry_candyfloss_sheep.png"));
                map.put(CandyflossSheepVariant.PINK_VANILLA, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/pink_vanilla_candyfloss_sheep.png"));
            });

    public CandyflossSheepRenderer(EntityRendererProvider.Context context) {
        super(context, new CandyflossSheepModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CandyflossSheepEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CandyflossSheepEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
