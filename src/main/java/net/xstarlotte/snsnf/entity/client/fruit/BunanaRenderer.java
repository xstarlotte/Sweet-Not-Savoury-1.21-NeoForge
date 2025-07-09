package net.xstarlotte.snsnf.entity.client.fruit;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.client.herb.CinnabunModel;
import net.xstarlotte.snsnf.entity.custom.fruit.BunanaEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class BunanaRenderer extends GeoEntityRenderer<BunanaEntity> {


    public BunanaRenderer(EntityRendererProvider.Context context) {
        super(context, new BunanaModel());
    }

    @Override
    public void render(BunanaEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
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
