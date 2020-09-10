package bloxboss6.mod.proxy;

// Code from Bountiful Baubles

import net.minecraft.client.model.ModelBiped;

public interface ISideProxy {

    public default String translate(String string) {
        return string;
    }

    public default ModelBiped getArmorModel(String modelName) {
        return null;
    }

}
