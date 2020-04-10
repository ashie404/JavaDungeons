package j0sh.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundCategory;
import net.minecraft.tag.Tag;
import net.fabricmc.fabric.api.block.FabricBlockSettings;

import virtuoel.towelette.api.Fluidloggable;

import java.util.Random;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.content.Sounds;

public class DungeonsGlowMushroom extends SeaPickleBlock implements Fluidloggable {

    // glow mushroom block block

    public BlockItem blockItem;
    
    int soundsPlayed = 0;
    int waitCounter = 0;

    boolean stepping = false;


    @Override
    public int getLuminance(BlockState state) {
        return 12;
    }
    
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient) {
            // -0.0 on y axis because minecraft entity velocity big dumb
            if (soundsPlayed <= 5) {
                Vec3d velocity = entity.getVelocity();
                if (!velocity.equals(new Vec3d(0.0, -0.0, 0.0))) {
                    // random seed based on player velocity
                    Random rand = new Random(Math.round(velocity.x*4 + velocity.y*4 + velocity.z*4));
                    Random randpitch = new Random();
                    world.playSound(
                            null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                            pos, // The position of where the sound will come from
                            Sounds.CW_GLOW_MUSHROOM_STEP, // The sound that will play, in this case, the sound the anvil plays when it lands.
                            SoundCategory.BLOCKS, // This determines which of the volume sliders affect this sound
                            (rand.nextFloat()*0.13f), //Random volume multiplier (multiplied by 0.15 to avoid ear explosion)
                            0.98f + (rand.nextFloat()/10) + (randpitch.nextFloat()/50) // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
                    );
                    soundsPlayed++;
                }
            }
            else {
                if (waitCounter <= 17) {
                    waitCounter++;
                } else {
                    soundsPlayed = 0;
                    waitCounter = 0;
                }
                
            }
        }
        
        super.onSteppedOn(world, pos, entity);
    }

    public DungeonsGlowMushroom(Block base, Boolean byHand, Tag<Item> tool, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).breakByHand(byHand).breakByTool(tool).collidable(false).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}