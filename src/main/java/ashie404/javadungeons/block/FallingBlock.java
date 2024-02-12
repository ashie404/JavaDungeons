package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

public class FallingBlock extends net.minecraft.block.FallingBlock {

    // generic falling block

    protected MapCodec<? extends FallingBlock> getCodec() { return createCodec(FallingBlock::new); }

    public FallingBlock(Settings settings) {
        super(settings);
    }

}