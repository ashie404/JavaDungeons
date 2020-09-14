package juniebyte.javadungeons.utils;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class VillagerProfessionCreator {

    private String name;
    private PointOfInterestType pointOfInterest;
    private ImmutableSet<Item> gatherableItems;
    private ImmutableSet<Block> secondaryJobSites;

    public static VillagerProfessionCreator creator() {
        return new VillagerProfessionCreator();
    }


    public VillagerProfessionCreator name(String name) {
        this.name = name;
        return this;
    }

    public VillagerProfessionCreator pointOfInterest(PointOfInterestType pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
        return this;
    }

    public VillagerProfessionCreator gatherableItems(ImmutableSet<Item> gatherableItems) {
        this.gatherableItems = gatherableItems;
        return this;
    }

    public VillagerProfessionCreator secondaryJobSites(ImmutableSet<Block> secondaryJobSites) {
        this.secondaryJobSites = secondaryJobSites;
        return this;
    }

    public VillagerProfession register() {
        return VillagerProfessionRegistry.register(name, pointOfInterest, gatherableItems, secondaryJobSites);
    }

}
