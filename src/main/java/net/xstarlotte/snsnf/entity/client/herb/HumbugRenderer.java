package net.xstarlotte.snsnf.entity.client.herb;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.herb.HumbugEntity;
import net.xstarlotte.snsnf.entity.custom.herb.PeppermintChurlEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class HumbugRenderer extends GeoEntityRenderer<HumbugEntity> {


    public HumbugRenderer(EntityRendererProvider.Context context) {
        super(context, new HumbugModel());
    }

    @Override
    public void render(HumbugEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
