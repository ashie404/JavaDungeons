package juniebyte.javadungeons.mixin;

import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {

	@Redirect(method = "renderFirstPersonItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean renderFirstPersonItem(ItemStack itemStack, Item item) {
		return itemStack.getItem() instanceof CrossbowItem;
	}

	/*@Redirect(method = "renderFirstPersonItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean renderItem(ItemStack itemStack, Item item) {
		return itemStack.getItem() instanceof CrossbowItem || itemStack.getItem() instanceof BowItem;
	}*/
}