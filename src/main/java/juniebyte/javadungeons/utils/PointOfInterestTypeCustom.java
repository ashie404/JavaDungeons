package juniebyte.javadungeons.utils;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.world.poi.PointOfInterestType;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PointOfInterestTypeCustom {

    String id;
    public final Set<BlockState> workStationStates;
    private final int ticketCount;
    private final int searchDistance;

    public PointOfInterestTypeCustom(String id, Set<BlockState> workStationStates, int ticketCount, int searchDistance) {
        this.id = id;
        this.workStationStates = ImmutableSet.copyOf(workStationStates);
        this.ticketCount = ticketCount;
        this.searchDistance = searchDistance;
    }

    public static Set<BlockState> getAllStatesOf(Block block) {
        return ImmutableSet.copyOf(block.getStateManager().getStates());
    }

    public PointOfInterestType register() {
        PointOfInterestType interestType = null;
        try {
            Constructor<PointOfInterestType> pointOfInterestType = PointOfInterestType.class.getDeclaredConstructor(String.class, Set.class, int.class, int.class);
            pointOfInterestType.setAccessible(true);
            interestType = pointOfInterestType.newInstance(id, workStationStates, ticketCount, searchDistance);
            Map<BlockState, PointOfInterestType> map = (Map<BlockState, PointOfInterestType>) Reflect.getMemberByType(PointOfInterestType.class, Map.class, null);
            for (BlockState blockState : workStationStates) {
                Objects.requireNonNull(map).put(blockState, interestType);
            }
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return Objects.requireNonNull(interestType);
    }

}
