package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.sound.BlockSoundGroup;

public class Sapling extends SaplingBlock {

    // sapling block

    public Sapling(SaplingGenerator generator, float hardness, float resistance, BlockSoundGroup sounds) {
        super(generator, FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds).collidable(false));
        
    }

}