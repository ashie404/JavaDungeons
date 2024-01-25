package ashie404.javadungeons.biome;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.worldgen.DungeonsOverworldRegion;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import terrablender.api.Regions;

public class Biomes {
    public static final RegistryKey<Biome> CACTI_CANYON_DESERT = register("cacti_canyon_desert");
    public static final RegistryKey<Biome> CACTI_CANYON = register("cacti_canyon");
    public static final RegistryKey<Biome> CREEPER_WOODS = register("creeper_woods");
    public static final RegistryKey<Biome> DUNGEONS_PLAINS = register("dungeons_plains");
    public static final RegistryKey<Biome> PUMPKIN_PASTURES = register("pumpkin_pastures");
    public static final RegistryKey<Biome> SOGGY_SWAMP = register("soggy_swamp");

    public static void init(Registerable<Biome> ctx) {
        ctx.register(CACTI_CANYON, cactiCanyon(ctx));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome cactiCanyon(Registerable<Biome> ctx) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
            new GenerationSettings.LookupBackedBuilder(ctx.getRegistryLookup(RegistryKeys.PLACED_FEATURE), 
                ctx.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        
        

    }

    private static RegistryKey<Biome> register(String name)
    {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(JavaDungeons.MOD_ID, name));
    }
}
