package j0sh.javadungeons.recipe;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Recipes {
    public static void init() {
        Registry.register(Registry.RECIPE_SERIALIZER, DDRRecipe.ID, DDRRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier("dungeons", "ddr"), DDRRecipe.TYPE);
        
    }

}