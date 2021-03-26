package bloxboss6.mod.objects.items;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ItemNonStackBase extends Item implements IHasModel {

    public ItemNonStackBase(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, World world, List<String> stacks, ITooltipFlag flags) {
        if (par1ItemStack.getItem() == ItemInit.PEN_RIPTIDE) {
            if (GuiScreen.isShiftKeyDown()) {
                addStringToTooltip(TextFormatting.BLUE + I18n.format("Click on Sign to Edit"), stacks);
                addStringToTooltip(I18n.format(""), stacks);
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("V") +
                        TextFormatting.GRAY + I18n.format(" to switch"), stacks);
            } else {
                addStringToTooltip(I18n.format("Press ") +
                        TextFormatting.AQUA + I18n.format("shift") +
                        TextFormatting.GRAY + I18n.format(" for more info"), stacks);
            }
        } else if (par1ItemStack.getItem() == ItemInit.MACE_THALIA) {
            if (GuiScreen.isShiftKeyDown()) {
                addStringToTooltip(TextFormatting.ITALIC.toString() + TextFormatting.BLUE + I18n.format("Mace Canister (WIP)"), stacks);
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

    public boolean canHarvestBlock(IBlockState blockIn) {
        return blockIn.getBlock() == Blocks.WEB;
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
