package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.herb.CinnabunEntity;
import net.xstarlotte.snsnf.entity.custom.herb.HumbugEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class CinnabunRenderer extends GeoEntityRenderer<CinnabunEntity> {


    public CinnabunRenderer(EntityRendererProvider.Context context) {
        super(context, new CinnabunModel());
    }

    @Override
    public void render(CinnabunEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.3f, 0.3f, 0.3f);
        }
        else {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
