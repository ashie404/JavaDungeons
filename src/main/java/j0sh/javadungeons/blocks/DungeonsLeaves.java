package j0sh.javadungeons.blocks;

import net.minecraft.block.LeavesBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import j0sh.javadungeons.JavaDungeons;

public class DungeonsLeaves extends LeavesBlock {

    // leaves block

    public BlockItem blockItem;

    public DungeonsLeaves(Material material, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}