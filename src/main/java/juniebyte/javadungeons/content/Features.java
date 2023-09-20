package juniebyte.javadungeons.content;

import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.LakeFeature;
import net.minecraft.world.gen.feature.SeaPickleFeatureConfig;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.feature.*;

public class Features {

    public static LakeFeature DUNGEONS_WATER_LAKE;

    public static GlowMushroomFeature GLOW_PLANTS;

    public static void init() {
        DUNGEONS_WATER_LAKE = Registry.register(Registry.FEATURE, new Identifier(JavaDungeons.MOD_ID, "dungeons_water_lake"), new LakeFeature(SingleStateFeatureConfig.CODEC));

        GLOW_PLANTS = Registry.register(Registry.FEATURE, new Identifier(JavaDungeons.MOD_ID, "glow_plants"), new GlowMushroomFeature(SeaPickleFeatureConfig.CODEC));
    }

}