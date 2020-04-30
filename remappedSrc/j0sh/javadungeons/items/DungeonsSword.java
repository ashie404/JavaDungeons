package j0sh.javadungeons.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

import j0sh.javadungeons.JavaDungeons;

public class DungeonsSword extends SwordItem {

    public DungeonsSword(ToolMaterial material, int attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(JavaDungeons.WEAPONS));
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

}