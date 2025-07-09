package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneTigerVariant;
import net.xstarlotte.snsnf.entity.client.variant.GingerbreadManVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneTigerEntity;
import net.xstarlotte.snsnf.entity.custom.herb.GingerbreadManEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class GingerbreadManRenderer extends GeoEntityRenderer<GingerbreadManEntity> {

    private static final Map<GingerbreadManVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GingerbreadManVariant.class), map -> {
                map.put(GingerbreadManVariant.DEFAULT, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/gingerbread_man.png"));
            });

    public GingerbreadManRenderer(EntityRendererProvider.Context context) {
        super(context, new GingerbreadManModel());
    }

    @Override
    public ResourceLocation getTextureLocation(GingerbreadManEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(GingerbreadManEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.15f, 0.15f, 0.15f);
        }
        else {
            poseStack.scale(0.3f, 0.3f, 0.3f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
