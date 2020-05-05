package j0sh.javadungeons.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.entities.GlaiveEntity;

public class DungeonsGlaive extends TridentItem {

   public DungeonsGlaive(final String id) {
      super(new Item.Settings().group(JavaDungeons.WEAPONS));
      Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
   }

   @Override
   public void onStoppedUsing(final ItemStack stack, final World world, final LivingEntity user, final int remainingUseTicks) {
      if (user instanceof PlayerEntity) {
         final PlayerEntity playerEntity = (PlayerEntity)user;
         final int i = this.getMaxUseTime(stack) - remainingUseTicks;
         if (i >= 10) {
            if (!world.isClient) {
               stack.damage(1, playerEntity, ((player) -> {
                  player.sendToolBreakStatus(user.getActiveHand());
               }));
                  final GlaiveEntity glaiveEntity = new GlaiveEntity(world, playerEntity, stack);
                  glaiveEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 0.0F, 2.5F, 1.0F);
                  if (playerEntity.abilities.creativeMode) {
                     glaiveEntity.pickupType = PersistentProjectileEntity.PickupPermission.CREATIVE_ONLY;
                  }
                  world.spawnEntity(glaiveEntity);
                  world.playSoundFromEntity((PlayerEntity)null, glaiveEntity, SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.PLAYERS, 1.0F, 1.0F);
                  if (!playerEntity.abilities.creativeMode) {
                     playerEntity.inventory.removeOne(stack);
                  }
            }
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this)); 
         }
      }
   }

   @Override
   public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
      ItemStack itemStack = user.getStackInHand(hand);
      if (itemStack.getDamage() >= itemStack.getMaxDamage() - 1) {
         return TypedActionResult.fail(itemStack);
      } else {
         user.setCurrentHand(hand);
         return TypedActionResult.consume(itemStack);
      }
   }
}