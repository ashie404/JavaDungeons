package ashie404.javadungeons.worldgen;

import java.util.Optional;

import ashie404.javadungeons.worldgen.feature.DungeonsFeatures;
import net.minecraft.block.SaplingGenerator;

public class SaplingGenerators {
    public static final SaplingGenerator RED_AUTUMNAL;
    public static final SaplingGenerator YELLOW_AUTUMNAL;
    public static final SaplingGenerator SWAMP;

    static {
        RED_AUTUMNAL = new SaplingGenerator("red_autumnal", Optional.empty(), Optional.of(DungeonsFeatures.RED_AUTUMNAL_TREE), Optional.empty());
        YELLOW_AUTUMNAL = new SaplingGenerator("yellow_autumnal", Optional.empty(), Optional.of(DungeonsFeatures.YELLOW_AUTUMNAL_TREE), Optional.empty());
        SWAMP = new SaplingGenerator("swamp", Optional.empty(), Optional.of(DungeonsFeatures.SOGGY_SWAMP_TREE), Optional.empty());
    }
}
