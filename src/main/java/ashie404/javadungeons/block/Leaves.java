package ashie404.javadungeons.block;

import net.minecraft.block.LeavesBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class Leaves extends LeavesBlock {

    // leaves block

    public Leaves(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque()); 
    }

}