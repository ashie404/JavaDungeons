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

    public static final EnumProperty<Contains> CONTAINS = EnumProperty.of("contains", Contains.class);
}