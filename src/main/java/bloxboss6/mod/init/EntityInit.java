package bloxboss6.mod.init;

import bloxboss6.mod.Main;
import bloxboss6.mod.entity.EntitySatyr;
import bloxboss6.mod.entity.EntitySpartus;
import bloxboss6.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {

    public static void registerEntities() {
        registerEntity("satyr", EntitySatyr.class, Reference.ENTITY_SATYR, 50, 3745044, 16754769);
        registerEntity("spartus", EntitySpartus.class, Reference.ENTITY_SPARTUS, 50, 2039583, 13152106);
    }

    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
    }

}
