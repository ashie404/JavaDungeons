package j0sh.javadungeons.content;

import j0sh.javadungeons.items.*;

import net.minecraft.item.ToolMaterials;

public class Weapons {

    // Axes
    public static DungeonsAxe AXE;
    public static DungeonsAxe HIGHLAND_AXE;
    public static DungeonsAxe FIREBRAND;
    public static DungeonsAxe DOUBLE_AXE;

    // Pickaxes
    public static DungeonsPickaxe STEEL_PICKAXE;

    // Swords
    public static DungeonsSword CLAYMORE;
    public static DungeonsSword HEARTSTEALER;
    public static DungeonsSword CUTLASS;
    public static DungeonsSword NAMELESS_BLADE;
    public static DungeonsSword BROADSWORD;
    public static DungeonsSword KATANA;
    public static DungeonsSword MASTERS_KATANA;
    public static DungeonsSword STEEL_SWORD;

    // Hammers
    public static DungeonsPickaxe STONE_HAMMER;

    // Daggers
    public static DungeonsSword DAGGER;
    public static DungeonsSword FANGS_OF_FROST;

    // Sickles
    public static DungeonsSickle SICKLE;

    // Glaive
    public static DungeonsGlaive GLAIVE;

    public static void init() {
        // Axes
        AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "axe");
        HIGHLAND_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "highland_axe");
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
        STEEL_SWORD = new DungeonsSword(ToolMaterials.IRON, 4, -2.4F, "steel_sword");

        // Hammers
        STONE_HAMMER = new DungeonsPickaxe(ToolMaterials.STONE, 6, -3.5F, "stone_hammer");

        // Daggers
        DAGGER = new DungeonsSword(ToolMaterials.IRON, 2, -1.3F, "dagger");
        FANGS_OF_FROST = new DungeonsSword(ToolMaterials.IRON, 3, -1.3F, "fangs_of_frost");

        // Sickles
        SICKLE = new DungeonsSickle(ToolMaterials.IRON, 1, -2.0F, "sickle");

        // Glaive (currently non-functional)
        //GLAIVE = new DungeonsGlaive("glaive");
    }

}