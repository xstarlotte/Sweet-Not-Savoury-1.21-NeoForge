package net.xstarlotte.snsnf.entity.client.fruit;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.SnappleEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class SnappleRenderer extends GeoEntityRenderer<SnappleEntity> {


    public SnappleRenderer(EntityRendererProvider.Context context) {
        super(context, new SnappleModel());
    }

    @Override
    public void render(SnappleEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(1.2f, 1.2f, 1.2f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
