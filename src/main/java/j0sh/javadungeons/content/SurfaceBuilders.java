package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.surface.CharredPumpkinPasturesSurfaceBuilder;
import j0sh.javadungeons.surface.SoggySwampSurfaceBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;

public class SurfaceBuilders {

    public static SoggySwampSurfaceBuilder SOGGY_SWAMP;
    public static CharredPumpkinPasturesSurfaceBuilder CHARRED_PUMPKIN_PASTURES;

    public static void init() {
        SOGGY_SWAMP = Registry.register(Registry.SURFACE_BUILDER, new Identifier(JavaDungeons.MOD_ID, "soggy_swamp_surface_builder"), new SoggySwampSurfaceBuilder(TernarySurfaceConfig::deserialize));
        CHARRED_PUMPKIN_PASTURES = Registry.register(Registry.SURFACE_BUILDER, new Identifier(JavaDungeons.MOD_ID, "charred_pumpkin_pastures"), new CharredPumpkinPasturesSurfaceBuilder(TernarySurfaceConfig::deserialize));
    }

}
