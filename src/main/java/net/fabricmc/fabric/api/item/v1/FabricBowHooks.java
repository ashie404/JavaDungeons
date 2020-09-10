package net.fabricmc.fabric.api.item.v1;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

/**
 * An interface to implement for all custom bows.
 *
 */
public interface FabricBowHooks {
	/**
	 * Runs all of the default arrow functions first.
	 *
	 * @param arrowStack        The ItemStack for the arrows
	 * @param user              The user of the bow
	 * @param remainingUseTicks The ticks remaining on the bow usage
	 */
	public void onBowRelease(ItemStack arrowStack, LivingEntity user, int remainingUseTicks);
}