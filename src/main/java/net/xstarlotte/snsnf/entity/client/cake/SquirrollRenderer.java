package net.xstarlotte.snsnf.entity.client.cake;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.cake.SquirrollModel;
import net.xstarlotte.snsnf.entity.client.variant.SquirrollVariant;
import net.xstarlotte.snsnf.entity.custom.cake.SquirrollEntity;
import net.xstarlotte.snsnf.entity.custom.cake.SquirrollEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class SquirrollRenderer extends GeoEntityRenderer<SquirrollEntity> {

    private static final Map<SquirrollVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SquirrollVariant.class), map -> {
                map.put(SquirrollVariant.CINNAMON, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/cinnamon_squirroll.png"));
                map.put(SquirrollVariant.CHOCOLATE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/chocolate_squirroll.png"));
                map.put(SquirrollVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/strawberry_squirroll.png"));
            });

    public SquirrollRenderer(EntityRendererProvider.Context context) {
        super(context, new SquirrollModel());
    }

    @Override
    public ResourceLocation getTextureLocation(SquirrollEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(SquirrollEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.1f, 0.1f, 0.1f);
        }
        else {
            poseStack.scale(0.25f, 0.25f, 0.25f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
