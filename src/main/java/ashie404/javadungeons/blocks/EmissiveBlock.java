package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

import net.minecraft.sound.BlockSoundGroup;

public class EmissiveBlock extends Block {

    // emissive block

    public EmissiveBlock(int lightLevel, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).luminance(lightLevel));
    }

}