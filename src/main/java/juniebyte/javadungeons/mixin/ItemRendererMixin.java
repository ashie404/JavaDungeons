package juniebyte.javadungeons.mixin;

import juniebyte.javadungeons.content.Weapons;
import net.minecraft.block.Block;
import net.minecraft.block.StainedGlassPaneBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.client.render.item.ItemRenderer.getDirectItemGlintConsumer;
import static net.minecraft.client.render.item.ItemRenderer.getItemGlintConsumer;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {

    @Shadow @Final private ItemModels models;

    @Shadow protected abstract void renderBakedItemModel(BakedModel model, ItemStack stack, int light, int overlay, MatrixStack matrices, VertexConsumer vertices);

    @Inject(method = "renderItem(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformation$Mode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V", at=@At("RETURN"))
    public void renderItem(ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model, CallbackInfo info) {
        if (!stack.isEmpty()) {
            matrices.push();
            boolean bl = renderMode == ModelTransformation.Mode.GUI || renderMode == ModelTransformation.Mode.GROUND || renderMode == ModelTransformation.Mode.FIXED;
            if (stack.getItem() == Weapons.AXE && bl) {
                model = this.models.getModelManager().getModel(new ModelIdentifier("dungeons:axe_inventory#inventory"));
            }
            if (stack.getItem() == Weapons.BROADSWORD && bl) {
                model = this.models.getModelManager().getModel(new ModelIdentifier("dungeons:broadsword_inventory#inventory"));
            }
            model.getTransformation().getTransformation(renderMode).apply(leftHanded, matrices);
            matrices.translate(-0.5D, -0.5D, -0.5D);
            if (model.isBuiltin() || stack.getItem() == Items.TRIDENT && !bl) {
                model = this.models.getModelManager().getModel(new ModelIdentifier("minecraft:trident#inventory"));
            } else {
                boolean bl3;
                if (renderMode != ModelTransformation.Mode.GUI && !renderMode.isFirstPerson() && stack.getItem() instanceof BlockItem) {
                    Block block = ((BlockItem)stack.getItem()).getBlock();
                    bl3 = !(block instanceof TransparentBlock) && !(block instanceof StainedGlassPaneBlock);
                } else {
                    bl3 = true;
                }

                RenderLayer renderLayer = RenderLayers.getItemLayer(stack, bl3);
                VertexConsumer vertexConsumer4;
                if (bl3) {
                    vertexConsumer4 = getDirectItemGlintConsumer(vertexConsumers, renderLayer, true, stack.hasGlint());
                } else {
                    vertexConsumer4 = getItemGlintConsumer(vertexConsumers, renderLayer, true, stack.hasGlint());
                }

                this.renderBakedItemModel(model, stack, light, overlay, matrices, vertexConsumer4);
            }
            matrices.pop();
        }
    }

}
