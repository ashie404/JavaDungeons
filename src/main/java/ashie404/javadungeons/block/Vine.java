package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.VineBlock;

public class Vine extends VineBlock {

    // vine block

    public Vine(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque());
    }
}
