package ashie404.javadungeons.particle;

import net.minecraft.client.particle.AscendingParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFactory;
import net.minecraft.client.particle.ParticleTextureSheet;
import net.minecraft.client.particle.SpriteProvider;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;

public class EmbersParticle extends AscendingParticle {
    protected static final int[] EMBERS_PALETTE = {
        15091968,
        16748080,
        16763959,
        16756350
    };
    protected static final int[] GREEN_EMBERS_PALETTE = {
        9551683,
        6092876,
        9961373,
        9230912
    };
    protected static final int[] CANDLE_EMBERS_PALETTE = {
        16630528,
        16772420,
        16772731,
        11570688
    };
    private static float[] getRGBFfromInt(int argb) {
        float red = (float)ColorHelper.Argb.getRed(argb) / 255.0f;
        float green = (float)ColorHelper.Argb.getGreen(argb) / 255.0f;
        float blue = (float)ColorHelper.Argb.getBlue(argb) / 255.0f;
        return new float[]{red, green, blue};
    }

    protected EmbersParticle(ClientWorld world, float[] tint, double x, double y, double z, double velocityX, double velocityY, double velocityZ, float scaleMultiplier, SpriteProvider spriteProvider) {
        super(world, x, y, z, 0.1f, 0.5f, 0.1f, velocityX, velocityY, velocityZ, scaleMultiplier, spriteProvider, 0.0f, 20, 0.0f, true);
        this.red = tint[0];
        this.green = tint[1];
        this.blue = tint[2];
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.dead) {
            this.setAlpha(MathHelper.lerp((float)0.02f, (float)this.alpha, (float)0.0f));
        }
    }

    // Ember variant particle factories

    public static class DefaultFactory
    implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public DefaultFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            Random random = clientWorld.random;
            double j = (double)(random.nextFloat() - random.nextFloat()) * 0.025;
            double k = (double)random.nextFloat() * 0.5 * (double)random.nextFloat() * 0.1 * 3.0;
            double l = (double)(random.nextFloat() - random.nextFloat()) * 0.025;
            int palIndex = random.nextBetween(0, 3);
            return new EmbersParticle(clientWorld, getRGBFfromInt(EMBERS_PALETTE[palIndex]), d, e, f, j, k, l, 1.25f, this.spriteProvider);
        }
    }

    public static class GreenEmbersFactory
    implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public GreenEmbersFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            Random random = clientWorld.random;
            double j = (double)(random.nextFloat() - random.nextFloat()) * 0.025;
            double k = (double)random.nextFloat() * 0.5 * (double)random.nextFloat() * 0.1 * 3.0;
            double l = (double)(random.nextFloat() - random.nextFloat()) * 0.025;
            int palIndex = random.nextBetween(0, 3);
            return new EmbersParticle(clientWorld, getRGBFfromInt(GREEN_EMBERS_PALETTE[palIndex]), d, e, f, j, k, l, 1.25f, this.spriteProvider);
        }
    }

    public static class CandleEmbersFactory
    implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public CandleEmbersFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            Random random = clientWorld.random;
            double j = (double)(random.nextFloat() - random.nextFloat()) * 0.015;
            double k = (double)random.nextFloat() * 0.5 * (double)random.nextFloat() * 0.1 * 0.6;
            double l = (double)(random.nextFloat() - random.nextFloat()) * 0.015;
            int palIndex = random.nextBetween(0, 3);
            return new EmbersParticle(clientWorld, getRGBFfromInt(CANDLE_EMBERS_PALETTE[palIndex]), d, e, f, j, k, l, 0.9f, this.spriteProvider);
        }
    }

    public static class GreenCandleEmbersFactory
    implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider spriteProvider;

        public GreenCandleEmbersFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i) {
            Random random = clientWorld.random;
            double j = (double)(random.nextFloat() - random.nextFloat()) * 0.015;
            double k = (double)random.nextFloat() * 0.5 * (double)random.nextFloat() * 0.1 * 0.6;
            double l = (double)(random.nextFloat() - random.nextFloat()) * 0.015;
            int palIndex = random.nextBetween(0, 3);
            return new EmbersParticle(clientWorld, getRGBFfromInt(GREEN_EMBERS_PALETTE[palIndex]), d, e, f, j, k, l, 0.9f, this.spriteProvider);
        }
    }
}
