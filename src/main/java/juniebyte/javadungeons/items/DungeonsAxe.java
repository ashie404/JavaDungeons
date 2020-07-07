package juniebyte.javadungeons.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

import juniebyte.javadungeons.JavaDungeons;

public class DungeonsAxe extends AxeItem {

    public DungeonsAxe(ToolMaterial material, float attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(JavaDungeons.WEAPONS));
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

}