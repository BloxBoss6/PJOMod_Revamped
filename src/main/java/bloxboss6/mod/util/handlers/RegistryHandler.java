package bloxboss6.mod.util.handlers;

import bloxboss6.mod.Main;
import bloxboss6.mod.init.BlockInit;
import bloxboss6.mod.init.EntityInit;
import bloxboss6.mod.init.ItemInit;
import bloxboss6.mod.util.interfaces.IHasModel;
import bloxboss6.mod.util.keybinds.KeyInputHandler;
import bloxboss6.mod.util.keybinds.Keybinds;
import bloxboss6.mod.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel) item).registerModels();
            }
        }

        for (Block block : BlockInit.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel) block).registerModels();
            }
        }

    }

    public static void preInitRegistries() {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);

        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        Keybinds.register();
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
    }

    public static void initRegistries() {
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
        ItemStack stack = new ItemStack(ItemInit.SCYTHE_KRONOS);
        stack.addEnchantment(Enchantments.SWEEPING, 2);
    }

    public static void postInitRegistries() {}

}
