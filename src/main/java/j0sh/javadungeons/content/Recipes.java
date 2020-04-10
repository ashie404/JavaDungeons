package j0sh.javadungeons.content;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.recipe.DimensionalRectifierRecipe;

public class Recipes {

    public static void init() {
        Registry.register(Registry.RECIPE_SERIALIZER, DimensionalRectifierRecipe.ID, DimensionalRectifierRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(JavaDungeons.MOD_ID, "dimensional_rectifier"), DimensionalRectifierRecipe.TYPE);
    }
    
}