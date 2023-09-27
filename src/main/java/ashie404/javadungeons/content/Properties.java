package ashie404.javadungeons.content;

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

    public static EnumProperty<Contains> CONTAINS;

    public static void init() {
        CONTAINS = EnumProperty.of("contains", Contains.class);
    }
}