package j0sh.javadungeons.blocks;

import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsSlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public DungeonsBlock base;
    public DungeonsSlab slab;
    public DungeonsStairs stairs;

    public DungeonsSlabStairBlock(Material material, BlockSoundGroup sounds, ItemGroup group, String id, String slabId, String stairsId) {
        base = new DungeonsBlock(material, sounds, group, id);
        slab = new DungeonsSlab(material, sounds, group, slabId);
        stairs = new DungeonsStairs(material, sounds, base, group, stairsId);
    }
    
}