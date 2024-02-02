package ashie404.javadungeons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;

import ashie404.javadungeons.JavaDungeons;
import ashie404.javadungeons.biome.Biomes;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.HeightLimitView;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeAccess;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.chunk.BlockColumn;
import net.minecraft.world.gen.chunk.ChunkNoiseSampler;
import net.minecraft.world.gen.noise.NoiseConfig;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;

@Mixin(SurfaceBuilder.class)
public class MixinSurfaceBuilder {
    // Do you love jank? Cause I love jank

    @Invoker("placeBadlandsPillar")
    public void invokePlaceBadlandsPillar(BlockColumn column, int x, int z, int surfaceY, HeightLimitView chunk) {
        JavaDungeons.log.info("Are we ok?");
    }

    @Inject(
        method = "buildSurface", 
        at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/source/BiomeAccess;getBiome(Lnet/minecraft/util/math/BlockPos;)"), 
        cancellable = true
    )
    public void hookBuildSurface(CallbackInfo ci, NoiseConfig noiseConfig, 
        BiomeAccess biomeAccess, Registry<Biome> biomeRegistry, boolean useLegacyRandom, HeightContext heightContext, 
        final Chunk chunk, ChunkNoiseSampler chunkNoiseSampler, MaterialRules.MaterialRule materialRule,
        @Local(ordinal = 0) LocalRef<BlockColumn> blockCol, @Local(ordinal = 0) LocalRef<RegistryEntry<Biome>> regEntry,  
        @Local(ordinal = 2) LocalIntRef m, @Local(ordinal = 3) LocalIntRef n, @Local(ordinal = 4) LocalIntRef o) {
        if (regEntry.get().matchesKey(Biomes.CACTI_CANYON)) {
            invokePlaceBadlandsPillar(blockCol.get(), m.get(), n.get(), o.get(), chunk);
        }
    }
}
