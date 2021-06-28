package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsTallPlant extends TallPlantBlock {

    // tall plant block

    public DungeonsTallPlant(Material material, float hardness, float resistance, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).nonOpaque().collidable(false));
    }

    public DungeonsTallPlant(Material material, BlockSoundGroup sounds) {
        super(FabricBlockSettings.of(material).sounds(sounds).nonOpaque().collidable(false).breakByHand(true).breakByTool(FabricToolTags.PICKAXES));
    }

}