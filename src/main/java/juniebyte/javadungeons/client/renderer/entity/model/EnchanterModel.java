/*
package juniebyte.javadungeons.client.renderer.entity.model;

import com.baguchan.enchantwithmob.entity.EnchanterEntity;
import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.entity.model.IHasHead;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

*/
/**
 * EnchanterModel - bagu
 * Created using Tabula 8.0.0
 *//*

@OnlyIn(Dist.CLIENT)
public class EnchanterModel<T extends EnchanterEntity> extends SegmentedModel<T> implements IHasArm, IHasHead {
    public ModelRenderer legR;
    public ModelRenderer head;
    public ModelRenderer handR;
    public ModelRenderer legL;
    public ModelRenderer handL;
    public ModelRenderer body;
    public ModelRenderer hat;
    public ModelRenderer nose;
    public ModelRenderer cape;
    private final ModelRenderer arms;
    private final ModelRenderer crossArmR;
    private final ModelRenderer crossArmL;

    public EnchanterModel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.hat = new ModelRenderer(this, 32, 0);
        this.hat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.hat.addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.45F, 0.45F, 0.45F);
        this.body = new ModelRenderer(this, 0, 0);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, 0.0F, 0.0F);
        this.body.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, 0.5F, 0.5F);
        this.nose = new ModelRenderer(this, 24, 0);
        this.nose.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.nose.addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.legL = new ModelRenderer(this, 0, 22);
        this.legL.mirror = true;
        this.legL.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.legL.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.handR = new ModelRenderer(this, 40, 46);
        this.handR.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.handR.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.arms = new ModelRenderer(this, 44, 22);
        this.arms.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.arms.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F);
        ModelRenderer modelrenderer1 = (new ModelRenderer(this, 44, 22));
        modelrenderer1.mirror = true;
        modelrenderer1.addBox(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F);
        this.arms.addChild(modelrenderer1);
        this.arms.setTextureOffset(40, 38).addBox(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F);
        this.crossArmR = (new ModelRenderer(this, 0, 22));
        this.crossArmR.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.crossArmR.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F);
        this.crossArmL = (new ModelRenderer(this, 0, 22));
        this.crossArmL.mirror = true;
        this.crossArmL.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.crossArmL.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, 0.0F, 0.0F);
        this.legR = new ModelRenderer(this, 0, 22);
        this.legR.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.legR.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.handL = new ModelRenderer(this, 40, 46);
        this.handL.mirror = true;
        this.handL.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.handL.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, 0.0F, 0.0F);
        this.cape = new ModelRenderer(this, 64, 0);
        this.cape.setRotationPoint(0.0F, 1.0F, 3.4F);
        this.cape.addBox(-4.5F, 0.0F, 0.0F, 9.0F, 15.0F, 1.0F, 0.6F, 0.7F, 0.0F);
        this.setRotateAngle(cape, 0.1563815016444822F, 0.0F, 0.0F);
        this.head.addChild(this.hat);
        this.head.addChild(this.nose);
        this.body.addChild(this.cape);
    }


    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(this.handL, this.legL, this.arms, this.legR, this.handR, this.head, this.body);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
        this.head.rotateAngleX = headPitch * ((float) Math.PI / 180F);
        this.arms.rotationPointY = 3.0F;
        this.arms.rotationPointZ = -1.0F;
        this.arms.rotateAngleX = -0.75F;

        this.legL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
        this.legR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount * 0.5F;

        this.cape.rotateAngleX = 0.1F + limbSwingAmount * 0.6F;

        if (this.isSitting) {
            this.handR.rotateAngleX = (-(float) Math.PI / 5F);
            this.handR.rotateAngleY = 0.0F;
            this.handR.rotateAngleZ = 0.0F;
            this.handL.rotateAngleX = (-(float) Math.PI / 5F);
            this.handL.rotateAngleY = 0.0F;
            this.handL.rotateAngleZ = 0.0F;
            this.crossArmR.rotateAngleX = -1.4137167F;
            this.crossArmR.rotateAngleY = ((float) Math.PI / 10F);
            this.crossArmR.rotateAngleZ = 0.07853982F;
            this.crossArmL.rotateAngleX = -1.4137167F;
            this.crossArmL.rotateAngleY = (-(float)Math.PI / 10F);
            this.crossArmL.rotateAngleZ = -0.07853982F;
        } else {
            this.handR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
            this.handR.rotateAngleY = 0.0F;
            this.handR.rotateAngleZ = 0.0F;
            this.handL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
            this.handL.rotateAngleY = 0.0F;
            this.handL.rotateAngleZ = 0.0F;
            this.crossArmR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
            this.crossArmR.rotateAngleY = 0.0F;
            this.crossArmR.rotateAngleZ = 0.0F;
            this.crossArmL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.5F;
            this.crossArmL.rotateAngleY = 0.0F;
            this.crossArmL.rotateAngleZ = 0.0F;
        }

        AbstractIllagerEntity.ArmPose abstractillagerentity$armpose = entityIn.getArmPose();
        if (abstractillagerentity$armpose == AbstractIllagerEntity.ArmPose.ATTACKING) {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.handR.rotateAngleZ = 0.0F;
            this.handL.rotateAngleZ = 0.0F;
            this.handR.rotateAngleY = 0.15707964F;
            this.handL.rotateAngleY = -0.15707964F;
            if (entityIn.getPrimaryHand() == HandSide.RIGHT) {
                this.handR.rotateAngleX = -1.8849558F + MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
                this.handL.rotateAngleX = -0.0F + MathHelper.cos(ageInTicks * 0.19F) * 0.5F;
                this.handR.rotateAngleX += f * 2.2F - f1 * 0.4F;
                this.handL.rotateAngleX += f * 1.2F - f1 * 0.4F;
                this.crossArmR.rotateAngleX = -1.4137167F;
                this.crossArmR.rotateAngleY = ((float)Math.PI / 10F);
                this.crossArmR.rotateAngleZ = 0.07853982F;
                this.crossArmL.rotateAngleX = -1.4137167F;
                this.crossArmL.rotateAngleY = (-(float)Math.PI / 10F);
                this.crossArmL.rotateAngleZ = -0.07853982F;
            } else {
                this.handR.rotateAngleX = -0.0F + MathHelper.cos(ageInTicks * 0.19F) * 0.5F;
                this.handL.rotateAngleX = -1.8849558F + MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
                this.handR.rotateAngleX += f * 1.2F - f1 * 0.4F;
                this.handL.rotateAngleX += f * 2.2F - f1 * 0.4F;
                this.crossArmR.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F;
                this.crossArmR.rotateAngleY = 0.0F;
                this.crossArmR.rotateAngleZ = 0.0F;
                this.crossArmL.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount * 0.5F;
                this.crossArmL.rotateAngleY = 0.0F;
                this.crossArmL.rotateAngleZ = 0.0F;
            }

            this.handR.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.handL.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.handR.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            this.handL.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        } else if (abstractillagerentity$armpose == AbstractIllagerEntity.ArmPose.SPELLCASTING) {
            this.handR.rotationPointZ = 0.0F;
            this.handR.rotationPointX = -5.0F;
            this.handL.rotationPointZ = 0.0F;
            this.handL.rotationPointX = 5.0F;
            this.handR.rotateAngleX = -0.95F + MathHelper.cos(ageInTicks * 0.265F) * 0.075F;
            this.handL.rotateAngleX = -0.95F + MathHelper.cos(ageInTicks * 0.265F) * 0.075F;
            this.handR.rotateAngleZ = -MathHelper.cos(ageInTicks * 0.265F) * 0.075F;
            this.handL.rotateAngleZ = MathHelper.cos(ageInTicks * 0.265F) * 0.075F;
            this.handR.rotateAngleY = 0.0F;
            this.handL.rotateAngleY = 0.0F;
        } else if (abstractillagerentity$armpose == AbstractIllagerEntity.ArmPose.CELEBRATING) {
            this.handR.rotationPointZ = 0.0F;
            this.handR.rotationPointX = -5.0F;
            this.handR.rotateAngleX = MathHelper.cos(ageInTicks * 0.6662F) * 0.05F;
            this.handR.rotateAngleZ = 2.670354F;
            this.handR.rotateAngleY = 0.0F;
            this.handL.rotationPointZ = 0.0F;
            this.handL.rotationPointX = 5.0F;
            this.handL.rotateAngleX = MathHelper.cos(ageInTicks * 0.6662F) * 0.05F;
            this.handL.rotateAngleZ = -2.3561945F;
            this.handL.rotateAngleY = 0.0F;
            this.cape.rotateAngleX = 0.1F + limbSwingAmount * 0.6F + 0.5F;
        }

        boolean flag = abstractillagerentity$armpose == AbstractIllagerEntity.ArmPose.CROSSED;
        this.arms.showModel = flag;
        this.handL.showModel = !flag;
        this.handR.showModel = !flag;
    }

    */
/**
     * This is a helper function from Tabula to set the rotation of model parts
     *//*

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void translateHand(HandSide sideIn, MatrixStack matrixStackIn) {

    }

    @Override
    public ModelRenderer getModelHead() {
        return this.head;
    }
}*/
