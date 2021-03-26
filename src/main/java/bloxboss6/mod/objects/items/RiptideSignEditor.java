package bloxboss6.mod.objects.items;

import bloxboss6.mod.init.ItemInit;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RiptideSignEditor {

    @SubscribeEvent
    public void riptideEditSign(RightClickBlock event) {
        BlockPos pos = new BlockPos(event.getHitVec());
        IBlockState state = event.getWorld().getBlockState(pos);
        EntityPlayer player = event.getEntityPlayer();
        TileEntity tileentity = event.getWorld().getTileEntity(pos);

        if(event.getEntityPlayer().isSneaking()) return;
        if(!riptideHeld(event.getEntityPlayer())) return;
        if(state.getBlock() != Blocks.STANDING_SIGN && state.getBlock() != Blocks.WALL_SIGN) return;
        if(tileentity instanceof TileEntitySign) {
            TileEntitySign sign = (TileEntitySign) tileentity;
            sign.setPlayer(player);
            ObfuscationReflectionHelper.setPrivateValue(TileEntitySign.class, sign, true, "field_145916_j", "isEditable");
            player.openEditSign(sign);
        }
    }

    private static boolean riptideHeld(EntityPlayer player) {
        if (player.getHeldItemMainhand() == new ItemStack(ItemInit.PEN_RIPTIDE) || player.getHeldItemOffhand() == new ItemStack(ItemInit.PEN_RIPTIDE)) {
            return true;
        }

        /*for (ItemStack stack : player.getHeldEquipment()) {
            if (stack.getItem() == ItemInit.PEN_RIPTIDE) {
                return true;
            }
        }*/
        return false;
    }

}
