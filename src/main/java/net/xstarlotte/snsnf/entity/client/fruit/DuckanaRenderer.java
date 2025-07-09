package net.xstarlotte.snsnf.entity.client.fruit;


import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.xstarlotte.snsnf.entity.custom.fruit.DuckanaEntity;
import net.xstarlotte.snsnf.entity.custom.fruit.FruitElfEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;


public class DuckanaRenderer extends GeoEntityRenderer<DuckanaEntity> {


    public DuckanaRenderer(EntityRendererProvider.Context context) {
        super(context, new DuckanaModel());
    }

    @Override
    public void render(DuckanaEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.32f, 0.32f, 0.32f);
        }
        else {
            poseStack.scale(0.75f, 0.75f, 0.75f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
