package bloxboss6.mod.util.keybinds;

import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.proxy.ClientProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

public class KeyInputHandler {

    /*@SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keybinds.SWAP_WEAPON.isPressed()) {
            if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
                //this.executeProcedure();

                EntityPlayer entity = Minecraft.getMinecraft().player;
                {
                    java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
                    $_dependencies.put("entity", entity);
                    executeProcedure($_dependencies);
                }

            }
        }
    }*/

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(InputEvent.KeyInputEvent event)
    {
        // DEBUG
        System.out.println("Key Input Event");

        // make local copy of key binding array
        KeyBinding[] keyBindings = ClientProxy.keyBindings;

        // check each enumerated key binding type for pressed and take appropriate action
        if (keyBindings[0].isPressed())
        {
            // DEBUG
            System.out.println("Key binding ="+keyBindings[0].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
            if (!FMLClientHandler.instance().isGUIOpen(GuiChat.class)) {
                //this.executeProcedure();

                EntityPlayer entity = Minecraft.getMinecraft().player;
                {
                    java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
                    $_dependencies.put("entity", entity);
                    executeProcedure($_dependencies);
                }

            }
        }
    }


    private static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
        if (dependencies.get("entity") == null) {
            System.err.println("Failed to load dependency entity for procedure MCreatorSwapWeaponsProcedure!");
            return;
        }
        Entity entity = (Entity) dependencies.get("entity");
        double Coin;
        entity.playSound(SoundEvents.BLOCK_ANVIL_LAND, 0.5F, 0.5F);
        if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.PEN_RIPTIDE)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.PEN_RIPTIDE).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SWORD_RIPTIDE));
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SWORD_RIPTIDE)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SWORD_RIPTIDE).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.PEN_RIPTIDE));
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.MACE_THALIA)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.MACE_THALIA).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SPEAR_THALIA));
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SPEAR_THALIA)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SPEAR_THALIA).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.MACE_THALIA));
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.COIN_JASON)) {
            Coin = (double) Math.round(Math.random());
            {
                MinecraftServer mcserv = FMLCommonHandler.instance().getMinecraftServerInstance();
                if (mcserv != null)
                    mcserv.getPlayerList().sendMessage(new TextComponentString((((Coin)) + "" + (" Coin"))));
            }
            if (((Coin) == 0)) {
                ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.COIN_JASON).getItem(), -1, 1, null);
                ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SPEAR_JASON));
            } else if (((Coin) == 1)) {
                ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.COIN_JASON).getItem(), -1, 1, null);
                ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SWORD_JASON));
            }
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SPEAR_JASON)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SPEAR_JASON).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.COIN_JASON));
            Coin = (double) 2;
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SWORD_JASON)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SWORD_JASON).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.COIN_JASON));
            Coin = (double) 2;
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SWORD_BACKBITER)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SWORD_BACKBITER).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SCYTHE_KRONOS));
        } else if (((entity instanceof EntityPlayer) && ((EntityPlayer) entity).getHeldItemMainhand().getItem() == ItemInit.SCYTHE_KRONOS)) {
            ((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemInit.SCYTHE_KRONOS).getItem(), -1, 1, null);
            ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(ItemInit.SWORD_BACKBITER));
        }

    }
}
