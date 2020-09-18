package juniebyte.javadungeons.client.renderer.armor.model;
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


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
import net.minecraft.entity.passive.AbstractTraderEntity;

public class PhantomArmorModel<T extends LivingEntity> extends BipedEntityModel<T> {
	private final EquipmentSlot slot;
	private final LivingEntity entity;
	private boolean unique;
	private final ModelPart Everything;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart ChinGuard;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public PhantomArmorModel(float modelSize, EquipmentSlot slot, LivingEntity entity, boolean unique) {
		super(modelSize, 0.0F, 64, 64);
		this.slot = slot;
		this.entity = entity;
		this.unique = unique;
		textureWidth = 64;
		textureHeight = 64;

		Everything = new ModelPart(this);
		Everything.setPivot(0.0F, 24.0F, 0.0F);

		boolean testificate =
				this.entity instanceof IllagerEntity ||
						this.entity instanceof ZombieVillagerEntity ||
						this.entity instanceof AbstractTraderEntity;

		int testificateHelmetShiftUp = testificate ? 2 : 0;

		Head = new ModelPart(this);
		Head.setPivot(0.0F, 0.0F, 0.0F);
		Everything.addChild(Head);
		Head.setTextureOffset(0, 0).addCuboid(-4.0F, -32.0F +24.0F - testificateHelmetShiftUp, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		Head.setTextureOffset(0, 42).addCuboid(-4.0F, -35.0F +24.0F - testificateHelmetShiftUp, -4.0F, 8.0F, 1.0F, 8.0F, 1.0F, false);

		Body = new ModelPart(this);
		Body.setPivot(0.0F, 0.0F, 0.0F);
		Everything.addChild(Body);
		Body.setTextureOffset(40, 0).addCuboid(-4.0F, -24.0F +24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.9F, false);

		ChinGuard = new ModelPart(this);
		ChinGuard.setPivot(0.0F, -15.0F, 0.0F);
		Head.addChild(ChinGuard);
		ChinGuard.setTextureOffset(0, 36).addCuboid(-4.0F, -7.7467F +24.0F, -5.0F, 8.0F, 2.0F, 2.0F, 0.0F, true);

		LeftArm = new ModelPart(this);
		LeftArm.setPivot(0.0F, 0.0F, 0.0F);
		Everything.addChild(LeftArm);
		LeftArm.setTextureOffset(0, 29).addCuboid(6.0F -8.0F + 2.0F, -25.0F + 22.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, false);
		LeftArm.setTextureOffset(0, 51).addCuboid(5.2F -8.0F + 2.0F, -21.0F + 22.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, false);
		LeftArm.setTextureOffset(16, 29).addCuboid(5.2F -8.0F + 2.0F, -26.8F + 22.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 23).addCuboid(7.0F -8.0F + 2.0F, -12.0F + 22.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.4F, true);
		LeftArm.setTextureOffset(0, 16).addCuboid(8.0F -8.0F + 2.0F, -15.0F + 22.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.5F, true);

		RightArm = new ModelPart(this);
		RightArm.setPivot(0.0F, 0.0F, 0.0F);
		Everything.addChild(RightArm);
		RightArm.setTextureOffset(0, 29).addCuboid(-10.0F +8.0F - 2.0F, -25.0F + 22.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.8F, true);
		RightArm.setTextureOffset(0, 51).addCuboid(-9.2F +8.0F - 2.0F, -21.0F + 22.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.2F, true);
		RightArm.setTextureOffset(16, 29).addCuboid(-9.2F +8.0F - 2.0F, -26.8F + 22.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		RightArm.setTextureOffset(0, 23).addCuboid(-9.0F +8.0F - 2.0F, -12.0F + 22.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.4F, false);
		RightArm.setTextureOffset(0, 16).addCuboid(-9.0F +8.0F - 2.0F, -15.0F + 22.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.5F, false);
		
	}

	@Override
	public void render(MatrixStack matrixStackIn, VertexConsumer bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha){
		boolean testificate =
				this.entity instanceof IllagerEntity ||
						this.entity instanceof ZombieVillagerEntity ||
						this.entity instanceof AbstractTraderEntity;

		boolean piglin =
				this.entity instanceof PiglinEntity ||
						this.entity instanceof ZombifiedPiglinEntity;



		if (this.slot == EquipmentSlot.HEAD) {
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
		 */
			matrixStackIn.push();
			this.Head.copyPositionAndRotation(this.head);
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

			this.Body.copyPositionAndRotation(this.torso);
			this.LeftArm.copyPositionAndRotation(this.leftArm);
			this.RightArm.copyPositionAndRotation(this.rightArm);
			if (this.entity.isBaby()) {
				matrixStackIn.scale(0.5F, 0.5F, 0.5F);
				this.Body.setPivot(0.0F, 24.0F, 0.0F);
				this.LeftArm.setPivot(5.0F, 24.0F, 0.0F);
				this.RightArm.setPivot(-5.0F, 24.0F, 0.0F);
			}
			this.LeftArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			if(this.unique){
				this.RightArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
			}
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
}