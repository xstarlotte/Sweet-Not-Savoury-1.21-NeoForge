package net.xstarlotte.snsnf.entity.client.herb;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.xstarlotte.snsnf.entity.custom.herb.CandyCaneCatEntity;

public class CatModel<T extends CandyCaneCatEntity> extends HierarchicalModel<T> {
    private final ModelPart cat;
    private final ModelPart whole;
    private final ModelPart head;
    private final ModelPart ears;
    private final ModelPart earR;
    private final ModelPart earL;
    private final ModelPart jaw;
    private final ModelPart whiskers;
    private final ModelPart legs;
    private final ModelPart legFR;
    private final ModelPart legFL;
    private final ModelPart legBR;
    private final ModelPart legBL;
    private final ModelPart tail;
    private final ModelPart tail2;
    private final ModelPart tail3;

    public CatModel(ModelPart root) {
        this.cat = root.getChild("cat");
        this.whole = this.cat.getChild("whole");
        this.head = this.whole.getChild("head");
        this.ears = this.head.getChild("ears");
        this.earR = this.ears.getChild("earR");
        this.earL = this.ears.getChild("earL");
        this.jaw = this.head.getChild("jaw");
        this.whiskers = this.head.getChild("whiskers");
        this.legs = this.whole.getChild("legs");
        this.legFR = this.legs.getChild("legFR");
        this.legFL = this.legs.getChild("legFL");
        this.legBR = this.legs.getChild("legBR");
        this.legBL = this.legs.getChild("legBL");
        this.tail = this.whole.getChild("tail");
        this.tail2 = this.tail.getChild("tail2");
        this.tail3 = this.tail2.getChild("tail3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition cat = partdefinition.addOrReplaceChild("cat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition whole = cat.addOrReplaceChild("whole", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.5F, -6.5F, 6.0F, 5.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.5F, -0.25F));

        PartDefinition head = whole.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 18).addBox(-2.5F, -2.9167F, -4.5833F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(29, 18).addBox(-2.0F, -0.1667F, -5.5833F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 33).addBox(-0.5F, -0.4167F, -5.8333F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.5833F, -5.1667F));

        PartDefinition ears = head.addOrReplaceChild("ears", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.85F, -0.9167F, -0.5833F, 0.0F, 0.0F, 0.1309F));

        PartDefinition earR = ears.addOrReplaceChild("earR", CubeListBuilder.create(), PartPose.offset(-0.6574F, -2.5936F, 0.1833F));

        PartDefinition cube_r1 = earR.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 28).addBox(-1.5F, -1.0F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 18).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5974F, 0.0648F, 0.0667F, 0.0F, 0.0F, -0.48F));

        PartDefinition earL = ears.addOrReplaceChild("earL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.8426F, -3.0936F, 0.1833F, 0.0F, 0.0F, 0.829F));

        PartDefinition cube_r2 = earL.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -1.5F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 11).addBox(-1.5F, -1.0F, -0.55F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 20).addBox(-2.0F, -0.5F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5974F, 0.0648F, 0.0667F, 0.0F, 0.0F, -0.48F));

        PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(30, 29).addBox(-2.0F, -0.5F, -1.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.3333F, -4.0833F));

        PartDefinition whiskers = head.addOrReplaceChild("whiskers", CubeListBuilder.create().texOffs(33, 8).addBox(-5.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(33, 5).addBox(2.0F, -1.5F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.8958F, -5.1458F));

        PartDefinition legs = whole.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5F, -0.75F));

        PartDefinition legFR = legs.addOrReplaceChild("legFR", CubeListBuilder.create().texOffs(8, 28).addBox(-1.0625F, 0.5F, -0.375F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(16, 32).addBox(-0.9375F, 4.0F, -1.625F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9875F, 2.0F, -4.375F));

        PartDefinition legFL = legs.addOrReplaceChild("legFL", CubeListBuilder.create().texOffs(0, 28).addBox(-0.95F, 0.5F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 25).addBox(-1.05F, 4.0F, -1.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, 2.0F, -4.5F));

        PartDefinition legBR = legs.addOrReplaceChild("legBR", CubeListBuilder.create().texOffs(25, 5).addBox(-1.025F, 0.8333F, -0.1667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 18).addBox(-1.525F, -1.9167F, -2.1667F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(31, 0).addBox(-0.95F, 4.8333F, -1.1667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.475F, 1.1667F, 5.1667F));

        PartDefinition legBL = legs.addOrReplaceChild("legBL", CubeListBuilder.create().texOffs(20, 25).addBox(-0.9917F, 0.8333F, -0.1667F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.4917F, -1.9167F, -2.1667F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(31, 31).addBox(-1.0167F, 4.8333F, -1.1667F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4917F, 1.1667F, 5.1667F));

        PartDefinition tail = whole.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(25, 0).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 5.25F));

        PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(25, 29).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

        PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

        PartDefinition cube_r3 = tail3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 7).addBox(-0.5F, -3.0F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 7).addBox(-0.5F, -2.0F, 0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 1.5708F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(CandyCaneCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(CatAnimations.ANIM_CAT_WALK, limbSwing, limbSwingAmount, 8f, 2.5f);

        this.animate(entity.idleAnimationState, CatAnimations.ANIM_CAT_IDLE, ageInTicks, 1f);
        this.animate(entity.sitDownAnimationState, CatAnimations.ANIM_CAT_SIT, ageInTicks, 1.0F);
        this.animate(entity.sitPoseAnimationState, CatAnimations.ANIM_CAT_SIT, ageInTicks, 1.0F);
        this.animate(entity.sitUpAnimationState, CatAnimations.ANIM_CAT_IDLE, ageInTicks, 1.0F);
    }

    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);
        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        cat.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public ModelPart root() {
        return cat;
    }
}