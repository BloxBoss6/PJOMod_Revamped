package bloxboss6.mod.objects.tools;

import bloxboss6.mod.init.ItemInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class SwordRiptide extends Item/*ItemSword implements IHasModel*/ {

    public SwordRiptide(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(1);

        ItemInit.ITEMS.add(this);
    }

    public boolean canHarvestBlock(IBlockState blockIn) {
        return blockIn.getBlock() == Blocks.WEB;
    }

    /*@SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation("pjom:sword_riptide_new", "inventory"));
    }*/



}