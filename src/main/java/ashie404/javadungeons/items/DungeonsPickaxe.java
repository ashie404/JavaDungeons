package ashie404.javadungeons.items;

import net.minecraft.item.PickaxeItem;
import ashie404.javadungeons.JavaDungeons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.ToolMaterial;

public class DungeonsPickaxe extends PickaxeItem {

    public DungeonsPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings());
        Registry.register(Registries.ITEM, JavaDungeons.ID(id), this);
    }

}