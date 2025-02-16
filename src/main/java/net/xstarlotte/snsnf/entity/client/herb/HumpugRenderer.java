package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.herb.HumpugEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class HumpugRenderer extends GeoEntityRenderer<HumpugEntity> {


    public HumpugRenderer(EntityRendererProvider.Context context) {
        super(context, new HumpugModel());
    }

    @Override
    public void render(HumpugEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(0.8f, 0.8f, 0.8f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
