package juniebyte.javadungeons.items;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

import juniebyte.javadungeons.JavaDungeons;

public class DungeonsPickaxe extends PickaxeItem {

    public DungeonsPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(JavaDungeons.WEAPONS));
        Registry.register(Registries.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

}