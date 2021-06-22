package juniebyte.javadungeons.blocks;

import juniebyte.javadungeons.JavaDungeons;
import juniebyte.javadungeons.content.Sounds;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Random;

public class DungeonsGlowMushroom extends SeaPickleBlock {

    // glow mushroom block block
    public BlockItem blockItem;
    
    int soundsPlayed = 0;
    int waitCounter = 0;

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient) {
            if (soundsPlayed <= 5) {
                Vec3d velocity = entity.getVelocity();
                // -0.0 on y axis because minecraft entity velocity big dumb
                if (!velocity.equals(new Vec3d(0.0, -0.0, 0.0))) {
                    // random seed based on player velocity
                    Random rand = new Random(Math.round(velocity.x*4 + velocity.y*4 + velocity.z*4));
                    world.playSound(
                            null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                            pos, // The position of where the sound will come from
                            Sounds.CW_GLOW_MUSHROOM_STEP, // The sound that will play, in this case, the sound the anvil plays when it lands.
                            SoundCategory.BLOCKS, // volume slider category
                            rand.nextFloat()*0.13f, //Random volume multiplier (multiplied by 0.13 to avoid ear explosion)
                            1.0f // Pitch multiplier
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
        
        super.onSteppedOn(world, pos, state, entity);
    }

    public DungeonsGlowMushroom(Material material, float hardness, float resistance, BlockSoundGroup sounds, ItemGroup group, String id) {
        super(FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sounds).collidable(false).lightLevel(12));
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }
}