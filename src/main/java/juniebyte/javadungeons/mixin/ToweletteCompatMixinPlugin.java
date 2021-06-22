package juniebyte.javadungeons.mixin;

import java.util.List;
import java.util.Set;

import com.google.common.collect.ImmutableList;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import net.fabricmc.loader.api.FabricLoader;

public class ToweletteCompatMixinPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String mixinPackage) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        // if this is a compatibility mixin (injects into my mod instead of into minecraft) and not just a normal mixin, check to see if towelette is loaded
        // if towelette is loaded, load compat mixins
        if (targetClassName.contains("juniebyte")) {
            return FabricLoader.getInstance().isModLoaded("towelette");
        } else {
            return true;
        }
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return ImmutableList.of();
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        
    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
        
    }
}
