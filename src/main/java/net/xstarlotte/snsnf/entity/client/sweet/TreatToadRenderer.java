package net.xstarlotte.snsnf.entity.client.sweet;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.TreatToadVariant;
import net.xstarlotte.snsnf.entity.custom.sweet.TreatToadEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class TreatToadRenderer extends GeoEntityRenderer<TreatToadEntity> {

    private static final Map<TreatToadVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(TreatToadVariant.class), map -> {
                map.put(TreatToadVariant.CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/chocolate_treat_toad.png"));
                map.put(TreatToadVariant.HONEY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/honey_treat_toad.png"));
                map.put(TreatToadVariant.TOFFEE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/toffee_treat_toad.png"));
                map.put(TreatToadVariant.WHITE_CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/sweet/white_chocolate_treat_toad.png"));
            });

    public TreatToadRenderer(EntityRendererProvider.Context context) {
        super(context, new TreatToadModel());
    }

    @Override
    public ResourceLocation getTextureLocation(TreatToadEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(TreatToadEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.25f, 0.25f, 0.25f);
        }
        else {
            poseStack.scale(0.65f, 0.65f, 0.65f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
