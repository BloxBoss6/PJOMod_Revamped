package bloxboss6.mod.objects.armor;

import bloxboss6.mod.util.ItemUtil;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.botania.api.item.IPhantomInkable;

import javax.annotation.Nullable;
import java.util.List;

import static bloxboss6.mod.Main.proxy;

public class ItemArmorPJO extends ItemArmor implements IPhantomInkable {
    protected String modelName;

    public ItemArmorPJO(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack,
                                    EntityEquipmentSlot armorSlot, ModelBiped defaultModel) {
        if (!stack.isEmpty()) {
            if (stack.getItem() instanceof IPhantomInkable
                    &&((IPhantomInkable) stack.getItem()).hasPhantomInk(stack))
                return new ModelBiped();
            ModelBiped model = proxy.getArmorModel(modelName);
            model.isSneak = defaultModel.isSneak;
            model.isRiding = defaultModel.isRiding;
            model.isChild = defaultModel.isChild;
            model.rightArmPose = defaultModel.rightArmPose;
            model.leftArmPose = defaultModel.leftArmPose;
            return model;
        }
        return defaultModel;
    }

    @SuppressWarnings("deprecation")
    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                               ITooltipFlag flagIn) {
        boolean isShifting = GuiScreen.isShiftKeyDown();
        // TODO add proxies instead of being lazy and using deprecated I18n
        String base = getUnlocalizedName()+".tooltip.";
        String shift = "";
        if (I18n.canTranslate(base+"0")) {
            if (isShifting&&I18n.canTranslate(base+"0s")) {
                shift = "s";
            }
            for (int i = 0; I18n.canTranslate(base+i+shift)&&i<100; i++) {
                tooltip.add(I18n.translateToLocal(base+i+shift));
            }
        }
    }

    @Override
    public boolean hasPhantomInk(ItemStack stack) {
        return ItemUtil.hasPhantomInk(stack);
    }

    @Override
    public void setPhantomInk(ItemStack stack, boolean ink) {
        ItemUtil.setPhantomInk(stack, ink);
    }
}
