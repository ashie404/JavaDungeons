package juniebyte.javadungeons.mixin;

import com.mojang.authlib.GameProfile;
import juniebyte.javadungeons.ICapeTexture;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerListEntry.class)
public abstract class PlayerListEntryMixin implements ICapeTexture {
    @Shadow
    @Final
    private GameProfile profile;

    @Inject(method = "getCapeTexture", at = @At("RETURN"), cancellable = true)
    public void getCapeTexture(CallbackInfoReturnable<Identifier> callbackInfoReturnable) {

    }

    @Inject(method = "getElytraTexture", at = @At("RETURN"), cancellable = true)
    public void getElytraTexture(CallbackInfoReturnable<Identifier> callbackInfoReturnable) {

    }
    
}