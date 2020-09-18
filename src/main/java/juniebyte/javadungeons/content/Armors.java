package juniebyte.javadungeons.content;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.items.EvocationRobeItem;
import juniebyte.javadungeons.items.PhantomArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;

public class Armors {

    // RANGED ARMORS
    public static Item HUNTERS_ARMOR;
    public static Item ARCHERS_ARMOR_HOOD;
    public static Item ARCHERS_ARMOR;

    public static Item PHANTOM_ARMOR_HELMET;
    public static Item PHANTOM_ARMOR;
    public static Item FROST_BITE_HELMET;
    public static Item FROST_BITE;

    public static Item THIEF_ARMOR_HOOD;
    public static Item THIEF_ARMOR;
    public static Item SPIDER_ARMOR_HOOD;
    public static Item SPIDER_ARMOR;

    // MAGIC ARMORS
    public static Item BATTLE_ROBE;
    public static Item SPLENDID_ROBE;

    public static Item SOUL_ROBE_HOOD;
    public static Item SOUL_ROBE;
    public static Item SOULDANCER_ROBE_HOOD;
    public static Item SOULDANCER_ROBE;

    public static Item EVOCATION_ROBE_HAT;
    public static Item EVOCATION_ROBE;
    public static Item EMBER_ROBE_HAT;
    public static Item EMBER_ROBE;

    // MOB ARMORS
    public static Item GRIM_ARMOR_HELMET;
    public static Item GRIM_ARMOR;
    public static Item WITHER_ARMOR_HELMET;
    public static Item WITHER_ARMOR;

    public static Item WOLF_ARMOR_HOOD;
    public static Item WOLF_ARMOR;
    //public static Item WOLF_ARMOR_BOOTS;
    public static Item FOX_ARMOR_HOOD;
    public static Item FOX_ARMOR;
    //public static Item FOX_ARMOR_BOOTS;

    public static Item OCELOT_ARMOR_HOOD;
    public static Item OCELOT_ARMOR;
    //public static Item OCELOT_ARMOR_BOOTS;
    public static Item SHADOW_WALKER_HOOD;
    public static Item SHADOW_WALKER;
    //public static Item SHADOW_WALKER_BOOTS;

    // LIGHT ARMORS
    public static Item GUARDS_ARMOR_HELMET;
    public static Item GUARDS_ARMOR;
    public static Item CURIOUS_ARMOR_HELMET;
    public static Item CURIOUS_ARMOR;

    public static Item SCALE_MAIL;
    public static Item HIGHLAND_ARMOR_HELMET;
    public static Item HIGHLAND_ARMOR;

    public static Item SPELUNKER_ARMOR_HELMET;
    public static Item SPELUNKER_ARMOR;
    public static Item CAVE_CRAWLER_HELMET;
    public static Item CAVE_CRAWLER;

    // MEDIUM ARMORS
    public static Item CHAMPIONS_ARMOR_HELMET;
    public static Item CHAMPIONS_ARMOR;
    public static Item HEROS_ARMOR_HELMET;
    public static Item HEROS_ARMOR;

    public static Item REINFORCED_MAIL_HELMET;
    public static Item REINFORCED_MAIL;
    public static Item STALWART_ARMOR_HELMET;
    public static Item STALWART_ARMOR;

    public static Item SNOW_ARMOR_HELMET;
    public static Item SNOW_ARMOR;
    public static Item FROST_ARMOR_HELMET;
    public static Item FROST_ARMOR;

    // HEAVY ARMORS
    public static Item DARK_ARMOR_HELMET;
    public static Item DARK_ARMOR;
    public static Item TITANS_SHROUD_HELMET;
    public static Item TITANS_SHROUD;

    public static Item MERCENARY_ARMOR_HELMET;
    public static Item MERCENARY_ARMOR;
    public static Item RENEGADE_ARMOR_HELMET;
    public static Item RENEGADE_ARMOR;

    public static Item PLATE_ARMOR_HELMET;
    public static Item PLATE_ARMOR;
    public static Item FULL_METAL_ARMOR_HELMET;
    public static Item FULL_METAL_ARMOR;


