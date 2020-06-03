package j0sh.javadungeons.content;

import j0sh.javadungeons.gen.*;
import j0sh.javadungeons.JavaDungeons;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SurfaceBuilders {
    
    public static SurfaceBuilder<TernarySurfaceConfig> CACTI_CANYON;
    public static SurfaceBuilder<TernarySurfaceConfig> SOGGY_SWAMP;

    public static void init() {
        SOGGY_SWAMP = Registry.register(Registry.SURFACE_BUILDER, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_surface_builder"), new SoggySwampSurfaceBuilder(TernarySurfaceConfig.CODEC));
        CACTI_CANYON = Registry.register(Registry.SURFACE_BUILDER, new Identifier(JavaDungeons.MOD_ID, "cacti_canyon"), new CactiCanyonSurfaceBuilder(TernarySurfaceConfig.CODEC));
    }
}