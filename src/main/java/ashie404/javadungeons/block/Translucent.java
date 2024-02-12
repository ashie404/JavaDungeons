package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.TranslucentBlock;

public class Translucent extends TranslucentBlock {

    // generic translucent block

    public Translucent(Settings settings) {
        super(FabricBlockSettings.copyOf(settings).nonOpaque());
    }

}