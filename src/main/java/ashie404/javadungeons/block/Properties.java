package ashie404.javadungeons.block;

import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.StringIdentifiable;

public class Properties {

    public static enum Contains implements StringIdentifiable {
        EMPTY("empty"),
        YELLOW_TULIP("yellow_tulip");

        private final String name;

        private Contains(String name) {
            this.name = name;
        }

        public String asString() {
            return this.name;
        }
    }

    public static enum LitVariant implements StringIdentifiable {
        UNLIT("unlit"),
        LIT("lit"),
        LIT_GREEN("lit_green");

        private final String name;

        private LitVariant(String name) {
            this.name = name;
        }

        public String asString() {
            return this.name;
        }
    }

    public static final EnumProperty<Contains> CONTAINS = EnumProperty.of("contains", Contains.class);
    public static final EnumProperty<LitVariant> LIT_VARIANT = EnumProperty.of("lit_variant", LitVariant.class);
}