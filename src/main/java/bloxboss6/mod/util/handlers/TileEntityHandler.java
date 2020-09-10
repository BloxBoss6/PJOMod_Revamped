package bloxboss6.mod.util.handlers;

import bloxboss6.mod.objects.blocks.machines.forge.TileEntityForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler {

    public static void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntityForge.class, "forge");
    }

}
