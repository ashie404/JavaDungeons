package juniebyte.javadungeons.mixin;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
abstract class ItemMixin {

	@Inject(method = "isUsedOnRelease", at = @At("HEAD"), cancellable = true)
	public void isUsedOnRelease(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
		if (itemStack.getItem() instanceof CrossbowItem) {
			cir.setReturnValue(true);
		}
	}
}