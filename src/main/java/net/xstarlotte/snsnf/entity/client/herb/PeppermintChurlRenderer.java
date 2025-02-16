package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.herb.MintMarshmallowSheepEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class PeppermintChurlRenderer extends GeoEntityRenderer<PeppermintChurlEntity> {


    public PeppermintChurlRenderer(EntityRendererProvider.Context context) {
        super(context, new PeppermintChurlModel());
    }

    @Override
    public void render(PeppermintChurlEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