    public static void init() {
        PHANTOM_ARMOR = new PhantomArmorItem("phantom_chestplate", ArmorMaterials.BONE, EquipmentSlot.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false);
        PHANTOM_ARMOR_HELMET = new PhantomArmorItem("phantom_helmet", ArmorMaterials.BONE, EquipmentSlot.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false);

        EVOCATION_ROBE = new EvocationRobeItem("evocation_robe", ArmorMaterials.ROBE, EquipmentSlot.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false);
        EVOCATION_ROBE_HAT = new EvocationRobeItem("evocation_hat", ArmorMaterials.ROBE, EquipmentSlot.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false);

        EMBER_ROBE = new EvocationRobeItem("ember_robe", ArmorMaterials.ROBE, EquipmentSlot.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true);
        EMBER_ROBE_HAT = new EvocationRobeItem("ember_hat", ArmorMaterials.ROBE, EquipmentSlot.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true);
        
//                HUNTERS_ARMOR = new HuntersArmorItem(VEST, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("hunters_vest")),
//                ARCHERS_ARMOR = new HuntersArmorItem(VEST, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("archers_vest")),
//                ARCHERS_ARMOR_HOOD = new HuntersArmorItem(VEST, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("archers_hood")),
//
//                // done
//                BATTLE_ROBE = new BattleRobeItem(ROBE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("battle_robe")),
//                SPLENDID_ROBE = new BattleRobeItem(ROBE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("splendid_robe")),
//
//                // done
//                CHAMPIONS_ARMOR = new ChampionsArmorItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("champions_chestplate")),
//                CHAMPIONS_ARMOR_HELMET = new ChampionsArmorItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("champions_helmet")),
//                HEROS_ARMOR = new ChampionsArmorItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("heros_chestplate")),
//                HEROS_ARMOR_HELMET = new ChampionsArmorItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("heros_helmet")),
//
//                // done
//                DARK_ARMOR = new DarkArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("dark_chestplate")),
//                DARK_ARMOR_HELMET = new DarkArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("dark_helmet")),
//                ROYAL_GUARD_ARMOR = new RoyalGuardArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("royal_guard_chestplate")),
//                ROYAL_GUARD_ARMOR_HELMET = new RoyalGuardArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("royal_guard_helmet")),
//                TITANS_SHROUD = new DarkArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("titans_shroud_chestplate")),
//                TITANS_SHROUD_HELMET = new DarkArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("titans_shroud_helmet")),
//
//                // done
//
//
//                // done
//                GRIM_ARMOR = new GrimArmorItem(BONE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("grim_chestplate")),
//                GRIM_ARMOR_HELMET = new GrimArmorItem(BONE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("grim_helmet")),
//                WITHER_ARMOR = new GrimArmorItem(BONE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("wither_chestplate")),
//                WITHER_ARMOR_HELMET = new GrimArmorItem(BONE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("wither_helmet")),
//
//                // done
//                GUARDS_ARMOR = new GuardsArmorItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("guards_chestplate")),
//                GUARDS_ARMOR_HELMET = new GuardsArmorItem(LIGHT_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("guards_helmet")),
//                CURIOUS_ARMOR = new GuardsArmorItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("curious_chestplate")),
//                CURIOUS_ARMOR_HELMET = new GuardsArmorItem(LIGHT_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("curious_helmet")),
//
//                // done
//                MERCENARY_ARMOR = new MercenaryArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("mercenary_chestplate")),
//                MERCENARY_ARMOR_HELMET = new MercenaryArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("mercenary_helmet")),
//                RENEGADE_ARMOR = new MercenaryArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("renegade_chestplate")),
//                RENEGADE_ARMOR_HELMET = new MercenaryArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("renegade_helmet")),
//
//                // done
//                OCELOT_ARMOR = new OcelotArmorItem(PELT, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("ocelot_vest")),
//                OCELOT_ARMOR_HOOD = new OcelotArmorItem(PELT, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("ocelot_hood")),
//                SHADOW_WALKER = new OcelotArmorItem(PELT, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("shadow_walker_vest")),
//                SHADOW_WALKER_HOOD = new OcelotArmorItem(PELT, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("shadow_walker_hood")),
//
//                // done
//                PHANTOM_ARMOR = new PhantomArmorItem(BONE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("phantom_chestplate")),
//                PHANTOM_ARMOR_HELMET = new PhantomArmorItem(BONE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("phantom_helmet")),
//                FROST_BITE = new PhantomArmorItem(BONE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("frost_bite_chestplate")),
//                FROST_BITE_HELMET = new PhantomArmorItem(BONE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("frost_bite_helmet")),
//
//                // done
//                PLATE_ARMOR = new PlateArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("plate_chestplate")),
//                PLATE_ARMOR_HELMET = new PlateArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("plate_helmet")),
//                FULL_METAL_ARMOR = new PlateArmorItem(HEAVY_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("full_metal_chestplate")),
//                FULL_METAL_ARMOR_HELMET = new PlateArmorItem(HEAVY_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("full_metal_helmet")),
//
//                // done
//                REINFORCED_MAIL = new ReinforcedMailItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("reinforced_mail_chestplate")),
//                REINFORCED_MAIL_HELMET = new ReinforcedMailItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("reinforced_mail_helmet")),
//                STALWART_ARMOR = new ReinforcedMailItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("stalwart_chestplate")),
//                STALWART_ARMOR_HELMET = new ReinforcedMailItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("stalwart_helmet")),
//
//                // done
//                SCALE_MAIL = new ScaleMailItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("scale_mail_chestplate")),
//                HIGHLAND_ARMOR = new ScaleMailItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("highland_chestplate")),
//                HIGHLAND_ARMOR_HELMET = new ScaleMailItem(LIGHT_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("highland_helmet")),
//
//                SNOW_ARMOR = new SnowArmorItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("snow_chestplate")),
//                SNOW_ARMOR_HELMET = new SnowArmorItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("snow_helmet")),
//                FROST_ARMOR = new SnowArmorItem(MEDIUM_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("frost_chestplate")),
//                FROST_ARMOR_HELMET = new SnowArmorItem(MEDIUM_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("frost_helmet")),
//
//                SOUL_ROBE = new SoulRobeItem(ROBE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("soul_robe")),
//                SOUL_ROBE_HOOD = new SoulRobeItem(ROBE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("soul_hood")),
//                SOULDANCER_ROBE = new SoulRobeItem(ROBE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("souldancer_robe")),
//                SOULDANCER_ROBE_HOOD = new SoulRobeItem(ROBE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("souldancer_hood")),
//
//                // done
//                SPELUNKER_ARMOR = new SpelunkerArmorItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("spelunker_chestplate")),
//                SPELUNKER_ARMOR_HELMET = new SpelunkerArmorItem(LIGHT_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("spelunker_helmet")),
//                CAVE_CRAWLER = new SpelunkerArmorItem(LIGHT_PLATE, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("cave_crawler_chestplate")),
//                CAVE_CRAWLER_HELMET = new SpelunkerArmorItem(LIGHT_PLATE, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("cave_crawler_helmet")),
//
//                // done
//                THIEF_ARMOR = new ThiefArmorItem(VEST, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("thief_vest")),
//                THIEF_ARMOR_HOOD = new ThiefArmorItem(VEST, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("thief_hood")),
//                SPIDER_ARMOR = new ThiefArmorItem(VEST, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("spider_vest")),
//                SPIDER_ARMOR_HOOD = new ThiefArmorItem(VEST, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("spider_hood")),
//
//                // done
//                WOLF_ARMOR = new WolfArmorItem(PELT, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("wolf_vest")),
//                WOLF_ARMOR_HOOD = new WolfArmorItem(PELT, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), false).setRegistryName(location("wolf_hood")),
//                FOX_ARMOR = new WolfArmorItem(PELT, EquipmentSlotType.CHEST, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("fox_vest")),
//                FOX_ARMOR_HOOD = new WolfArmorItem(PELT, EquipmentSlotType.HEAD, new Item.Settings().group(JavaDungeons.ARMORS), true).setRegistryName(location("fox_hood"))
    }

}