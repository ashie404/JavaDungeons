package j0sh.javadungeons.content;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.recipe.DungeonsTransformerRecipe;
import j0sh.javadungeons.recipe.DungeonsTransformerRecipe.Serializer;

public class Recipes {

    public static Serializer DUNGEONS_TRANSFORMER_SERIALIZER;
    
    public static void init() {
        DUNGEONS_TRANSFORMER_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, DungeonsTransformerRecipe.ID, DungeonsTransformerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(JavaDungeons.MOD_ID, "dungeons_transformer"), DungeonsTransformerRecipe.TYPE);
    }
}