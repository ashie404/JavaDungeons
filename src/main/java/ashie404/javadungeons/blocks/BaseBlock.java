package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class BaseBlock extends Block {

    // generic block

    public BaseBlock(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}