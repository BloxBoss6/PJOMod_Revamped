package bloxboss6.mod.objects.armor;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.render.IRenderBauble;
import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.objects.armor.models.ModelBaubleShirt;
import bloxboss6.mod.objects.armor.models.ModelShirt;
import bloxboss6.mod.util.Reference;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class ArmorShirt extends ItemArmor implements IHasModel, IBauble, IRenderBauble {

    private static final ResourceLocation texture_ch = new ResourceLocation(Reference.MODEL_SHIRT_CH);
    private static final ResourceLocation texture_cj = new ResourceLocation(Reference.MODEL_SHIRT_CJ);

    public ArmorShirt(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {

        super(materialIn, 1, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.pjotab);
        setMaxStackSize(1);
        getShirtTexture(name);

        ItemInit.ITEMS.add(this);

    }

    @SideOnly(Side.CLIENT)
    private static ModelBaubleShirt model;

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.BODY;
    }

    @Nullable
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) {
        if (itemStack != ItemStack.EMPTY) {
            if (itemStack.getItem() instanceof ItemArmor) {
                ModelShirt model = new ModelShirt();

                model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
                model.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;

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

    @SideOnly(Side.CLIENT)
    ResourceLocation getShirtTexture(String shirtName) {
        if (shirtName.equals("shirt_ch")) {
            return texture_ch;
        } else if (shirtName.equals("shirt_cj")) {
            return texture_cj;
        } else {
            return null;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void onPlayerBaubleRender(ItemStack stack, EntityPlayer player, RenderType type, float partialTicks) {
        if (type == RenderType.BODY) {
            Helper.rotateIfSneaking(player);
            boolean armor = !player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).isEmpty();
            GlStateManager.translate(0F, armor ? -0.07F : -0.01F, 0F);
            if (armor) {
                GlStateManager.scale(0.99F, 1F, 0.99F);
                GlStateManager.translate(0F, 0.05F, 0F);
            }

            float s = 1F / 16F;
            GlStateManager.scale(s, s, s);
            if (model == null)
                model = new ModelBaubleShirt();

            GlStateManager.enableLighting();
            GlStateManager.enableRescaleNormal();

            Minecraft.getMinecraft().renderEngine.bindTexture(getShirtTexture(getUnlocalizedName()));
            model.render(1F);
        }
    }
}
