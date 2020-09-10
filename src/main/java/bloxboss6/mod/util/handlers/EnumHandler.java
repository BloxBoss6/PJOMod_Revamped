package bloxboss6.mod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler {

    public static enum EnumType implements IStringSerializable {

        CB(0, "cb"),
        SI(1, "si");

        private static final EnumType[] META_LOOKUP = new EnumType[values().length];
        private final int meta;
        private final String name, unlocalizedName;

        private EnumType(int meta, String name) {
            this(meta, name, name);
        }

        private EnumType(int meta, String name, String unlocalizedName) {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getMeta() {
            return this.meta;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static EnumType byMetaData(int meta) {
            return META_LOOKUP[meta];
        }

        static {
            for (EnumType enumtype : values()) {
                META_LOOKUP[enumtype.getMeta()] = enumtype;
            }
        }
    }

}
