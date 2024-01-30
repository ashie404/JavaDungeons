package ashie404.javadungeons.biome;

import com.mojang.datafixers.util.Pair;

import ashie404.javadungeons.JavaDungeons;

import java.util.function.Consumer;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class DungeonsOverworldRegion extends Region {
    public static final Identifier LOCATION = JavaDungeons.ID("overworld");

    public DungeonsOverworldRegion(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        // TODO : make dungeons biomes have actual worldgen settings and not just modify vanilla biomes
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.ERODED_BADLANDS, Biomes.CACTI_CANYON);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.BADLANDS, Biomes.CACTI_CANYON_DESERT);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, Biomes.CREEPER_WOODS);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, Biomes.SQUID_COAST);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.MEADOW, Biomes.PUMPKIN_PASTURES);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.SWAMP, Biomes.SOGGY_SWAMP);
        });
    }
    
}
