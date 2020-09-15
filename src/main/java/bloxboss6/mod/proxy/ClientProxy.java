package bloxboss6.mod.proxy;

import bloxboss6.mod.objects.armor.models.ModelShirt;
import bloxboss6.mod.util.Reference;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy implements ISideProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    @Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, filename), id));
    }

    private static final ModelShirt modelShirt = new ModelShirt();

    public static KeyBinding[] keyBindings;

    public static void setKeyBindings(KeyBinding[] keyBindings) {
        keyBindings = new KeyBinding[1];

        keyBindings[0] = new KeyBinding("key.pjom.swap_weapon", Keyboard.KEY_V, "key.categories.pjom");

        for (int i = 0; i < keyBindings.length; ++i)
        {
            ClientRegistry.registerKeyBinding(keyBindings[i]);
        }
    }

    @Override
    public ModelBiped getArmorModel(String modelName) {
        if (modelName.equals("shirt_ch"))
            return modelShirt;
        return null;
    }

    // TODO escape formatting properly instead of doing this
    @SuppressWarnings("deprecation")
    @Override
    public String translate(String string) {
        return net.minecraft.util.text.translation.I18n.translateToLocal(string);
    }

}
