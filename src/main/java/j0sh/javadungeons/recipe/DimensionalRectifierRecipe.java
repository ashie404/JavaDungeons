package j0sh.javadungeons.recipe;

import j0sh.javadungeons.JavaDungeons;

import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.util.DefaultedList;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.PacketByteBuf;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class DimensionalRectifierRecipe implements Recipe<Inventory> {
    
    public static final Identifier ID = new Identifier(JavaDungeons.MOD_ID, "dimensional_rectifier");
    public static final Type TYPE = new Type();
    public static final Serializer SERIALIZER = new Serializer();

    private Identifier id;
    private Ingredient input;
    private ItemStack output;

    private DimensionalRectifierRecipe(Identifier id, Ingredient input, ItemStack output) {
        this.id = id;
        this.input = input;
        this.output = output;
    }

    @Override
    public boolean matches(Inventory inv, World world) {
        return input.test(inv.getInvStack(0)) && inv.getInvStack(1).isEmpty();
    }

    @Override
    public ItemStack craft(Inventory inv) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return output;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return TYPE;
    }

    @Override
    public DefaultedList<Ingredient> getPreviewInputs() {
        return DefaultedList.copyOf(Ingredient.EMPTY, this.input);
    }

    public static class Type implements RecipeType<DimensionalRectifierRecipe> {
        @Override
        public String toString() {
            return ID.toString();
        }
    }

    public static class Serializer implements RecipeSerializer<DimensionalRectifierRecipe> {

        public static final Serializer INSTANCE = new Serializer();

        @Override
        public DimensionalRectifierRecipe read(Identifier id, JsonObject jsonObject) {
            Ingredient ingredient2;
            if (JsonHelper.hasArray(jsonObject, "ingredient")) {
                ingredient2 = Ingredient.fromJson(JsonHelper.getArray(jsonObject, "ingredient"));
            } else {
                ingredient2 = Ingredient.fromJson(JsonHelper.getObject(jsonObject, "ingredient"));
            }

            String string2 = JsonHelper.getString(jsonObject, "result");
            int i = JsonHelper.getInt(jsonObject, "count");
            ItemStack itemStack = new ItemStack(Registry.ITEM.get(new Identifier(string2)), i);
            return new DimensionalRectifierRecipe(id, ingredient2, itemStack);
        }

        @Override
        public DimensionalRectifierRecipe read(Identifier id, PacketByteBuf packetByteBuf) {
            Ingredient ingredient = Ingredient.fromPacket(packetByteBuf);
            ItemStack itemStack = packetByteBuf.readItemStack();
            return new DimensionalRectifierRecipe(id, ingredient, itemStack);
        }

        @Override
        public void write(PacketByteBuf packetByteBuf, DimensionalRectifierRecipe recipe) {
            recipe.input.write(packetByteBuf);
            packetByteBuf.writeItemStack(recipe.output);
        }
    }
}