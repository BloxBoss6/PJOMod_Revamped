package bloxboss6.mod.util.keybinds;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

public class Keybinds {

    @SideOnly(Side.CLIENT)
    public static KeyBinding SWAP_WEAPON;

    @SideOnly(Side.CLIENT)
    public static void register() {
        SWAP_WEAPON = new KeyBinding("key.pjom.swap_weapon", Keyboard.KEY_V, "key.categories.pjom");

        ClientRegistry.registerKeyBinding(SWAP_WEAPON);
    }

}
