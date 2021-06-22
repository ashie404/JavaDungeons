package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

@Mixin(ProjectileUtil.class)
public class ProjectileUtilMixin {

	@Inject(method = "getHandPossiblyHolding", at = @At(value = "HEAD"), cancellable = true)
	private static void getHandPossiblyHolding(LivingEntity entity, Item item, CallbackInfoReturnable<Hand> cir) {
		if (item == Items.CROSSBOW) {
			boolean inMainHand = entity.getStackInHand(Hand.MAIN_HAND).getItem() instanceof CrossbowItem;
			boolean inOffHand = entity.getStackInHand(Hand.OFF_HAND).getItem() instanceof CrossbowItem;

			if (inMainHand || inOffHand) {
				cir.setReturnValue(inMainHand ? Hand.MAIN_HAND : Hand.OFF_HAND);
			}
		} else if (item == Items.BOW) {
			boolean inMainHand = entity.getStackInHand(Hand.MAIN_HAND).getItem() instanceof BowItem;
			boolean inOffHand = entity.getStackInHand(Hand.OFF_HAND).getItem() instanceof BowItem;

			if (inMainHand || inOffHand) {
				cir.setReturnValue(inMainHand ? Hand.MAIN_HAND : Hand.OFF_HAND);
			}
		}
	}
}