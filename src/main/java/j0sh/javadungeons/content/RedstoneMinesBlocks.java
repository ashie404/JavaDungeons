package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMinesBlocks {

    public static DungeonsRedstoneCrystal RM_REDSTONE_CRYSTALS;
    
    public static void init() {
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_redstone_crystals");
    }
}