package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.VineBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Vine extends VineBlock {

    // vine block

    public Vine(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque());
    }
}
