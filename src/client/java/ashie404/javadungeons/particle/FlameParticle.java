package ashie404.javadungeons.particle;

import net.minecraft.client.particle.AbstractSlowingParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.MathHelper;

public class FlameParticle extends AbstractSlowingParticle {
    protected boolean flip_h = false;

    protected FlameParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float defaultScale) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        scale = defaultScale;
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

    public int getBrightness(float tint) {
        float f = ((float)this.age + tint) / (float)this.maxAge;
        f = MathHelper.clamp(f, 0.0F, 1.0F);
        int i = super.getBrightness(tint);
        int j = i & 255;
        int k = i >> 16 & 255;
        j += (int)(f * 15.0F * 16.0F);
        if (j > 240) {
            j = 240;
        }

        return j | k << 16;
    }

    public static class BigFlameFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;    
        public BigFlameFactory(SpriteProvider spriteProvider) {
           this.spriteProvider = spriteProvider;
        }   
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
           FlameParticle flameParticle = new FlameParticle(clientWorld, d, e, f, g, h, i, 0.6F);
           flameParticle.setSprite(this.spriteProvider);
           return flameParticle;
        }
    }

    public static class SmallFlameFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;    
        public SmallFlameFactory(SpriteProvider spriteProvider) {
           this.spriteProvider = spriteProvider;
        }   
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
           FlameParticle flameParticle = new FlameParticle(clientWorld, d, e, f, g, h, i, 0.2F);
           flameParticle.setSprite(this.spriteProvider);
           return flameParticle;
        }
    }
}
