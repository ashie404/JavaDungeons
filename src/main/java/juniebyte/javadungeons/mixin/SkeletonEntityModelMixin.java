package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

@Mixin(SkeletonEntityModel.class)
public class SkeletonEntityModelMixin {

	@Redirect(method = "animateModel", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"))
	private Item animateModel(ItemStack itemStack) {
		return itemStack.getItem() instanceof BowItem ? Items.BOW : itemStack.getItem();
	}

	@Redirect(method = "setAngles", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItem()Lnet/minecraft/item/Item;"))
	private Item setAngles(ItemStack itemStack) {
		return itemStack.getItem() instanceof BowItem ? Items.BOW : itemStack.getItem();
	}
}