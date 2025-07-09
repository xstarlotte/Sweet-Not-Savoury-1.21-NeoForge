package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.herb.MintMarshmallowSheepEntity;
import net.xstarlotte.snsnf.entity.custom.herb.MintmunkEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class MintmunkRenderer extends GeoEntityRenderer<MintmunkEntity> {


    public MintmunkRenderer(EntityRendererProvider.Context context) {
        super(context, new MintmunkModel());
    }

    @Override
    public void render(MintmunkEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(0.7f, 0.7f, 0.7f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
