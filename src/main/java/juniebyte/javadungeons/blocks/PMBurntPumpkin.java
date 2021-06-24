package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

public class PMBurntPumpkin extends Block {

    // generic block

    public BlockItem blockItem;

    public PMBurntPumpkin() {
        super(FabricBlockSettings.of(Material.GOURD, MapColor.BROWN).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    }

}