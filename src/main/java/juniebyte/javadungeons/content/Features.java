package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.feature.GlowMushroomFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.LakeFeature;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;

public class Features {

    public static Feature<SingleStateFeatureConfig> DUNGEONS_WATER_LAKE;
    public static Feature<CountConfig> GLOW_PLANTS;

    public static void init() {
        DUNGEONS_WATER_LAKE = register("dungeons_water_lake", new LakeFeature(SingleStateFeatureConfig.CODEC));

        GLOW_PLANTS = register("glow_plants", new GlowMushroomFeature(CountConfig.CODEC));
    }

    public static <T extends FeatureConfig> Feature<T> register(String name, Feature<T> feature) {
        return Registry.register(Registry.FEATURE, new Identifier(JavaDungeons.MOD_ID, name), feature);
    }

}
