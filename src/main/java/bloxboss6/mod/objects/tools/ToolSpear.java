package bloxboss6.mod.objects.tools;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ToolSpear extends ItemSword implements IHasModel {

    public ToolSpear(String name, ToolMaterial material, CreativeTabs tab) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        this.addPropertyOverride(new ResourceLocation("blocking"), new IItemPropertyGetter() {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });


        ItemInit.ITEMS.add(this);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, World world, List<String> stacks, ITooltipFlag flags) {
        if (par1ItemStack.getItem() == ItemInit.SPEAR_THALIA) {
            if (GuiScreen.isShiftKeyDown()) {
                addStringToTooltip(TextFormatting.BLUE + I18n.format("Collapsible (WIP)"), stacks);
                addStringToTooltip(I18n.format(""), stacks);
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("V") +
                        TextFormatting.GRAY + I18n.format(" to switch"), stacks);
            } else {
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("shift") +
                        TextFormatting.GRAY + I18n.format(" for more info"), stacks);
            }
        } else if (par1ItemStack.getItem() == ItemInit.SPEAR_JASON) {
            if (GuiScreen.isShiftKeyDown()) {
                addStringToTooltip(TextFormatting.BLUE + I18n.format("Coin flipped to ") + TextFormatting.ITALIC + I18n.format("Heads"), stacks);
                addStringToTooltip(I18n.format(""), stacks);
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("V") +
                        TextFormatting.GRAY + I18n.format(" to switch"), stacks);
            } else {
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("shift") +
                        TextFormatting.GRAY + I18n.format(" for more info"), stacks);
            }
        }
    }

    private void addStringToTooltip(String s, List<String> tooltip) {
        tooltip.add(s.replaceAll("&", "\u00a7"));
    }

    // Add animation to show blocking
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.BLOCK;
    }

    // Allow player to hold down right click
    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 72000;
    }

    // Allow it to block
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
    }

    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return blockIn.getBlock() == Blocks.WEB;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
