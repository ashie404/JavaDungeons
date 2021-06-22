package juniebyte.javadungeons.content;

import juniebyte.javadungeons.items.*;
import net.minecraft.item.ToolMaterials;

public class Weapons {

    // Axes
    public static DungeonsAxe AXE;
    public static DungeonsAxe HIGHLAND_AXE;
    public static DungeonsAxe CURSED_AXE;
    public static DungeonsAxe WHIRLWIND;
    public static DungeonsAxe FIREBRAND;
    public static DungeonsAxe DOUBLE_AXE;

    // Pickaxes
    public static DungeonsPickaxe STEEL_PICKAXE;
    public static DungeonsPickaxe DIAMOND_PICKAXE;

    // Swords
    public static DungeonsSword CLAYMORE;
    public static DungeonsSword HEARTSTEALER;
    public static DungeonsSword CUTLASS;
    public static DungeonsSword NAMELESS_BLADE;
    public static DungeonsSword BROADSWORD;
    public static DungeonsSword KATANA;
    public static DungeonsSword MASTERS_KATANA;
    public static DungeonsSword DARK_KATANA;
    public static DungeonsSword STEEL_SWORD;
    public static DungeonsSword TRUTHSEEKER;

    // Hammers
    public static DungeonsPickaxe STONE_HAMMER;

    // Daggers/Knives
    public static DungeonsSword DAGGER;
    public static DungeonsSword FANGS_OF_FROST;
    public static DungeonsSword MOON_DAGGER;

    public static DungeonsSword SOUL_KNIFE;
    public static DungeonsSword ETERNAL_KNIFE;

    // Sickles/Scythes
    public static DungeonsSickle SICKLE;
    public static DungeonsSickle NIGHTMARES_BITE;

    public static DungeonsSickle FROST_SCYTHE; 
    public static DungeonsSickle JAILORS_SCYTHE; 
    public static DungeonsSickle SOUL_SCYTHE; 

    // Spears
    public static DungeonsSword GLAIVE;
    public static DungeonsSword GRAVE_BANE; 
    public static DungeonsSword VENOM_GLAIVE; 

    public static DungeonsSword SPEAR;
    public static DungeonsSword FORTUNE_SPEAR;
    public static DungeonsSword WHISPERING_SPEAR;

    public static void init() {
        // Axes
        AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "axe");
        HIGHLAND_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "highland_axe");
        CURSED_AXE = new DungeonsAxe(ToolMaterials.IRON, 7.0F, -3.4F, "cursed_axe");
        WHIRLWIND = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -2.9F, "whirlwind");
        FIREBRAND = new DungeonsAxe(ToolMaterials.DIAMOND, 5.0F, -3.0F, "firebrand");
        DOUBLE_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "double_axe");

        // Pickaxes
        STEEL_PICKAXE = new DungeonsPickaxe(ToolMaterials.IRON, 2, -2.5F, "steel_pickaxe");

        // Swords
        CLAYMORE = new DungeonsSword(ToolMaterials.IRON, 3, -2.4F, "claymore");
        HEARTSTEALER = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.8F, "heartstealer");
        CUTLASS = new DungeonsSword(ToolMaterials.IRON, 3, -2.1F, "cutlass");
        NAMELESS_BLADE = new DungeonsSword(ToolMaterials.DIAMOND, 2, -1.7F, "nameless_blade");
        BROADSWORD = new DungeonsSword(ToolMaterials.IRON, 5, -3.4F, "broadsword");
        KATANA = new DungeonsSword(ToolMaterials.IRON, 2, -1.5F, "katana");
        MASTERS_KATANA = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.35F, "masters_katana");
        DARK_KATANA = new DungeonsSword(ToolMaterials.DIAMOND, 5, -1.15F, "dark_katana");
        STEEL_SWORD = new DungeonsSword(ToolMaterials.IRON, 4, -2.4F, "steel_sword");
        TRUTHSEEKER = new DungeonsSword(ToolMaterials.IRON, 5, -1.5F, "truthseeker");

        // Hammers
        STONE_HAMMER = new DungeonsPickaxe(ToolMaterials.STONE, 6, -3.5F, "stone_hammer");

        // Daggers/Knives
        DAGGER = new DungeonsSword(ToolMaterials.IRON, 2, -1.3F, "dagger");
        FANGS_OF_FROST = new DungeonsSword(ToolMaterials.IRON, 3, -1.3F, "fangs_of_frost");
        MOON_DAGGER = new DungeonsSword(ToolMaterials.IRON, 4, -1.3F, "moon_dagger");

        SOUL_KNIFE = new DungeonsSword(ToolMaterials.IRON, 5, -1.1F, "soul_knife");
        ETERNAL_KNIFE = new DungeonsSword(ToolMaterials.DIAMOND, 5, -0.9F, "eternal_knife");

        // Sickles/Scythes
        SICKLE = new DungeonsSickle(ToolMaterials.IRON, 1, -2.0F, "sickle");
        NIGHTMARES_BITE = new DungeonsSickle(ToolMaterials.IRON, 3, -2.0F, "nightmares_bite");

        FROST_SCYTHE = new DungeonsSickle(ToolMaterials.IRON, 4, -2.5F, "frost_scythe");
        JAILORS_SCYTHE = new DungeonsSickle(ToolMaterials.IRON, 4, -2.25F, "jailors_scythe");
        SOUL_SCYTHE = new DungeonsSickle(ToolMaterials.DIAMOND, 5, -2.25F, "soul_scythe");

        // Spears
        GLAIVE = new DungeonsSword(ToolMaterials.IRON, 3, -2.7F, "glaive");
        GRAVE_BANE = new DungeonsSword(ToolMaterials.GOLD, 4, -2.5F, "grave_bane");
        VENOM_GLAIVE = new DungeonsSword(ToolMaterials.IRON, 4, -2.7F, "venom_glaive");

        SPEAR = new DungeonsSword(ToolMaterials.IRON, 3, -2.5F, "spear");
        FORTUNE_SPEAR = new DungeonsSword(ToolMaterials.GOLD, 4, -2.35F, "fortune_spear");
        WHISPERING_SPEAR = new DungeonsSword(ToolMaterials.IRON, 5, -2.5F, "whispering_spear");
    }

}