package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.PillarBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Pillar extends PillarBlock {

    // pillar block

    public Pillar(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}