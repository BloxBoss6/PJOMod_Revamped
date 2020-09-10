package bloxboss6.mod.tabs;

import bloxboss6.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PJORareTab extends CreativeTabs {

    public PJORareTab(String label) {

        super("pjoraretab");
        this.setBackgroundImageName("pjo.png");

    }

    public ItemStack getTabIconItem() {

        return new ItemStack(ItemInit.SWORD_RIPTIDE);

    }

}
