package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class CreepingWinterBlocks {

    public static DungeonsBlock CI_ICE_BRICKS;

    public static void init() {
        CI_ICE_BRICKS = new DungeonsBlock(Material.DENSE_ICE, 0.5F, 0.5F, BlockSoundGroup.STONE, JavaDungeons.CREEPING_WINTER, "ci_ice_bricks");
    }
    
}