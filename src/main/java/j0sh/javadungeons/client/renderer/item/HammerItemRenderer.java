package j0sh.javadungeons.client.renderer.item;

import j0sh.javadungeons.client.renderer.model.HammerModel;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRenderer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class HammerItemRenderer implements BuiltinItemRenderer {

    private final HammerModel hammerModel = new HammerModel();
    private Identifier texture;

    public HammerItemRenderer(Identifier texture) {
        this.texture = texture;
    }

    @Override
    public void render(ItemStack itemStack, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int light, int overlay) {
        matrixStack.push();
        matrixStack.scale(1.0F, -1.0F, -1.0F);
        VertexConsumer vertexConsumer2 = ItemRenderer.getArmorVertexConsumer(vertexConsumerProvider, this.hammerModel.getLayer(texture), false, itemStack.hasEnchantmentGlint());
        this.hammerModel.render(matrixStack, vertexConsumer2, light, overlay, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.pop();
    }

}
