package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class Particles {
    public static final DefaultParticleType GREEN_FLAME = Registry.register(Registries.PARTICLE_TYPE, JavaDungeons.ID("green_flame"), FabricParticleTypes.simple());

    public static void init() {
        JavaDungeons.log.info("Registering Particles!");
    }
}