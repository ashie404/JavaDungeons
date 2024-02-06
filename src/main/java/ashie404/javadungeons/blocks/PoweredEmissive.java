package ashie404.javadungeons.blocks;

import java.util.function.ToIntFunction;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;

import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;

public class PoweredEmissive extends RedstoneLampBlock {

    // redstone emissive block

    private static int lightLvl;

    private static ToIntFunction<BlockState> getLightLevel() {
        return (blockState) -> { return blockState.get(Properties.LIT) ? lightLvl : 0; };
    }

    public PoweredEmissive(int lightLevel, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(getLightLevel()));
        lightLvl = lightLevel;
        
    }

}