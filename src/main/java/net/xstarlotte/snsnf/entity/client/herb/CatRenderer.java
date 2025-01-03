package net.xstarlotte.snsnf.entity.client.herb;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.xstarlotte.snsnf.SNSNF;
import net.xstarlotte.snsnf.entity.client.SNSModelLayers;
import net.xstarlotte.snsnf.entity.client.variant.CatVariant;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;
import org.checkerframework.checker.units.qual.C;

import java.util.Map;

public class CatRenderer extends MobRenderer<CandyCaneCatEntity, CatModel<CandyCaneCatEntity>> {
    public CatRenderer(EntityRendererProvider.Context context) {
            super(context, new CatModel<>(context.bakeLayer(SNSModelLayers.CANDY_CANE_CAT)), 0.5f);
        }
        @Override
        public void render(CandyCaneCatEntity pEntity, float pEntityYaw, float pPartialTicks,
                           PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
            if(pEntity.isBaby()) {
                pMatrixStack.scale(0.30f, 0.30f, 0.30f);
            }
            super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }


    private static final Map<CatVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(CatVariant.class), map -> {
                map.put(CatVariant.APPLE,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat_apple.png"));
                map.put(CatVariant.DEFAULT,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat.png"));
                map.put(CatVariant.ICE,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat_ice.png"));
                map.put(CatVariant.PEPPER,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat_pepper.png"));
                map.put(CatVariant.SPEAR,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat_spear.png"));
                map.put(CatVariant.WATERMELON,
                        ResourceLocation.fromNamespaceAndPath(SNSNF.MOD_ID, "textures/entity/herb/candy_cane_cat_watermelon.png"));
            });

    @Override
    public ResourceLocation getTextureLocation(CandyCaneCatEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }
}
