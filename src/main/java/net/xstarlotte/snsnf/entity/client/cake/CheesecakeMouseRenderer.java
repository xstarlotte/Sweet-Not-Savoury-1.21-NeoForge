package net.xstarlotte.snsnf.entity.client.cake;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CheesecakeMouseVariant;
import net.xstarlotte.snsnf.entity.custom.cake.CheesecakeMouseEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class CheesecakeMouseRenderer extends GeoEntityRenderer<CheesecakeMouseEntity> {

    private static final Map<CheesecakeMouseVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CheesecakeMouseVariant.class), map -> {
                map.put(CheesecakeMouseVariant.STRAWBERRY, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/cake/strawberry_cheesecake_mouse.png"));
            });

    public CheesecakeMouseRenderer(EntityRendererProvider.Context context) {
        super(context, new CheesecakeMouseModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CheesecakeMouseEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(CheesecakeMouseEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.2f, 0.2f, 0.2f);
        }
        else {
            poseStack.scale(0.3f, 0.3f, 0.3f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
