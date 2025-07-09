package net.xstarlotte.snsnf.entity.client.berry;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.herb.GingerbreadManModel;
import net.xstarlotte.snsnf.entity.client.variant.GingerbreadManVariant;
import net.xstarlotte.snsnf.entity.client.variant.JamsterVariant;
import net.xstarlotte.snsnf.entity.custom.berry.JamsterEntity;
import net.xstarlotte.snsnf.entity.custom.herb.GingerbreadManEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class JamsterRenderer extends GeoEntityRenderer<JamsterEntity> {

    private static final Map<JamsterVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(JamsterVariant.class), map -> {
                map.put(JamsterVariant.BLACKBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/berry/blackberry_jamster.png"));
                map.put(JamsterVariant.BLUEBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/berry/blueberry_jamster.png"));
                map.put(JamsterVariant.RASPBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/berry/raspberry_jamster.png"));
                map.put(JamsterVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/berry/strawberry_jamster.png"));
            });

    public JamsterRenderer(EntityRendererProvider.Context context) {
        super(context, new JamsterModel());
    }

    @Override
    public ResourceLocation getTextureLocation(JamsterEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(JamsterEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
