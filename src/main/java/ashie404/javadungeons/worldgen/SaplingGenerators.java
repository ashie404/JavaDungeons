package ashie404.javadungeons.worldgen;

import java.util.Optional;
import net.minecraft.block.SaplingGenerator;

public class SaplingGenerators {
    public static final SaplingGenerator RED_AUTUMNAL;
    public static final SaplingGenerator YELLOW_AUTUMNAL;
    public static final SaplingGenerator SWAMP;

    static {
        RED_AUTUMNAL = new SaplingGenerator("red_autumnal", Optional.empty(), Optional.of(DungeonsWorldgenFeatures.RED_AUTUMNAL), Optional.empty());
        YELLOW_AUTUMNAL = new SaplingGenerator("yellow_autumnal", Optional.empty(), Optional.of(DungeonsWorldgenFeatures.YELLOW_AUTUMNAL), Optional.empty());
        SWAMP = new SaplingGenerator("swamp", Optional.empty(), Optional.of(DungeonsWorldgenFeatures.SWAMP), Optional.empty());
    }
}
