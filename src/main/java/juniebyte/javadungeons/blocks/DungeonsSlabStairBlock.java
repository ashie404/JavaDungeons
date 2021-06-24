package juniebyte.javadungeons.blocks;

import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsSlabStairBlock {

    // slab, stairs, and fullblock variant initalizer thingy

    public DungeonsBlock base;
    public DungeonsSlab slab;
    public DungeonsStairs stairs;

    public DungeonsSlabStairBlock(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id, String slabId, String stairsId) {
        base = new DungeonsBlock(material, hardness, resistance, sounds);
        slab = new DungeonsSlab(material, hardness, resistance, sounds);
        stairs = new DungeonsStairs(material, hardness, resistance, sounds, base, group, stairsId);
    }
    
}