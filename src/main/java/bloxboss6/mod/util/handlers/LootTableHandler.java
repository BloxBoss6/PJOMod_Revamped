package bloxboss6.mod.util.handlers;

import bloxboss6.mod.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler {

    public static final ResourceLocation SATYR = LootTableList.register(new ResourceLocation(Reference.MODID, "satyr"));
    public static final ResourceLocation SPARTUS = LootTableList.register(new ResourceLocation(Reference.MODID, "spartus"));

}
