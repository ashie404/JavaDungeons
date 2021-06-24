package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsStairs extends StairsBlock {

    public DungeonsStairs(Material material, float hardness, float resistance, BlockSoundGroup sounds, Block base) {
        super(base.getDefaultState(), FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds));
    }

}