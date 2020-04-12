package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.redstonemines.*;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

public class RedstoneMinesBlocks {

    //Crystals
    public static DungeonsRedstoneCrystalTall TALL_REDSTONE_CRYSTAL;
    public static DungeonsRedstoneCrystalShort SHORT_REDSTONE_CRYSTAL;
    //public static DungeonsRedstoneCrystalVein REDSTONE_CRYSTAL_VEIN; 

    public static void init() {
        
        //new DungeonsRedstoneCrystal(Blocks.BASE, brokenbyhand?, preffered Tool, Group, POWER, HitboxType)
        //HitboxType's 0 = tall, 1 = short, 2 = vein, 3 = cluster

        TALL_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalTall(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 4, "tall_redstone_crystal");
        SHORT_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalShort(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 5, "short_redstone_crystal");
    }

}