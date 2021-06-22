package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.feature.GlowMushroomFeature;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.CountConfig;
import net.minecraft.world.gen.feature.LakeFeature;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;

public class Features {

    public static LakeFeature DUNGEONS_WATER_LAKE;

    public static GlowMushroomFeature GLOW_PLANTS;

    public static void init() {
        DUNGEONS_WATER_LAKE = Registry.register(Registry.FEATURE, new Identifier(JavaDungeons.MOD_ID, "dungeons_water_lake"), new LakeFeature(SingleStateFeatureConfig.CODEC));

        GLOW_PLANTS = Registry.register(Registry.FEATURE, new Identifier(JavaDungeons.MOD_ID, "glow_plants"), new GlowMushroomFeature(CountConfig.CODEC));
    }

}
