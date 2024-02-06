package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class Slab extends SlabBlock {

    // slab block

    public Slab(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}