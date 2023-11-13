package ashie404.javadungeons.biome;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class Biomes {
    public static final RegistryKey<Biome> CACTI_CANYON_DESERT = register("cacti_canyon_desert");
    public static final RegistryKey<Biome> CACTI_CANYON = register("cacti_canyon");
    public static final RegistryKey<Biome> CREEPER_WOODS = register("creeper_woods");
    public static final RegistryKey<Biome> DUNGEONS_PLAINS = register("dungeons_plains");
    public static final RegistryKey<Biome> PUMPKIN_PASTURES = register("pumpkin_pastures");
    public static final RegistryKey<Biome> SOGGY_SWAMP = register("soggy_swamp");

    public static void init() {

    }
    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(JavaDungeons.MOD_ID, name));
    }
}
