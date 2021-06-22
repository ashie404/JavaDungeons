package juniebyte.javadungeons.blocks;

import juniebyte.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DungeonsSapling extends SaplingBlock {

    public DungeonsSapling(SaplingGenerator generator, ItemGroup group, String id) {
        super(generator, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), new BlockItem(this, new Item.Settings().group(group)));
    }

}