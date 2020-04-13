package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.redstonemines.*;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

public class RedstoneMinesBlocks {

    //Crystals
    public static DungeonsRedstoneCrystalTall TALL_REDSTONE_CRYSTAL;
    public static DungeonsRedstoneCrystalShort SHORT_REDSTONE_CRYSTAL;
    public static DungeonsRedstoneCrystalVein REDSTONE_CRYSTAL_VEIN; 
    public static DungeonsRedstoneCrystalCluster REDSTONE_CRYSTAL_CLUSTER;

    public static void init() {

        TALL_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalTall(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 4, 3, "tall_redstone_crystal");
        SHORT_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalShort(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 5, 3, "short_redstone_crystal");
        REDSTONE_CRYSTAL_VEIN = new DungeonsRedstoneCrystalVein(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 9, 3, "redstone_crystal_vein");
        REDSTONE_CRYSTAL_CLUSTER = new DungeonsRedstoneCrystalCluster(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 13, 3, "redstone_crystal_cluster");
    }

}