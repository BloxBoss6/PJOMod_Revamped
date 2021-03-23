package bloxboss6.mod.util.keybinds;

import bloxboss6.mod.init.ItemInit;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class SwapTool {
    private Item[] swapItems = {
            ItemInit.PEN_RIPTIDE,
            ItemInit.SWORD_RIPTIDE,
            ItemInit.MACE_THALIA,
            ItemInit.SPEAR_THALIA,
            ItemInit.COIN_JASON,
            ItemInit.SWORD_JASON,
            ItemInit.SPEAR_JASON,
            ItemInit.SWORD_BACKBITER,
            ItemInit.SCYTHE_KRONOS
    };

    public void swapMethod(Item item, EntityPlayer entity) {
        if (compatible(item)) {
            Item[] items = counterpart(item);
            if (items[0] != null) {
                int slot = entity.inventory.getSlotFor(new ItemStack(items[0]));
                entity.inventory.removeStackFromSlot(slot);
                entity.inventory.setInventorySlotContents(slot, new ItemStack(items[1]));
                entity.playSound(SoundEvents.BLOCK_ANVIL_LAND, 0.5F, 0.5F);
            }
        }
    }

    private Item[] counterpart(Item item) {
        Item[] items = {null, null, null};
        if (item == swapItems[0]) { // Check if Riptide Pen
            items[0] = item;
            items[1] = swapItems[1];
        } else if (item == swapItems[1]) { // Check if Riptide Sword
            items[0] = item;
            items[1] = swapItems[0];
        } else if (item == swapItems[2]) { // Check if Thalia's Can of Mace
            items[0] = item;
            items[1] = swapItems[3];
        } else if (item == swapItems[3]) { // Check if Thalia's Spear
            items[0] = item;
            items[1] = swapItems[2];
        } else if (item == swapItems[4]) { // Check if Jason's Coin
            Random rand = new Random();
            if (rand.nextInt(2) == 0) { // Decides whether to go to spear or sword
                items[0] = item;
                items[1] = swapItems[5];
            } else {
                items[0] = item;
                items[1] = swapItems[6];
            }
        } else if (item == swapItems[5]) { // Check if Jason's Sword
            items[0] = item;
            items[1] = swapItems[4];
        } else if (item == swapItems[6]) { // Check if Jason's Spear
            items[0] = item;
            items[1] = swapItems[4];
        } else if (item == swapItems[7]) { // Check if Backbiter
            items[0] = item;
            items[1] = swapItems[8];
        } else if (item == swapItems[8]) { // Check if Kronos' Scythe
            items[0] = item;
            items[1] = swapItems[7];
        }
        return items;
    }

    private boolean compatible(Item check) {
        for (Item item : swapItems) {
            if (check == item) {
                return true;
            }
        }
        return false;
    }
}
