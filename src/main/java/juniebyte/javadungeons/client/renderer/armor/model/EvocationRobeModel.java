/*
package juniebyte.javadungeons.client.renderer.armor.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.mob.ZombieVillagerEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.MerchantEntity;

@Environment(EnvType.CLIENT)
public class EvocationRobeModel<T extends LivingEntity> extends BipedEntityModel<T> {
	private final EquipmentSlot slot;
	private final LivingEntity entity;
	private final ModelPart Everything;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart Body;
	private final ModelPart Head;
    private final ModelPart Middle;
	private final ModelPart Back;
    private final ModelPart Brim;

	public EvocationRobeModel(float modelSize, EquipmentSlot slot, LivingEntity entity) {
		super(modelSize, 0.0F, 64, 64);
		this.slot = slot;
		this.entity = entity;
		textureWidth = 64;
		textureHeight = 64;

        Everything = new ModelPart(this);
        Everything.setPivot(0.0F, 24.0F, 0.0F);

        LeftArm = new ModelPart(this);
        LeftArm.setPivot(5.0F, -22.0F, 0.0F);
        Everything.addChild(LeftArm);
        LeftArm.setTextureOffset(16, 31).addCuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        RightArm = new ModelPart(this);
        RightArm.setPivot(-5.0F, -22.0F, 0.0F);
        Everything.addChild(RightArm);
        RightArm.setTextureOffset(0, 31).addCuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        Body = new ModelPart(this);
        Body.setPivot(0.0F, -24.0F, 0.0F);
        Everything.addChild(Body);
        Body.setTextureOffset(0, 0).addCuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);
        Body.setTextureOffset(0, 16).addCuboid(-4.0F, 12.5F, -2.0F, 8.0F, 4.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        Head = new ModelPart(this);
        Head.setPivot(0.0F, 0.0F, -5.0F);
        Everything.addChild(Head);
        setRotationAngle(Head, -0.1309F, 0.0F, 0.0F);

		boolean testificate =
				this.entity instanceof IllagerEntity ||
						this.entity instanceof ZombieVillagerEntity ||
						this.entity instanceof MerchantEntity;

		int testificateHelmetShiftUp = testificate ? 2 : 0;

        Back = new ModelPart(this);
        Back.setPivot(0.0F, -0.1141F, 11.2547F);
        Head.addChild(Back);
        setRotationAngle(Back, 1.0472F, 0.0F, 0.0F);
        Back.setTextureOffset(40, 25).addCuboid(-4.0F + 0.001F, -28.7859F + 13.125F - testificateHelmetShiftUp, 32.1453F - 22.75F - 6F, 7.99F, 6.0F, 4.0F, 0.5F, 0.5F, 0.5F);

        Middle = new ModelPart(this);
        Middle.setPivot(0.0F, 0.0F, -5.0F);
        Head.addChild(Middle);
        Middle.setTextureOffset(32, 0).addCuboid(-4.0F, -46.0F + 26.0F - testificateHelmetShiftUp, -4.0F + 4.0F, 8.0F, 13.0F, 8.0F, 0.5F, 0.5F, 0.5F);

        Brim = new ModelPart(this);
        Brim.setPivot(0.0F, 0.0F, 0.0F);
        Head.addChild(Brim);
        setRotationAngle(Brim, 0.1309F, 0.0F, 0.0F);
        Brim.setTextureOffset(0, 47).addCuboid(-8.0F, -33.7F + 26.0F - testificateHelmetShiftUp, -8.0F, 16.0F, 1.0F, 16.0F, 0.5F, 0.5F, 0.5F);
        */
/*
		Everything = new ModelRenderer(this);
		Everything.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, -12.0F, 0.0F);
		Everything.addChild(LeftLeg);
		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, -12.0F, 0.0F);
		Everything.addChild(RightLeg);
		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -22.0F, 0.0F);
		Everything.addChild(LeftArm);
		LeftArm.setTextureOffset(43, 41).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
		Everything.addChild(RightArm);
		RightArm.setTextureOffset(24, 24).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.5F, false);
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -24.0F, 0.0F);
		Everything.addChild(Body);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, 0.5F, 0.6F);
		Body.setTextureOffset(0, 8).addBox(-4.0F, 12.5F, -2.0F, 8.0F, 4.0F, 4.0F, 0.5F, 0.5F, 0.6F);
		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, -1.0F);
		Everything.addChild(Head);
		Head.setTextureOffset(0, 47).addBox(-7.0F, -33.7F + 27.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.5F, false);
		Head.setTextureOffset(26, 0).addBox(-4.0F, -45.7F + 27.0F, -2.3145F, 8.0F, 13.0F, 6.0F, 0.5F, 0.5F, 0.5F);
		Back = new ModelRenderer(this);
		Back.setRotationPoint(0.0F, -37.8F, 4.2F);
		Head.addChild(Back);
		setRotationAngle(Back, 0.7854F, 0.0F, 0.0F);
		Back.setTextureOffset(42, 25).addBox(-3.95F, -5.4142F + 19.0F, 1.5858F - 19.5F, 7.9F, 8.0F, 4.0F, 0.5F, false);
         *//*

	}

	@Override
	public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha){
		boolean testificate =
				this.entity instanceof IllagerEntity ||
						this.entity instanceof ZombieVillagerEntity ||
						this.entity instanceof MerchantEntity;

		boolean piglin =
				this.entity instanceof PiglinEntity ||
						this.entity instanceof ZombifiedPiglinEntity;



		if (this.slot == EquipmentSlot.HEAD) {
		*/
/*
			if (piglin) {
				matrixStackIn.push();
				this.piglin_helmet1.copyModelAngles(this.bipedHead);
				if (this.entity.isChild()) {
					matrixStack.scale(0.8F, 0.8F, 0.8F);
					this.piglin_helmet1.setRotationPoint(0.0F, 15.0F, 0.0F);
				}
				this.piglin_helmet1.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
				matrixStackIn.pop();
			} else if (testificate) {
				matrixStackIn.push();
				this.illager_helmet1.copyModelAngles(this.bipedHead);
				if (this.entity.isChild()) {
					matrixStackIn.scale(0.8F, 0.8F, 0.8F);
					this.illager_helmet1.setRotationPoint(0.0F, 15.0F, 0.0F);
				}
				this.illager_helmet1.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
				matrixStackIn.pop();
			} else {
		 *//*

			matrixStackIn.push();
			this.Head.copyTransform(this.head);
			if (this.entity.isBaby()) {
				matrixStackIn.scale(0.8F, 0.8F, 0.8F);
				this.Head.setPivot(0.0F, 15.0F, 0.0F);
			}
			this.Head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			matrixStackIn.pop();
			//}
		}

		if (this.slot == EquipmentSlot.CHEST) {
			matrixStackIn.push();

			this.Body.copyTransform(this.body);
			this.LeftArm.copyTransform(this.leftArm);
			this.RightArm.copyTransform(this.rightArm);
			if (this.entity.isBaby()) {
				matrixStackIn.scale(0.5F, 0.5F, 0.5F);
				this.Body.setPivot(0.0F, 24.0F, 0.0F);
				this.LeftArm.setPivot(5.0F, 24.0F, 0.0F);
				this.RightArm.setPivot(-5.0F, 24.0F, 0.0F);
			}
			this.LeftArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			this.RightArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			if (testificate) {
				matrixStackIn.scale(1.0F, 1.0F, 1.3F);
			}
			this.Body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			matrixStackIn.pop();
		}
	}

	public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
		modelRenderer.pivotX = x;
		modelRenderer.pivotY = y;
		modelRenderer.pivotZ = z;
	}

}*/
