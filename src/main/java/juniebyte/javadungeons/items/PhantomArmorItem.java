package juniebyte.javadungeons.items;

import juniebyte.javadungeons.JavaDungeons;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
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

public class PhantomArmorItem extends ArmorItem {
    public final boolean unique;

    public PhantomArmorItem(String id, ArmorMaterial armorMaterial, EquipmentSlot slotType, Settings properties, boolean unique) {
        super(armorMaterial, slotType, properties);
        this.unique = unique;
        Registry.register(Registry.ITEM, new Identifier(JavaDungeons.MOD_ID, id), this);
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
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "Frost Bite remembers the icy winds"));
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "which once flowed beneath the wings of the night Phantoms."));
            if(this.slot == EquipmentSlot.CHEST){
                tooltip.add(new LiteralText(Formatting.GREEN + "Spawns A Snowy Companion (Snowball I)"));
            }
        }
        else{
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "This armor, crafted from the bones of Phantoms,"));
            tooltip.add(new LiteralText(Formatting.WHITE + "" + Formatting.ITALIC + "is a terrifying sight on the battlefield."));
        }
    }

}