package bloxboss6.mod.objects.items.quiz;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.proxy.ClientProxy;
import bloxboss6.mod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemQuiz extends Item implements IHasModel {

    public ItemQuiz(String name, CreativeTabs tab) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }


    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
        ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
        {
            ClientProxy.openQuizGui();
        }
        return ar;
    }


}
