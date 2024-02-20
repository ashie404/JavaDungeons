package ashie404.javadungeons.block;

import com.mojang.serialization.MapCodec;

public class FallingBlock extends net.minecraft.block.FallingBlock {

    // generic falling block

    protected static final MapCodec<? extends FallingBlock> CODEC = createCodec(FallingBlock::new);

    protected MapCodec<? extends FallingBlock> getCodec() { return CODEC; }

    public FallingBlock(Settings settings) {
        super(settings);
    }

}