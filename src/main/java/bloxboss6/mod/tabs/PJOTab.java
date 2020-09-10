package bloxboss6.mod.tabs;

import bloxboss6.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PJOTab extends CreativeTabs {

    public PJOTab(String label) {

        super("pjotab");
        this.setBackgroundImageName("pjo.png");

    }

    public ItemStack getTabIconItem() {

        return new ItemStack(ItemInit.INGOT_CB);

    }

}
