package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.blocks.DungeonsRedstoneCrystalShort;
import j0sh.javadungeons.blocks.DungeonsRedstoneCrystalTall;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Blocks;

public class RedstoneMinesBlocks {

    //Crystals
    public static DungeonsRedstoneCrystalTall TALL_REDSTONE_CRYSTAL;
    public static DungeonsRedstoneCrystalShort SHORT_REDSTONE_CRYSTAL;

    public static void init() {
        TALL_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalTall(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 4, "rm_tall_redstone_crystal");
        SHORT_REDSTONE_CRYSTAL = new DungeonsRedstoneCrystalShort(Blocks.REDSTONE_BLOCK, false, FabricToolTags.PICKAXES, JavaDungeons.REDSTONE_MINES, 5, "rm_short_redstone_crystal");
    }

}