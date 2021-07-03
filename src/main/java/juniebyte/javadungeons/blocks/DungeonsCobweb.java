package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.CobwebBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsCobweb extends CobwebBlock {

    // cobweb block

    public DungeonsCobweb(Material material, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds));
    }

}