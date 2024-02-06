package ashie404.javadungeons.items;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class DungeonsPickaxe extends PickaxeItem {

    public DungeonsPickaxe(ToolMaterial material, int attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }

}