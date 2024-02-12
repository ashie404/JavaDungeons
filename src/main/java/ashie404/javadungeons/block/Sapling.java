package ashie404.javadungeons.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;

public class Sapling extends SaplingBlock {

    // sapling block

    public Sapling(SaplingGenerator generator, Settings settings) {
        super(generator, FabricBlockSettings.copyOf(settings).nonOpaque().collidable(false));
        
    }

}