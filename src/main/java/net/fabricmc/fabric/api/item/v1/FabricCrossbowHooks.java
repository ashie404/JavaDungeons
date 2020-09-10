package net.fabricmc.fabric.api.item.v1;

import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;

/**
 * An interface to implement on all custom crossbows
 *
 */
public interface FabricCrossbowHooks {

	/**
	 * Allows editing of the shot arrow from the crossbow. All default crossbow
	 * properties are applied first.
	 *
	 * @param arrowItem                  The arrow type
	 * @param persistentProjectileEntity The arrow entity
	 */
	void createArrow(ArrowItem arrowItem, PersistentProjectileEntity persistentProjectileEntity);

	/**
	 * Gets the speed of the crossbow projectile
	 *
	 * @return The speed
	 */
	float getSpeed();

}