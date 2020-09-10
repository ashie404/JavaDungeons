package juniebyte.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import net.fabricmc.fabric.api.item.v1.FabricCrossbowHooks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@Mixin(CrossbowItem.class)
public class CrossbowItemMixin {

	@Inject(method = "createArrow", at = @At(value = "RETURN"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void createArrow(World world, LivingEntity entity, ItemStack crossbow, ItemStack arrow,
			CallbackInfoReturnable<PersistentProjectileEntity> cir, ArrowItem arrowItem,
			PersistentProjectileEntity persistentProjectileEntity) {

		if (!(crossbow.getItem() instanceof CrossbowItem)) {
			return;
		}
		((FabricCrossbowHooks) crossbow.getItem()).createArrow(arrowItem, persistentProjectileEntity);
	}

	@Inject(method = "getSpeed", at = @At(value = "HEAD"))
	private static void tickMovement(ItemStack itemStack, CallbackInfoReturnable<Float> cir) {
		if (itemStack.getItem() instanceof CrossbowItem) {
			cir.setReturnValue(((FabricCrossbowHooks) itemStack.getItem()).getSpeed());
		}
	}
}