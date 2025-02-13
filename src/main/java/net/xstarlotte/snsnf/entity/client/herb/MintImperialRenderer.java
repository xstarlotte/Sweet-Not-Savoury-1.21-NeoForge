package net.xstarlotte.snsnf.entity.client.herb;


import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.variant.CandyCaneCatVariant;
import net.xstarlotte.snsnf.entity.client.variant.MintImperialVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintImperialEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;


public class MintImperialRenderer extends GeoEntityRenderer<MintImperialEntity> {

    private static final Map<MintImperialVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(MintImperialVariant.class), map -> {
                map.put(MintImperialVariant.ONE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/mint_imperial_one.png"));
                map.put(MintImperialVariant.TWO, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/mint_imperial_two.png"));
                map.put(MintImperialVariant.THREE, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/mint_imperial_three.png"));
                map.put(MintImperialVariant.FOUR, ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/mint_imperial_four.png"));
            });

    public MintImperialRenderer(EntityRendererProvider.Context context) {
        super(context, new MintImperialModel());
    }

    @Override
    public ResourceLocation getTextureLocation(MintImperialEntity animatable) {
        return LOCATION_BY_VARIANT.get(animatable.getVariant());
    }
    @Override
    public void render(MintImperialEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
            poseStack.scale(1f, 1f, 1f);
            super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
