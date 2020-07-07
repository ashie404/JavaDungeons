package juniebyte.javadungeons.content;

import juniebyte.javadungeons.blocks.DungeonsTransformer;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Containers {

    public static void init() {
        ContainerProviderRegistry.INSTANCE.registerFactory(DungeonsTransformer.ID, (syncId, identifier, player, buf) -> {
            final World world = player.world;
            final BlockPos pos = buf.readBlockPos();
            return world.getBlockState(pos).createScreenHandlerFactory(player.world, pos).createMenu(syncId, player.inventory, player);
        });
    }

}