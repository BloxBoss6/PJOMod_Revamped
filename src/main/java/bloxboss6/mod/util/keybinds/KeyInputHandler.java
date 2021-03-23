package bloxboss6.mod.util.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyInputHandler {
    private SwapTool swapTool = new SwapTool();

    @SubscribeEvent
    public void onKeyInput(KeyInputEvent event) {
        if (Keybinds.SWAP_WEAPON.isPressed()) {
            if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
                this.executeSwap();
            }
        }
    }

    private void executeSwap() {
        EntityPlayer entity = Minecraft.getMinecraft().player;

        Item held = entity.getHeldItemMainhand().getItem();
        swapTool.swapMethod(held, entity);

    }
}
