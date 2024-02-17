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
    private final SpriteProvider spriteProvider;

    protected FlameParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float defaultScale, boolean flip, SpriteProvider spriteProvider) {
        super(world, x, y, z, velocityX, velocityY, velocityZ);
        this.spriteProvider = spriteProvider;
        this.scale = defaultScale;
        this.flip_h = flip;
        this.maxAge = 10+(int)Math.floor(random.nextFloat()*4);
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.age++ >= this.maxAge) {
            this.markDead();
            return;
        }
        this.velocityY -= 0.04 * (double)this.gravityStrength;
        this.move(this.velocityX, this.velocityY, this.velocityZ);
        if (this.ascending && this.y == this.prevPosY) {
            this.velocityX *= 1.1;
            this.velocityZ *= 1.1;
        }
        this.velocityX *= (double)this.velocityMultiplier;
        this.velocityY *= (double)this.velocityMultiplier;
        this.velocityZ *= (double)this.velocityMultiplier;
        if (this.onGround) {
            this.velocityX *= (double)0.7f;
            this.velocityZ *= (double)0.7f;
        }
        this.setSpriteForAge(this.spriteProvider);
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
        boolean flip = false;  
        public BigFlameFactory(SpriteProvider spriteProvider) {
           this.spriteProvider = spriteProvider;
        }   
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            flip = !flip;
           FlameParticle flameParticle = new FlameParticle(clientWorld, d, e, f, g, h, i, 0.6F, flip, spriteProvider);
           flameParticle.setSprite(this.spriteProvider);
           return flameParticle;
        }
    }

    public static class SmallFlameFactory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;    
        boolean flip = false;
        public SmallFlameFactory(SpriteProvider spriteProvider) {
           this.spriteProvider = spriteProvider;
        }   
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
           flip = !flip;
           FlameParticle flameParticle = new FlameParticle(clientWorld, d, e, f, g, h, i, 0.2F, flip, spriteProvider);
           flameParticle.setSprite(this.spriteProvider);
           return flameParticle;
        }
    }
}
