package net.xstarlotte.snsnf.entity.client.berry;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.berry.BlackboarryEntity;
import net.xstarlotte.snsnf.entity.custom.berry.BlueboarryEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class BlueboarryRenderer extends GeoEntityRenderer<BlueboarryEntity> {


    public BlueboarryRenderer(EntityRendererProvider.Context context) {
        super(context, new BlueboarryModel());
    }

    @Override
    public void render(BlueboarryEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            poseStack.scale(0.8f, 0.8f, 0.758f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
