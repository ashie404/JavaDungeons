package juniebyte.javadungeons.blocks;


import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsSlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public DungeonsBlock base;
    public DungeonsSlab slab;
    public DungeonsStairs stairs;

    public DungeonsSlabStairBlock(float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id, String slabId, String stairsId) {
        base = new DungeonsBlock(hardness, resistance, sounds, group, id);
        slab = new DungeonsSlab(hardness, resistance, sounds, group, slabId);
        stairs = new DungeonsStairs(hardness, resistance, sounds, base, group, stairsId);
    }
    
}