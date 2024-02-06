package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.TranslucentBlock;

import net.minecraft.sound.BlockSoundGroup;

public class Translucent extends TranslucentBlock {

    // generic translucent block

    public Translucent(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque());
    }

}