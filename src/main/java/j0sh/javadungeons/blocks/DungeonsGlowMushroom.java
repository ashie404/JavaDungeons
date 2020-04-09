package j0sh.javadungeons.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SeaPickleBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import j0sh.javadungeons.JavaDungeons;
import j0sh.javadungeons.content.Sounds;

public class DungeonsGlowMushroom extends SeaPickleBlock {

    // generic block

    public BlockItem blockItem;

    boolean stepping = false;


    @Override
    public int getLuminance(BlockState state) {
        return 12;
    }
    
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient) {
            // -0.0 on y axis because minecraft entity velocity big dumb
            if (!entity.getVelocity().equals(new Vec3d(0.0, -0.0, 0.0))) {
                world.playSound(
                        null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                        pos, // The position of where the sound will come from
                        Sounds.CW_GLOW_MUSHROOM_STEP, // The sound that will play, in this case, the sound the anvil plays when it lands.
                        SoundCategory.BLOCKS, // This determines which of the volume sliders affect this sound
                        1f, //Volume multiplier, 1 is normal, 0.5 is half volume, etc
                        1f // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
                );
            }
        }
        
        super.onSteppedOn(world, pos, entity);
    }

    public DungeonsGlowMushroom(Block base, ItemGroup group, String id) {
        super(FabricBlockSettings.copy(base).collidable(false).build());
        Registry.register(Registry.BLOCK, new Identifier(JavaDungeons.MOD_ID, id), this);
        Registry.register(Registry.ITEM,new Identifier(JavaDungeons.MOD_ID, id), blockItem = new BlockItem(this, new Item.Settings().group(group)));
    }

}