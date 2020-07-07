package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Particles {
    public static DefaultParticleType GREEN_FLAME;

    public static void init() {
        GREEN_FLAME = Registry.register(Registry.PARTICLE_TYPE, new Identifier(JavaDungeons.MOD_ID, "green_flame"), FabricParticleTypes.simple(true));
    }
}