package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsSlab extends SlabBlock {

    public DungeonsSlab(Material material, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds));
    }

}