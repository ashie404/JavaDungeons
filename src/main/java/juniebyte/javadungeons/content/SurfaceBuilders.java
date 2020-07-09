package juniebyte.javadungeons.content;

import juniebyte.javadungeons.gen.*;
import juniebyte.javadungeons.JavaDungeons;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SurfaceBuilders {
    
    public static SurfaceBuilder<TernarySurfaceConfig> CACTI_CANYON;

    public static void init() {
        CACTI_CANYON = Registry.register(Registry.SURFACE_BUILDER, new Identifier(JavaDungeons.MOD_ID, "cacti_canyon"), new CactiCanyonSurfaceBuilder(TernarySurfaceConfig.CODEC));
    }
}