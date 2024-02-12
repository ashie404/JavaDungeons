package ashie404.javadungeons.block;

import java.util.function.ToIntFunction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.state.property.Properties;

public class PoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    private static int lightLvl;

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(Properties.LIT) ? lightLvl : 0; };
    }

    public PoweredEmissive(Settings settings, int lightLevel) {
        super(FabricBlockSettings.copyOf(settings).luminance(getLightLevel()));
        lightLvl = lightLevel;       
    }

}