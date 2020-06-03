package j0sh.javadungeons.particles;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.world.ClientWorld;

@Environment(EnvType.CLIENT)
public class GreenFlameParticle extends SpriteBillboardParticle {
   private GreenFlameParticle(ClientWorld world, double x, double y, double z, double d, double e, double f) {
      super(world, x, y, z, d, e, f);
      this.velocityX = this.velocityX * 0.009999999776482582D + d;
      this.velocityY = this.velocityY * 0.009999999776482582D + e;
      this.velocityZ = this.velocityZ * 0.009999999776482582D + f;
      this.x += (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.05F);
      this.y += (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.05F);
      this.z += (double)((this.random.nextFloat() - this.random.nextFloat()) * 0.05F);
      this.maxAge = (int)(8.0D / (Math.random() * 0.8D + 0.2D)) + 4;
   }

   public ParticleTextureSheet getType() {
      return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
   }

   public void move(double dx, double dy, double dz) {
      this.setBoundingBox(this.getBoundingBox().offset(dx, dy, dz));
      this.repositionFromBoundingBox();
   }

   public float getSize(float tickDelta) {
      float f = ((float)this.age + tickDelta) / (float)this.maxAge;
      return this.scale * (1.0F - f * f * 0.5F);
   }

   public int getColorMultiplier(float tint) {
      float f = ((float)this.age + tint) / (float)this.maxAge;
      f = MathHelper.clamp(f, 0.0F, 1.0F);
      int i = super.getColorMultiplier(tint);
      int j = i & 255;
      int k = i >> 16 & 255;
      j += (int)(f * 15.0F * 16.0F);
      if (j > 240) {
         j = 240;
      }

      return j | k << 16;
   }

   public void tick() {
      this.prevPosX = this.x;
      this.prevPosY = this.y;
      this.prevPosZ = this.z;
      if (this.age++ >= this.maxAge) {
         this.markDead();
      } else {
         this.move(this.velocityX, this.velocityY, this.velocityZ);
         this.velocityX *= 0.9599999785423279D;
         this.velocityY *= 0.9599999785423279D;
         this.velocityZ *= 0.9599999785423279D;
         if (this.onGround) {
            this.velocityX *= 0.699999988079071D;
            this.velocityZ *= 0.699999988079071D;
         }

      }
   }

   @Environment(EnvType.CLIENT)
   public static class Factory implements ParticleFactory<DefaultParticleType> {
      private final SpriteProvider field_17812;

      public Factory(SpriteProvider spriteProvider) {
         this.field_17812 = spriteProvider;
      }

      public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld world, double d, double e, double f, double g, double h, double i) {
         GreenFlameParticle flameParticle = new GreenFlameParticle(world, d, e, f, g, h, i);
         flameParticle.setSprite(this.field_17812);
         return flameParticle;
      }
   }
}
