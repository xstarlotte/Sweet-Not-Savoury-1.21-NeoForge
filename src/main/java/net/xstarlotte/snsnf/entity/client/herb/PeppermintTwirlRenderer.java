package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintTwirlEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class PeppermintTwirlRenderer extends GeoEntityRenderer<PeppermintTwirlEntity> {


    public PeppermintTwirlRenderer(EntityRendererProvider.Context context) {
        super(context, new PeppermintTwirlModel());
    }

    @Override
    public void render(PeppermintTwirlEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.3f, 0.3f, 0.3f);
        }
        else {
            poseStack.scale(0.7f, 0.7f, 0.7f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
