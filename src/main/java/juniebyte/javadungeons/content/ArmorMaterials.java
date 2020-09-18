package juniebyte.javadungeons.content;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterials {

    public static final ArmorMaterial BONE = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return 14;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            if(slot == EquipmentSlot.FEET)
                return 2;
            else if(slot == EquipmentSlot.LEGS)
                return 5;
            else if(slot == EquipmentSlot.CHEST)
                return 6;
            else if(slot == EquipmentSlot.HEAD)
                return 2;
            else
                return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.AIR);
        }

        @Override
        public String getName() {
            return "bone";
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };

    public static final ArmorMaterial ROBE = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return 14;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            if(slot == EquipmentSlot.FEET)
                return 2;
            else if(slot == EquipmentSlot.LEGS)
                return 5;
            else if(slot == EquipmentSlot.CHEST)
                return 6;
            else if(slot == EquipmentSlot.HEAD)
                return 2;
            else
                return 0;
        }

        @Override
        public int getEnchantability() {
            return 0;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.AIR);
        }

        @Override
        public String getName() {
            return "robe";
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };

}
