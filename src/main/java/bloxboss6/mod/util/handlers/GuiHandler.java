package bloxboss6.mod.util.handlers;

import bloxboss6.mod.objects.blocks.machines.forge.ContainerForge;
import bloxboss6.mod.objects.blocks.machines.forge.GuiForge;
import bloxboss6.mod.objects.blocks.machines.forge.TileEntityForge;
import bloxboss6.mod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_FORGE) return new ContainerForge(player.inventory, (TileEntityForge)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if(ID == Reference.GUI_FORGE) return new GuiForge(player.inventory, (TileEntityForge)world.getTileEntity(new BlockPos(x,y,z)));
        return null;
    }
}
