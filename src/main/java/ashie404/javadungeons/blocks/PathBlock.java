package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.DirtPathBlock;

import net.minecraft.sound.BlockSoundGroup;

public class PathBlock extends DirtPathBlock {

    // path block

    public PathBlock(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}