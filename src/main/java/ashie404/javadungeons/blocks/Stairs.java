package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Stairs extends StairsBlock {

    // stairs block

    public Stairs(float hardness, float resistance, BlockSoundGroup sounds, Block base) {
        super(base.getDefaultState(), FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}