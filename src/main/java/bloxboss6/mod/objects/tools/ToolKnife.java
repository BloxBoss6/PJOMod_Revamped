package bloxboss6.mod.objects.tools;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class ToolKnife extends ItemSword implements IHasModel {

    public ToolKnife(String name, ToolMaterial material, CreativeTabs tab) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, World world, List<String> stacks, ITooltipFlag flags) {
        if (par1ItemStack.getItem() == ItemInit.KNIFE_KATOPTRIS) {
            addStringToTooltip(TextFormatting.BLUE + I18n.format("Originally owned by Helen of Troy"), stacks);
            addStringToTooltip(TextFormatting.BLUE + I18n.format("Shows visions in it's reflection"), stacks);
            addStringToTooltip(I18n.format(""), stacks);
            addStringToTooltip(I18n.format("Press ") +
                    TextFormatting.AQUA + I18n.format("V") +
                    TextFormatting.GRAY + I18n.format(" to switch"), stacks);
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
