package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LanternBlock;

import net.minecraft.sound.BlockSoundGroup;

public class Lantern extends LanternBlock {

    // lantern block

    public Lantern(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(15));    
    }

}