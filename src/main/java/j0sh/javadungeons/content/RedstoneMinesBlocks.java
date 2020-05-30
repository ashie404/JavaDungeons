package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.*;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class RedstoneMinesBlocks {

    // crystals
    public static DungeonsCrystal RM_CRYSTALS;
    public static DungeonsRedstoneCrystal RM_REDSTONE_CRYSTALS;
    
    public static void init() {
        // crystals
        RM_CRYSTALS = new DungeonsCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_crystals");
        RM_REDSTONE_CRYSTALS = new DungeonsRedstoneCrystal(Material.STONE, BlockSoundGroup.STONE, JavaDungeons.REDSTONE_MINES, "rm_redstone_crystals");
    }
}