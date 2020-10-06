package bloxboss6.mod.init;

import bloxboss6.mod.Main;
import bloxboss6.mod.objects.armor.ArmorBase;
import bloxboss6.mod.objects.armor.ArmorTrojan;
import bloxboss6.mod.objects.armor.ItemShirtCH;
import bloxboss6.mod.objects.armor.ItemShirtCJ;
import bloxboss6.mod.objects.items.ItemBase;
import bloxboss6.mod.objects.items.ItemNonStackBase;
import bloxboss6.mod.objects.tools.*;
import bloxboss6.mod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final ToolMaterial TOOL_CB = EnumHelper.addToolMaterial("tool_cb", 4, 2000, 9.0F, 4.0F, 20);
    public static final ToolMaterial TOOL_KNIFE = EnumHelper.addToolMaterial("tool_knife", 4, 2000, 9.0F, 3.5F, 20);
    public static final ToolMaterial TOOL_IG = EnumHelper.addToolMaterial("tool_ig", 4, 2000, 9.0F, 4.0F, 20);
    public static final ToolMaterial TOOL_SI = EnumHelper.addToolMaterial("tool_si", 4, 2000, 9.0F, 4.0F, 20);
    public static final ToolMaterial TOOL_MA = EnumHelper.addToolMaterial("tool_ma", 4, 2000, 9.0F, 4.0F, 20);
    public static final ArmorMaterial ARMOR_CB = EnumHelper.addArmorMaterial("armor_cb", Reference.MODID + ":cb", 42, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ArmorMaterial ARMOR_IG = EnumHelper.addArmorMaterial("armor_ig", Reference.MODID + ":ig", 42, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    //public static final ArmorMaterial ARMOR_SHIRT_CH = EnumHelper.addArmorMaterial("armor_shirt_ch", Reference.MODID + ":shirt_ch", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    //public static final ArmorMaterial ARMOR_SHIRT_CJ = EnumHelper.addArmorMaterial("armor_shirt_cj", Reference.MODID + ":shirt_cj", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ArmorMaterial ARMOR_TROJAN = EnumHelper.addArmorMaterial("armor_trojan", Reference.MODID + ":trojan", 42, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ArmorMaterial ARMOR_BAUBLE_SHIRT_CH = EnumHelper.addArmorMaterial("shirt_ch", Reference.MODID + ":shirt_ch", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    public static final ArmorMaterial ARMOR_BAUBLE_SHIRT_CJ = EnumHelper.addArmorMaterial("shirt_cj", Reference.MODID + ":shirt_cj", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

    //Celestial Bronze Items
    public static final Item INGOT_CB = new ItemBase("ingot_cb", Main.pjotab);
    public static final Item ROD_CB = new ItemBase("rod_cb", Main.pjotab);

    //Celestial Bronze Tools
    public static final Item AXE_CB = new ToolAxe("axe_cb", TOOL_CB, Main.pjotab);
    public static final Item HOE_CB = new ToolHoe("hoe_cb", TOOL_CB, Main.pjotab);
    public static final Item PICKAXE_CB = new ToolPickaxe("pickaxe_cb", TOOL_CB, Main.pjotab);
    public static final Item SHOVEL_CB = new ToolShovel("shovel_cb", TOOL_CB, Main.pjotab);
    public static final Item SWORD_CB = new ToolSword("sword_cb", TOOL_CB, Main.pjotab);
    public static final Item KNIFE_CB = new ToolKnife("knife_cb", TOOL_KNIFE, Main.pjotab);
    public static final Item SHIELD_CB = new ToolShield("shield_cb", Main.pjotab);

    //Celestial Bronze Armor
    public static final Item HELMET_CB = new ArmorTrojan("helmet_cb", ARMOR_CB, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_CB = new ArmorTrojan("chestplate_cb", ARMOR_CB, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_CB = new ArmorTrojan("leggings_cb", ARMOR_CB, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_CB = new ArmorTrojan("boots_cb", ARMOR_CB, 1, EntityEquipmentSlot.FEET);

    //Imperial Gold Items
    public static final Item INGOT_IG = new ItemBase("ingot_ig", Main.pjotab);
    public static final Item ROD_IG = new ItemBase("rod_ig", Main.pjotab);

    //Imperial Gold Tools
    public static final Item AXE_IG = new ToolAxe("axe_ig", TOOL_IG, Main.pjotab);
    public static final Item HOE_IG = new ToolHoe("hoe_ig", TOOL_IG, Main.pjotab);
    public static final Item PICKAXE_IG = new ToolPickaxe("pickaxe_ig", TOOL_IG, Main.pjotab);
    public static final Item SHOVEL_IG = new ToolShovel("shovel_ig", TOOL_IG, Main.pjotab);
    public static final Item SWORD_IG = new ToolSword("sword_ig", TOOL_IG, Main.pjotab);
    public static final Item KNIFE_IG = new ToolKnife("knife_ig", TOOL_KNIFE, Main.pjotab);
    public static final Item SHIELD_ROMAN = new ToolShield("shield_roman", Main.pjotab);

    //Imperial Gold Armor
    public static final Item HELMET_IG = new ArmorBase("helmet_ig", ARMOR_IG, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_IG = new ArmorBase("chestplate_ig", ARMOR_IG, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_IG = new ArmorBase("leggings_ig", ARMOR_IG, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_IG = new ArmorBase("boots_ig", ARMOR_IG, 1, EntityEquipmentSlot.FEET);

    //Stygian Iron Items
    public static final Item INGOT_SI = new ItemBase("ingot_si", Main.pjotab);

    //Stygian Iron Tools
    public static final Item AXE_SI = new ToolAxe("axe_si", TOOL_SI, Main.pjotab);
    public static final Item HOE_SI = new ToolHoe("hoe_si", TOOL_SI, Main.pjotab);
    public static final Item PICKAXE_SI = new ToolPickaxe("pickaxe_si", TOOL_SI, Main.pjotab);
    public static final Item SHOVEL_SI = new ToolShovel("shovel_si", TOOL_SI, Main.pjotab);
    public static final Item SWORD_SI = new ToolSword("sword_si", TOOL_SI, Main.pjotab);
    public static final Item KNIFE_SI = new ToolKnife("knife_si", TOOL_KNIFE, Main.pjotab);

    //Mixed Alloy Items
    public static final Item INGOT_MA = new ItemBase("ingot_ma", Main.pjotab);
    public static final Item SWORD_MA = new ToolSword("sword_ma", TOOL_MA, Main.pjotab);
    public static final Item KNIFE_MA = new ToolKnife("knife_ma", TOOL_KNIFE, Main.pjotab);

    //Rare Artifacts
    public static final Item PEN_RIPTIDE = new ItemNonStackBase("pen_riptide", Main.pjoraretab);
    public static final Item SWORD_RIPTIDE = new ToolSword("sword_riptide", TOOL_CB, Main.pjoraretab);
    public static final Item MACE_THALIA = new ItemNonStackBase("mace_thalia", Main.pjoraretab);
    public static final Item SPEAR_THALIA = new ToolSpear("spear_thalia", TOOL_CB, Main.pjoraretab);
    public static final Item COIN_JASON = new ItemNonStackBase("coin_jason", Main.pjoraretab);
    public static final Item SWORD_JASON = new ToolSword("sword_jason", TOOL_CB, Main.pjoraretab);
    public static final Item SPEAR_JASON = new ToolSpear("spear_jason", TOOL_IG, Main.pjoraretab);
    public static final Item SWORD_BACKBITER = new ToolSword("sword_backbiter", TOOL_MA, Main.pjoraretab);
    public static final Item KNIFE_KATOPTRIS = new ToolKnife("knife_katoptris", TOOL_CB, Main.pjoraretab);
    public static final Item SCYTHE_KRONOS = new ToolScythe("scythe_kronos", TOOL_CB, Main.pjoraretab);
    public static final Item SHIELD_AEGIS = new ToolShield("shield_aegis", Main.pjoraretab);

    //Casts and Parts
    public static final Item CAST_BLANK = new ItemNonStackBase("cast_blank",Main.pjotab);
    public static final Item CAST_HILT = new ItemNonStackBase("cast_hilt", Main.pjotab);
    public static final Item CAST_KNIFE = new ItemNonStackBase("cast_knife", Main.pjotab);
    public static final Item CAST_SWORD = new ItemNonStackBase("cast_sword", Main.pjotab);
    public static final Item SWORD_PART_CB = new ItemBase("sword_part_cb", Main.pjotab);
    public static final Item SWORD_PART_IG = new ItemBase("sword_part_ig", Main.pjotab);
    public static final Item SWORD_PART_SI = new ItemBase("sword_part_si", Main.pjotab);
    public static final Item SWORD_PART_MA = new ItemBase("sword_part_ma", Main.pjotab);
    public static final Item HILT_PART_CB = new ItemBase("hilt_part_cb", Main.pjotab);
    public static final Item HILT_PART_IG = new ItemBase("hilt_part_ig", Main.pjotab);
    public static final Item HILT_PART_SI = new ItemBase("hilt_part_si", Main.pjotab);
    public static final Item HILT_PART_MA = new ItemBase("hilt_part_ma", Main.pjotab);
    public static final Item KNIFE_PART_CB = new ItemBase("knife_part_cb", Main.pjotab);
    public static final Item KNIFE_PART_IG = new ItemBase("knife_part_ig", Main.pjotab);
    public static final Item KNIFE_PART_SI = new ItemBase("knife_part_si", Main.pjotab);
    public static final Item KNIFE_PART_MA = new ItemBase("knife_part_ma", Main.pjotab);

    //Shirts
    //public static final Item SHIRT_CH = new ArmorShirt("shirt_ch", ARMOR_SHIRT_CH, EntityEquipmentSlot.CHEST);
    //public static final Item SHIRT_CJ = new ArmorShirt("shirt_cj", ARMOR_SHIRT_CJ, EntityEquipmentSlot.CHEST);
    public static final Item BAUBLE_SHIRT_CH = new ItemShirtCH("shirt_ch", ARMOR_BAUBLE_SHIRT_CH, EntityEquipmentSlot.CHEST);
    public static final Item BAUBLE_SHIRT_CJ = new ItemShirtCJ("shirt_cj", ARMOR_BAUBLE_SHIRT_CJ, EntityEquipmentSlot.CHEST);

    public static final Item HELMET_TROJAN = new ArmorTrojan("helmet_trojan", ARMOR_TROJAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item CHESTPLATE_TROJAN = new ArmorTrojan("chestplate_trojan", ARMOR_TROJAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item LEGGINGS_TROJAN = new ArmorTrojan("leggings_trojan", ARMOR_TROJAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item BOOTS_TROJAN = new ArmorTrojan("boots_trojan", ARMOR_TROJAN, 1, EntityEquipmentSlot.FEET);
    //public static final Item QUIZ = new ItemQuiz("quiz",Main.pjotab);
    public static final Item NEW_RIPTIDE = new SwordRiptide("sword_riptide_new", Main.pjotab);

}
