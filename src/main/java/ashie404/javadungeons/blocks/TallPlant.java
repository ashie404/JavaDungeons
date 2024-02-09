package ashie404.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.TallPlantBlock;

public class TallPlant extends TallPlantBlock {

    // tall plant block

    public TallPlant(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque().collidable(false));
    }

}