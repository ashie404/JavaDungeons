package ashie404.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.AbstractBlock.Settings;

public class SlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public Block base;
    public SlabBlock slab;
    public StairsBlock stairs;

    public SlabStairBlock(Settings settings) {
        base = new Block(settings);
        slab = new SlabBlock(settings);
        stairs = new StairsBlock(base.getDefaultState(), settings);
    }
    
}