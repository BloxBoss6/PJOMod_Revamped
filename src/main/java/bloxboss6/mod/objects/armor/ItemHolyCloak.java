package bloxboss6.mod.objects.armor;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.api.render.IRenderBauble;
import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.objects.armor.models.ModelBaubleShirt;
import bloxboss6.mod.util.Reference;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHolyCloak extends Item implements IRenderBauble, IBauble, IHasModel {

    private static final ResourceLocation texture = new ResourceLocation(Reference.MODEL_SHIRT_CH);

    @SideOnly(Side.CLIENT)
    private static ModelBaubleShirt model;

    public ItemHolyCloak(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public BaubleType getBaubleType(ItemStack arg0) {
        return BaubleType.BODY;
    }

    @SideOnly(Side.CLIENT)
    ResourceLocation getShirtTexture() {
        return texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void onPlayerBaubleRender(ItemStack stack, EntityPlayer player, RenderType type, float partialTicks) {
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

            Minecraft.getMinecraft().renderEngine.bindTexture(getShirtTexture());
            model.render(1F);
        }
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}