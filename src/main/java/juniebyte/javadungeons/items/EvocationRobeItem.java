package juniebyte.javadungeons.items;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import juniebyte.javadungeons.JavaDungeons;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class EvocationRobeItem extends ArmorItem {

    private static final UUID[] ARMOR_MODIFIERS = new UUID[]{
            UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")};

    public final boolean unique;
    private final int damageReduceAmount;
    private final float toughness;
    private final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public EvocationRobeItem(String id, ArmorMaterial armorMaterial, EquipmentSlot slotType, Settings properties, boolean unique) {
        super(armorMaterial, slotType, properties);
        this.unique = unique;

        this.damageReduceAmount = armorMaterial.getProtectionAmount(slot);
        this.toughness = armorMaterial.getToughness();

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        UUID uuid = ARMOR_MODIFIERS[slot.getEntitySlotId()];
        builder.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uuid, "Armor modifier", this.damageReduceAmount, EntityAttributeModifier.Operation.ADDITION));
        builder.put(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, new EntityAttributeModifier(uuid, "Armor toughness", this.toughness, EntityAttributeModifier.Operation.ADDITION));
        if (this.knockbackResistance > 0) {
            builder.put(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, new EntityAttributeModifier(uuid, "Armor knockback resistance", this.knockbackResistance, EntityAttributeModifier.Operation.ADDITION));
        }
        builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(uuid, "Armor speed boost", 0.15D * 0.5D, EntityAttributeModifier.Operation.MULTIPLY_BASE));

        this.attributeModifiers = builder.build();
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot) {
        return equipmentSlot == this.slot ? this.attributeModifiers : super.getAttributeModifiers(equipmentSlot);
    }

    @Override
    public Rarity getRarity(ItemStack itemStack){
        if(this.unique) return Rarity.RARE;
        return Rarity.UNCOMMON;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        if (this.unique) {
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "The Ember Robe was created by Illager Evokers"));
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + " to distinguish themselves from the common guard."));
            tooltip.add(new LiteralText(Formatting.GREEN + "Burns Nearby Enemies (Burning I)"));
        }
        else{
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "Potent magical runes are weaved into"));
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + " the fabric of these robes, their"));
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + " origins and powers are shrouded in mystery."));
        }
    }

}