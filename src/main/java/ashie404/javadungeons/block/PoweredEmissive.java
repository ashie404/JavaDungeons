package ashie404.javadungeons.block;

import java.util.function.ToIntFunction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.RedstoneLampBlock;

public class PoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    private static int lightLvl = 15;

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(LIT) ? lightLvl : 0; };
    }

    public PoweredEmissive(int lightLevel, Settings settings) {
        super(FabricBlockSettings.copyOf(settings).luminance(getLightLevel()));
        lightLvl = lightLevel;       
    }

}