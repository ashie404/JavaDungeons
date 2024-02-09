package ashie404.javadungeons.worldgen;

import java.util.Optional;

import ashie404.javadungeons.content.Features;
import net.minecraft.block.SaplingGenerator;

public class SaplingGenerators {
    public static final SaplingGenerator RED_AUTUMNAL;
    public static final SaplingGenerator YELLOW_AUTUMNAL;
    public static final SaplingGenerator SWAMP;
    public static final SaplingGenerator DINGY_JUNGLE;

    static {
        RED_AUTUMNAL = new SaplingGenerator("red_autumnal", Optional.empty(), Optional.of(Features.RED_AUTUMNAL_TREE), Optional.empty());
        YELLOW_AUTUMNAL = new SaplingGenerator("yellow_autumnal", Optional.empty(), Optional.of(Features.YELLOW_AUTUMNAL_TREE), Optional.empty());
        SWAMP = new SaplingGenerator("swamp", Optional.empty(), Optional.of(Features.SOGGY_SWAMP_TREE), Optional.empty());
        DINGY_JUNGLE = new SaplingGenerator("dingy_jungle", Optional.of(Features.MEGA_JUNGLE_TREE), Optional.of(Features.JUNGLE_TREE), Optional.of(Features.JUNGLE_OAK)); 
    }
}
