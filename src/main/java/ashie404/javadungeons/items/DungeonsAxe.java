package ashie404.javadungeons.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;

public class DungeonsAxe extends AxeItem {

    public DungeonsAxe(ToolMaterial material, float attackDamage, float attackSpeed) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
    }

}