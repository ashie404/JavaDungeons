package ashie404.javadungeons.blocks;

import net.minecraft.sound.BlockSoundGroup;

public class DungeonsSlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public DungeonsBlock base;
    public DungeonsSlab slab;
    public DungeonsStairs stairs;

    public DungeonsSlabStairBlock(float hardness, float resistance, BlockSoundGroup sounds, String id, String slabId, String stairsId) {
        base = new DungeonsBlock(hardness, resistance, sounds, id);
        slab = new DungeonsSlab(hardness, resistance, sounds, slabId);
        stairs = new DungeonsStairs(hardness, resistance, sounds, base, stairsId);
    }
    
}