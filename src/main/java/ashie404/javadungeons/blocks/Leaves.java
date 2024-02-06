package ashie404.javadungeons.blocks;

import net.minecraft.block.LeavesBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class Leaves extends LeavesBlock {

    // leaves block

    public Leaves(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque()); 
    }

}