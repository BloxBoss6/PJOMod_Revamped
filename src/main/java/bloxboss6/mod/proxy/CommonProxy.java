package bloxboss6.mod.proxy;

import net.minecraft.item.Item;

public abstract class CommonProxy implements ISideProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
    }

    public void registerVariantRenderer(Item item, int meta, String filename, String id) {
    }

    public static void openQuizGui(){
    }
}
