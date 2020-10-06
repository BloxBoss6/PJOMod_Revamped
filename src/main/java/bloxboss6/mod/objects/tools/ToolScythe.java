package bloxboss6.mod.objects.tools;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ToolScythe extends ItemSword implements IHasModel {

    public ToolScythe(String name, ToolMaterial material, CreativeTabs tab) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHasSubtypes(true);

        ItemInit.ITEMS.add(this);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, World world, List<String> stacks, ITooltipFlag flags) {
        if (par1ItemStack.getItem() == ItemInit.SCYTHE_KRONOS) {
            if (GuiScreen.isShiftKeyDown()) {
                addStringToTooltip(TextFormatting.BLUE + I18n.format("") +
                        TextFormatting.ITALIC + I18n.format("Given to Kronos by his mother Gaia"), stacks);
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

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
        if(( entityIn instanceof EntityPlayer) && ((EntityPlayer) entityIn).getHeldItemMainhand().getItem() == ItemInit.PEN_RIPTIDE) {
            ItemStack scythe = new ItemStack(ItemInit.SCYTHE_KRONOS);
            scythe.addEnchantment(Enchantments.SWEEPING, 2);
        }
    }

    /*@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        ItemStack scythe = new ItemStack(ItemInit.SCYTHE_KRONOS);
        scythe.addEnchantment(Enchantments.SWEEPING, 2);
        setCreativeTab(tab);
    }*/

    public boolean canHarvestBlock(IBlockState blockIn)
    {
        return blockIn.getBlock() == Blocks.WEB;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
