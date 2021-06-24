package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;

public class DungeonsSapling extends SaplingBlock {

    public DungeonsSapling(SaplingGenerator generator) {
        super(generator, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));
    }

}