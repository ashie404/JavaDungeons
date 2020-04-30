package j0sh.javadungeons.entities.renderers;

import j0sh.javadungeons.entities.GlaiveEntity;
import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.TridentEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class GlaiveEntityRenderer extends EntityRenderer<GlaiveEntity> {
   public static final Identifier SKIN = new Identifier(JavaDungeons.MOD_ID, "textures/entity/glaive.png");
   private final TridentEntityModel model = new TridentEntityModel();

   public GlaiveEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
      super(entityRenderDispatcher);
   }

   public void render(GlaiveEntity glaiveEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
      matrixStack.push();
      matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(MathHelper.lerp(g, glaiveEntity.prevYaw, glaiveEntity.yaw) - 90.0F));
      matrixStack.multiply(Vector3f.POSITIVE_Z.getDegreesQuaternion(MathHelper.lerp(g, glaiveEntity.prevPitch, glaiveEntity.pitch) + 90.0F));
      VertexConsumer vertexConsumer = ItemRenderer.getArmorVertexConsumer(vertexConsumerProvider, this.model.getLayer(this.getTexture(glaiveEntity)), false, glaiveEntity.hasEnchantmentGlint());
      this.model.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
      matrixStack.pop();
      super.render(glaiveEntity, f, g, matrixStack, vertexConsumerProvider, i);
   }

   public Identifier getTexture(GlaiveEntity glaiveEntity) {
      return SKIN;
   }
}
