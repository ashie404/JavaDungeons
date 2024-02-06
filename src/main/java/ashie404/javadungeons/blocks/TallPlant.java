package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.TallPlantBlock;
import net.minecraft.sound.BlockSoundGroup;

public class TallPlant extends TallPlantBlock {

    // tall plant block

    public TallPlant(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
    }

}