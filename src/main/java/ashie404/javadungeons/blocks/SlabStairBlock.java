package ashie404.javadungeons.blocks;

import net.minecraft.sound.BlockSoundGroup;

public class SlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public BaseBlock base;
    public Slab slab;
    public Stairs stairs;

    public SlabStairBlock(float hardness, float resistance, BlockSoundGroup sounds, String id, String slabId, String stairsId) {
        base = new BaseBlock(hardness, resistance, sounds, id);
        slab = new Slab(hardness, resistance, sounds, slabId);
        stairs = new Stairs(hardness, resistance, sounds, base, stairsId);
    }
    
}