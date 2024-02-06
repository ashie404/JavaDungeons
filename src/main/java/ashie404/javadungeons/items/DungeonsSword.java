package ashie404.javadungeons.items;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class DungeonsSword extends SwordItem {

    public DungeonsSword(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }

}