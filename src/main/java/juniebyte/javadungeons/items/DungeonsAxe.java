package juniebyte.javadungeons.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

import juniebyte.javadungeons.JavaDungeons;

public class DungeonsAxe extends AxeItem {

    public DungeonsAxe(ToolMaterial material, float attackDamage, float attackSpeed, String id) {
        super(material, attackDamage, attackSpeed, new Item.Settings().group(JavaDungeons.WEAPONS));
        Registry.register(Registries.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

}