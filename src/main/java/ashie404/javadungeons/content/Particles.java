package ashie404.javadungeons.content;

import ashie404.javadungeons.registry.RegistryHelper;
import net.minecraft.particle.DefaultParticleType;

public class Particles {
    public static final DefaultParticleType FLAME = RegistryHelper.registerSimpleParticle("flame");
    public static final DefaultParticleType GREEN_FLAME = RegistryHelper.registerSimpleParticle("green_flame");
    public static final DefaultParticleType CANDLE_FLAME = RegistryHelper.registerSimpleParticle("candle_flame");
    public static final DefaultParticleType CANDLE_GREEN_FLAME = RegistryHelper.registerSimpleParticle("candle_green_flame");
    public static final DefaultParticleType EMBERS = RegistryHelper.registerSimpleParticle("embers");
    public static final DefaultParticleType GREEN_EMBERS = RegistryHelper.registerSimpleParticle("green_embers");
    public static final DefaultParticleType CANDLE_EMBERS = RegistryHelper.registerSimpleParticle("candle_embers");
    public static final DefaultParticleType GREEN_CANDLE_EMBERS = RegistryHelper.registerSimpleParticle("green_candle_embers");

    public static void init() {
        // stub to load class into memory/init static fields
    }
}