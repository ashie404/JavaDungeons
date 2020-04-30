package j0sh.javadungeons.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ToolMaterial;

import com.google.common.collect.Multimap;

import j0sh.javadungeons.JavaDungeons;

public class DungeonsSickle extends HoeItem {

    private final float attackSpeed;
    private final float attackDamage;

    public DungeonsSickle(ToolMaterial material, float attackDamage, float attackSpeed, String id) {
        super(material, attackSpeed, new Item.Settings().group(JavaDungeons.WEAPONS));
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

    @Override
    public Multimap<String, EntityAttributeModifier> getModifiers(EquipmentSlot slot) {
        Multimap<String, EntityAttributeModifier> multimap = super.getModifiers(slot);
        if (slot == EquipmentSlot.MAINHAND) {
           multimap.put(EntityAttributes.ATTACK_DAMAGE.getId(), new EntityAttributeModifier(ATTACK_DAMAGE_MODIFIER_UUID, "Weapon modifier", (double)this.attackDamage, EntityAttributeModifier.Operation.ADDITION));
           multimap.put(EntityAttributes.ATTACK_SPEED.getId(), new EntityAttributeModifier(ATTACK_SPEED_MODIFIER_UUID, "Weapon modifier", (double)this.attackSpeed, EntityAttributeModifier.Operation.ADDITION));
        }
  
        return multimap;
    }

}