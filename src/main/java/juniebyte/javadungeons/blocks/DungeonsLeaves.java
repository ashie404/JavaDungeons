package juniebyte.javadungeons.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;

public class DungeonsLeaves extends LeavesBlock {

    // leaves block

    public BlockItem blockItem;

    public DungeonsLeaves() {
        super(FabricBlockSettings.of(Material.LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().allowsSpawning((state, world, pos, type) -> type == EntityType.OCELOT || type == EntityType.PARROT).suffocates((state, world, pos) -> false).blockVision((state, world, pos) -> false));
    }

}