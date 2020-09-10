package bloxboss6.mod.util.handlers;

import bloxboss6.mod.entity.EntitySatyr;
import bloxboss6.mod.entity.EntitySpartus;
import bloxboss6.mod.entity.render.RenderSatyr;
import bloxboss6.mod.entity.render.RenderSpartus;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntitySatyr.class, new IRenderFactory<EntitySatyr>() {
            @Override
            public Render<? super EntitySatyr> createRenderFor(RenderManager manager) {
               return new RenderSatyr(manager);
            }
        });
        RenderingRegistry.registerEntityRenderingHandler(EntitySpartus.class, new IRenderFactory<EntitySpartus>() {
            @Override
            public Render<? super EntitySpartus> createRenderFor(RenderManager manager) {
                return new RenderSpartus(manager);
            }
        });
    }
}
