package ashie404.javadungeons.content;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.items.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class Weapons {

    // Axes
    public static final DungeonsAxe AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "axe");
    public static final DungeonsAxe HIGHLAND_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "highland_axe");
    public static final DungeonsAxe CURSED_AXE = new DungeonsAxe(ToolMaterials.IRON, 7.0F, -3.4F, "cursed_axe");
    public static final DungeonsAxe WHIRLWIND = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -2.9F, "whirlwind");
    public static final DungeonsAxe FIREBRAND = new DungeonsAxe(ToolMaterials.DIAMOND, 5.0F, -3.0F, "firebrand");
    public static final DungeonsAxe DOUBLE_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "double_axe");

    // Pickaxes
    public static final DungeonsPickaxe STEEL_PICKAXE = new DungeonsPickaxe(ToolMaterials.IRON, 2, -2.5F, "steel_pickaxe");

    // Swords
    public static final DungeonsSword CLAYMORE = new DungeonsSword(ToolMaterials.IRON, 3, -2.4F, "claymore");
    public static final DungeonsSword HEARTSTEALER = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.8F, "heartstealer");
    public static final DungeonsSword CUTLASS = new DungeonsSword(ToolMaterials.IRON, 3, -2.1F, "cutlass");
    public static final DungeonsSword NAMELESS_BLADE = new DungeonsSword(ToolMaterials.DIAMOND, 2, -1.7F, "nameless_blade");
    public static final DungeonsSword BROADSWORD = new DungeonsSword(ToolMaterials.IRON, 5, -3.4F, "broadsword");
    public static final DungeonsSword KATANA = new DungeonsSword(ToolMaterials.IRON, 2, -1.5F, "katana");
    public static final DungeonsSword MASTERS_KATANA = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.35F, "masters_katana");
    public static final DungeonsSword DARK_KATANA = new DungeonsSword(ToolMaterials.DIAMOND, 5, -1.15F, "dark_katana");
    public static final DungeonsSword STEEL_SWORD = new DungeonsSword(ToolMaterials.IRON, 4, -2.4F, "steel_sword");
    public static final DungeonsSword TRUTHSEEKER = new DungeonsSword(ToolMaterials.IRON, 5, -1.5F, "truthseeker");

    // Hammers
    public static final DungeonsPickaxe STONE_HAMMER = new DungeonsPickaxe(ToolMaterials.STONE, 6, -3.5F, "stone_hammer");

    // Daggers/Knives
    public static final DungeonsSword DAGGER = new DungeonsSword(ToolMaterials.IRON, 2, -1.3F, "dagger");
    public static final DungeonsSword FANGS_OF_FROST = new DungeonsSword(ToolMaterials.IRON, 3, -1.3F, "fangs_of_frost");
    public static final DungeonsSword MOON_DAGGER = new DungeonsSword(ToolMaterials.IRON, 4, -1.3F, "moon_dagger");

    public static final DungeonsSword SOUL_KNIFE = new DungeonsSword(ToolMaterials.IRON, 5, -1.1F, "soul_knife");
    public static final DungeonsSword ETERNAL_KNIFE = new DungeonsSword(ToolMaterials.DIAMOND, 5, -0.9F, "eternal_knife");

    // Sickles/Scythes
    public static final DungeonsSickle SICKLE = new DungeonsSickle(ToolMaterials.IRON, 1, -2.0F, "sickle");
    public static final DungeonsSickle NIGHTMARES_BITE = new DungeonsSickle(ToolMaterials.IRON, 3, -2.0F, "nightmares_bite");

    public static final DungeonsSickle FROST_SCYTHE = new DungeonsSickle(ToolMaterials.IRON, 4, -2.5F, "frost_scythe");
    public static final DungeonsSickle JAILORS_SCYTHE = new DungeonsSickle(ToolMaterials.IRON, 4, -2.25F, "jailors_scythe");
    public static final DungeonsSickle SOUL_SCYTHE = new DungeonsSickle(ToolMaterials.DIAMOND, 5, -2.25F, "soul_scythe");

    // Spears
    public static final DungeonsSword GLAIVE = new DungeonsSword(ToolMaterials.IRON, 3, -2.7F, "glaive");
    public static final DungeonsSword GRAVE_BANE = new DungeonsSword(ToolMaterials.GOLD, 4, -2.5F, "grave_bane");
    public static final DungeonsSword VENOM_GLAIVE = new DungeonsSword(ToolMaterials.IRON, 4, -2.7F, "venom_glaive");

    public static final DungeonsSword SPEAR = new DungeonsSword(ToolMaterials.IRON, 3, -2.5F, "spear");
    public static final DungeonsSword FORTUNE_SPEAR = new DungeonsSword(ToolMaterials.GOLD, 4, -2.35F, "fortune_spear");
    public static final DungeonsSword WHISPERING_SPEAR = new DungeonsSword(ToolMaterials.IRON, 5, -2.5F, "whispering_spear");

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