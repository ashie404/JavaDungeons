package j0sh.javadungeons.content;

import j0sh.javadungeons.items.*;

import net.minecraft.item.ToolMaterials;

public class Weapons {

    // Axes
    public static DungeonsAxe IRON_AXE;
    public static DungeonsAxe BRONZE_AXE;
    public static DungeonsAxe DOUBLE_AXE;

    // Pickaxes
    public static DungeonsPickaxe STEEL_PICKAXE;

    // Swords
    public static DungeonsSword CLAYMORE;
    public static DungeonsSword CRIMSON_CORE;
    public static DungeonsSword CUTLASS;
    public static DungeonsSword BROADSWORD;
    public static DungeonsSword KATANA;
    public static DungeonsSword CRIMSON_KATANA;
    public static DungeonsSword STEEL_SWORD;

    // Hammers
    public static DungeonsPickaxe STONE_HAMMER;

    // Daggers
    public static DungeonsSword DAGGER;
    public static DungeonsSword FROST_DAGGER;

    // Sickles
    public static DungeonsSickle SICKLE;
    public static DungeonsSickle OBSIDIAN_SICKLE;

    // Glaive
    public static DungeonsGlaive GLAIVE;

    public static void init() {
        // Axes
        IRON_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "iron_axe");
        BRONZE_AXE = new DungeonsAxe(ToolMaterials.DIAMOND, 5.0F, -3.0F, "bronze_axe");
        DOUBLE_AXE = new DungeonsAxe(ToolMaterials.IRON, 6.0F, -3.1F, "double_axe");

        // Pickaxes
        STEEL_PICKAXE = new DungeonsPickaxe(ToolMaterials.IRON, 2, -2.5F, "steel_pickaxe");

        // Swords
        CLAYMORE = new DungeonsSword(ToolMaterials.IRON, 3, -2.4F, "claymore");
        CRIMSON_CORE = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.8F, "crimson_core");
        CUTLASS = new DungeonsSword(ToolMaterials.IRON, 3, -2.1F, "cutlass");
        BROADSWORD = new DungeonsSword(ToolMaterials.IRON, 5, -3.4F, "broadsword");
        KATANA = new DungeonsSword(ToolMaterials.IRON, 2, -1.5F, "katana");
        CRIMSON_KATANA = new DungeonsSword(ToolMaterials.DIAMOND, 4, -1.35F, "crimson_katana");
        STEEL_SWORD = new DungeonsSword(ToolMaterials.IRON, 4, -2.4F, "steel_sword");

        // Hammers
        STONE_HAMMER = new DungeonsPickaxe(ToolMaterials.STONE, 6, -3.5F, "stone_hammer");

        // Daggers
        DAGGER = new DungeonsSword(ToolMaterials.IRON, 2, -1.3F, "dagger");
        FROST_DAGGER = new DungeonsSword(ToolMaterials.IRON, 3, -1.3F, "frost_dagger");

        // Sickles
        SICKLE = new DungeonsSickle(ToolMaterials.IRON, 1, -2.0F, "sickle");
        OBSIDIAN_SICKLE = new DungeonsSickle(ToolMaterials.DIAMOND, 2, -1.7F, "obsidian_sickle");

        // Glaive (currently non-functional)
        //GLAIVE = new DungeonsGlaive("glaive");
    }

}