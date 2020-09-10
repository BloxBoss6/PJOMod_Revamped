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
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import vazkii.botania.api.item.IPhantomInkable;

import javax.annotation.Nullable;
import java.util.List;

import static bloxboss6.mod.Main.proxy;

public class ItemShirtCJ extends ItemArmorPJO
        implements IBauble, ISpecialArmor, IRenderBauble, IHasModel {
    private static final ResourceLocation texture = new ResourceLocation(Reference.MODID,
            "textures/models/armor/shirt_cj_layer_1.png");

    public ItemShirtCJ(String name, ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, 1, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.pjotab);

        ItemInit.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    private static ModelBaubleShirt model;

    @Override
    public BaubleType getBaubleType(ItemStack arg0) {
        return BaubleType.BODY;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor,
                                         DamageSource source, double damage, int slot) {
        return new ArmorProperties(-Integer.MAX_VALUE, 0, 0);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return 0;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source,
                            int damage, int slot) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack stack, EntityEquipmentSlot armorSlot, ModelBiped defaultModel) {
        if (!stack.isEmpty() && stack.getItem() instanceof ItemArmorPJO) {
            if (stack.getItem() instanceof IPhantomInkable
                    && ((IPhantomInkable) stack.getItem()).hasPhantomInk(stack))
                return new ModelBiped();
            ModelBiped model = new ModelShirt();
            model.isSneak = defaultModel.isSneak;
            model.isRiding = defaultModel.isRiding;
            model.isChild = defaultModel.isChild;
            model.rightArmPose = defaultModel.rightArmPose;
            model.leftArmPose = defaultModel.leftArmPose;
            return model;
        }
        return defaultModel;
    }

    @SideOnly(Side.CLIENT)
    ResourceLocation getRenderTexture() {
        return texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void onPlayerBaubleRender(ItemStack stack, EntityPlayer player, RenderType type, float partialTicks) {
        if (type != RenderType.BODY)
            return;
        if (stack.getItem() instanceof IPhantomInkable
                && ((IPhantomInkable) stack.getItem()).hasPhantomInk(stack))
            return;

        if (type == RenderType.BODY) {
            Helper.rotateIfSneaking(player);
            boolean armor = !player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).isEmpty();
            GlStateManager.translate(0F, armor ? -0.07F : -0.03F, 0F);
            if(armor) {
                GlStateManager.scale(0.99F, 1F, 0.99F);
                GlStateManager.translate(0F, 0.05F, 0F);
            }

            float s = 1F / 16F;
            GlStateManager.scale(s, s, s);
            if (model == null)
                model = new ModelBaubleShirt();

            GlStateManager.enableLighting();
            GlStateManager.enableRescaleNormal();

            Minecraft.getMinecraft().renderEngine.bindTexture(getRenderTexture());
            model.render(1F);
        }

        /*Minecraft.getMinecraft().renderEngine.bindTexture(getRenderTexture());
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();

        ModelBiped model = new ModelShirt();
        float s = 1F / 16F;
        GlStateManager.scale(s, s, s);
        //GlStateManager.rotate(-90F, 0F, 1F, 0F);
        model.bipedBody.render(1.0F);
        model.bipedLeftArm.render(1.0F);
        model.bipedRightArm.render(1.0F);

        GlStateManager.popMatrix();*/
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip,
                               ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (stack.getItem() instanceof IPhantomInkable
                && ((IPhantomInkable) stack.getItem()).hasPhantomInk(stack)) {
            tooltip.add(
                    proxy.translate(Reference.MODID + ".misc.hasPhantomInk"));
        }
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}