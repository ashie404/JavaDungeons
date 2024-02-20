package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.items.*;
import ashie404.javadungeons.registry.RegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class Weapons {

    // Axes
    public static final Item AXE = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F), "axe");
    public static final Item HIGHLAND_AXE = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F), "highland_axe");
    public static final Item CURSED_AXE = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.IRON, 7.0F, -3.4F), "cursed_axe");
    public static final Item WHIRLWIND = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.IRON, 6.0F, -2.9F), "whirlwind");
    public static final Item FIREBRAND = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.DIAMOND, 5.0F, -3.0F), "firebrand");
    public static final Item DOUBLE_AXE = 
        RegistryHelper.registerItem(new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F), "double_axe");

    // Pickaxes
    public static final Item STEEL_PICKAXE = 
        RegistryHelper.registerItem(new DungeonsPickaxe(ToolMaterials.IRON, 2, -2.5F), "steel_pickaxe");

    // Swords
    public static final Item CLAYMORE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 3, -2.4F), "claymore");
    public static final Item HEARTSTEALER = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.8F), "heartstealer");
    public static final Item CUTLASS = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 3, -2.1F), "cutlass");
    public static final Item NAMELESS_BLADE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.DIAMOND, 2, -1.7F), "nameless_blade");
    public static final Item BROADSWORD = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 5, -3.4F), "broadsword");
    public static final Item KATANA = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 2, -1.5F), "katana");
    public static final Item MASTERS_KATANA = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.35F), "masters_katana");
    public static final Item DARK_KATANA = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.DIAMOND, 5, -1.15F), "dark_katana");
    public static final Item STEEL_SWORD = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 4, -2.4F), "steel_sword");
    public static final Item TRUTHSEEKER = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 5, -1.5F), "truthseeker");

    // Hammers
    public static final Item STONE_HAMMER = 
        RegistryHelper.registerItem(new DungeonsPickaxe(ToolMaterials.STONE, 6, -3.5F), "stone_hammer");

    // Daggers/Knives
    public static final Item DAGGER = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 2, -1.3F), "dagger");
    public static final Item FANGS_OF_FROST = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 3, -1.3F), "fangs_of_frost");
    public static final Item MOON_DAGGER = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 4, -1.3F), "moon_dagger");

    public static final Item SOUL_KNIFE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 5, -1.1F), "soul_knife");
    public static final Item ETERNAL_KNIFE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.DIAMOND, 5, -0.9F), "eternal_knife");

    // Sickles/Scythes
    public static final Item SICKLE = 
        RegistryHelper.registerItem(new DungeonsSickle(ToolMaterials.IRON, 1, -2.0F), "sickle");
    public static final Item NIGHTMARES_BITE = 
        RegistryHelper.registerItem(new DungeonsSickle(ToolMaterials.IRON, 3, -2.0F), "nightmares_bite");

    public static final Item FROST_SCYTHE = 
        RegistryHelper.registerItem(new DungeonsSickle(ToolMaterials.IRON, 4, -2.5F), "frost_scythe");
    public static final Item JAILORS_SCYTHE = 
        RegistryHelper.registerItem(new DungeonsSickle(ToolMaterials.IRON, 4, -2.25F), "jailors_scythe");
    public static final Item SOUL_SCYTHE = 
        RegistryHelper.registerItem(new DungeonsSickle(ToolMaterials.DIAMOND, 5, -2.25F), "soul_scythe");

    // Spears
    public static final Item GLAIVE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 3, -2.7F), "glaive");
    public static final Item GRAVE_BANE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.GOLD, 4, -2.5F), "grave_bane");
    public static final Item VENOM_GLAIVE = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 4, -2.7F), "venom_glaive");

    public static final Item SPEAR = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 3, -2.5F), "spear");
    public static final Item FORTUNE_SPEAR = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.GOLD, 4, -2.35F), "fortune_spear");
    public static final Item WHISPERING_SPEAR = 
        RegistryHelper.registerItem(new DungeonsSword(ToolMaterials.IRON, 5, -2.5F), "whispering_spear");

    public static void init() {
        // add items to item group
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(RegistryKeys.ITEM_GROUP, JavaDungeons.ID("weapons"))).register(content -> {
            content.add(AXE);
            content.add(HIGHLAND_AXE);
            content.add(CURSED_AXE);
            content.add(WHIRLWIND);
            content.add(FIREBRAND);
            content.add(DOUBLE_AXE);
            content.add(STEEL_PICKAXE);
            content.add(CLAYMORE);
            content.add(HEARTSTEALER);
            content.add(CUTLASS);
            content.add(NAMELESS_BLADE);
            content.add(BROADSWORD);
            content.add(KATANA);
            content.add(MASTERS_KATANA);
            content.add(DARK_KATANA);
            content.add(STEEL_SWORD);
            content.add(TRUTHSEEKER);
            content.add(STONE_HAMMER);
            content.add(DAGGER);
            content.add(FANGS_OF_FROST);
            content.add(MOON_DAGGER);
            content.add(SOUL_KNIFE);
            content.add(ETERNAL_KNIFE);
            content.add(SICKLE);
            content.add(NIGHTMARES_BITE);
            content.add(FROST_SCYTHE);
            content.add(JAILORS_SCYTHE);
            content.add(SOUL_SCYTHE);
            content.add(GLAIVE);
            content.add(GRAVE_BANE);
            content.add(VENOM_GLAIVE);
            content.add(SPEAR);
            content.add(FORTUNE_SPEAR);
            content.add(WHISPERING_SPEAR);
        });
    }

}