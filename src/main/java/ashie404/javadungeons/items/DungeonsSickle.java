package ashie404.javadungeons.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class DungeonsSickle extends HoeItem {

    public DungeonsSickle(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }

}