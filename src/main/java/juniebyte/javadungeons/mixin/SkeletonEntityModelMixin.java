package juniebyte.javadungeons.mixin;

import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SkeletonEntityModel.class)
public class SkeletonEntityModelMixin {

	@Redirect(method = "animateModel", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean animateModel(ItemStack itemStack, Item item) {
		return itemStack.getItem() instanceof BowItem;
	}

	@Redirect(method = "setAngles", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean setAngles(ItemStack itemStack, Item item) {
		return itemStack.getItem() instanceof BowItem;
	}
}