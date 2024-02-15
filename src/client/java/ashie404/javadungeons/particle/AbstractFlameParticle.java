package ashie404.javadungeons.particle;

import net.minecraft.client.particle.*;

import net.minecraft.client.world.ClientWorld;

public abstract class AbstractFlameParticle extends AbstractSlowingParticle {
   // Slowing particle with randomly flipped sprite

   protected boolean flip_h = false;

   protected AbstractFlameParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        flip_h = random.nextBoolean();
   }

   @Override
   protected float getMinU() {
      return flip_h ? this.sprite.getMaxU() : this.sprite.getMinU();
   }

   @Override
   protected float getMaxU() {
      return flip_h ? this.sprite.getMinU() : this.sprite.getMaxU();
   }
}
