package ashie404.javadungeons.blocks;

import com.mojang.serialization.MapCodec;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;

public class FallingBlock extends net.minecraft.block.FallingBlock {

    // generic falling block

    protected MapCodec<? extends FallingBlock> getCodec() { return createCodec(FallingBlock::new); }

    private FallingBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public FallingBlock(float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.create().strength(hardness, resistance).sounds(sounds));
    }

}