package j0sh.javadungeons.content;

import j0sh.javadungeons.JavaDungeons;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Containers {

    public static void init() {
        ContainerProviderRegistry.INSTANCE.registerFactory(new Identifier(JavaDungeons.MOD_ID, "dungeons_transformer"), (syncId, identifier, player, buf) -> {
            final World world = player.world;
            final BlockPos pos = buf.readBlockPos();
            return world.getBlockState(pos).createContainerFactory(player.world, pos).createMenu(syncId, player.inventory, player);
        });
    }

}