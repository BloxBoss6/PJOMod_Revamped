package bloxboss6.mod.util.keybinds;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.thread.SidedThreadGroups;
import org.lwjgl.input.Keyboard;

public class Keybinds {

    public static KeyBinding SWAP_WEAPON;

    public static void register() {
        if(Thread.currentThread().getThreadGroup() != SidedThreadGroups.SERVER) {
            SWAP_WEAPON = new KeyBinding("key.pjom.swap_weapon", Keyboard.KEY_V, "key.categories.pjom");

            ClientRegistry.registerKeyBinding(SWAP_WEAPON);
        }
    }

}
