package ashie404.javadungeons.items;

import ashie404.javadungeons.JavaDungeons;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.ToolMaterial;

public class DungeonsAxe extends AxeItem {

    public DungeonsAxe(ToolMaterial material, float attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
        Registry.register(Registries.ITEM, JavaDungeons.ID(id), this);
    }

}