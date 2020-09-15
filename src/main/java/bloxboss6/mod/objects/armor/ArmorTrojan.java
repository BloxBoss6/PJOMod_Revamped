package bloxboss6.mod.objects.armor;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.objects.armor.models.ModelTrojanArmor;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorTrojan extends ItemArmor implements IHasModel {

    public ArmorTrojan(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {

        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.pjotab);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if(itemStack != ItemStack.EMPTY){
            if(itemStack.getItem() instanceof ItemArmor) {
                ModelTrojanArmor model = new ModelTrojanArmor();

                model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
                model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.trojanLeftLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                model.trojanRightLeg.showModel = armorSlot == EntityEquipmentSlot.LEGS;
                model.trojanLeftBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;
                model.trojanRightBoot.showModel = armorSlot == EntityEquipmentSlot.FEET;

                model.isChild = _default.isChild;
                model.isRiding = _default.isRiding;
                model.isSneak = _default.isSneak;
                model.rightArmPose = _default.rightArmPose;
                model.leftArmPose = _default.leftArmPose;

                return model;
            }
        }

        return null;
    }
}
