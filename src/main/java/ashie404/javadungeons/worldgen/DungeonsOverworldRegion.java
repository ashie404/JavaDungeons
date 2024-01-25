package ashie404.javadungeons.worldgen;

import com.mojang.datafixers.util.Pair;

import ashie404.javadungeons.biome.Biomes;

import java.util.function.Consumer;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import static terrablender.api.ParameterUtils.*;

public class DungeonsOverworldRegion extends Region {
    public static final Identifier LOCATION = new Identifier("dungeons:overworld_1");

    public DungeonsOverworldRegion(int weight) {
        super(LOCATION, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();

        // Build biome parameter list
        new ParameterPointListBuilder()
            .temperature(Temperature.span(Temperature.WARM, Temperature.HOT))
            .humidity(Humidity.span(Humidity.DRY, Humidity.ARID))
            .continentalness(Continentalness.INLAND)
            .erosion(Erosion.EROSION_0, Erosion.EROSION_1)
            .depth(Depth.SURFACE, Depth.FLOOR)
            .weirdness(Weirdness.MID_SLICE_NORMAL_ASCENDING, Weirdness.MID_SLICE_NORMAL_DESCENDING)
            .build().forEach(point -> builder.add(point, Biomes.CACTI_CANYON));

        // Add points to the mapper
        builder.build().forEach(mapper);
    }
    
}
