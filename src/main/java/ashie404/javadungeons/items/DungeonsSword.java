package ashie404.javadungeons.items;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

public class DungeonsSword extends SwordItem {

    public DungeonsSword(ToolMaterial material, int attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
        Registry.register(Registries.ITEM, JavaDungeons.ID(id), this);
    }

}