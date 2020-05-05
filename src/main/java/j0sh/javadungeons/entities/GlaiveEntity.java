package j0sh.javadungeons.entities;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import j0sh.javadungeons.content.Weapons;
import j0sh.javadungeons.content.Entities;

public class GlaiveEntity extends ProjectileEntity {
    private static final TrackedData<Byte> LOYALTY;
    private static final TrackedData<Boolean> HAS_GLINT;
    private ItemStack glaiveStack;
    private boolean dealtDamage;
    public int returnTimer;

    public GlaiveEntity(EntityType<? extends GlaiveEntity> entityType, World world) {
       super(entityType, world);
       this.glaiveStack = new ItemStack(Weapons.GLAIVE);
    }

    public GlaiveEntity(World world, LivingEntity owner, ItemStack item) {
       super(Entities.GLAIVE_ENTITY, owner, world);
       this.glaiveStack = new ItemStack(Weapons.GLAIVE);
       this.glaiveStack = item.copy();
       this.dataTracker.set(LOYALTY, (byte)EnchantmentHelper.getLoyalty(item));
       this.dataTracker.set(HAS_GLINT, item.hasEnchantmentGlint());
    }

    @Environment(EnvType.CLIENT)
    public GlaiveEntity(World world, double x, double y, double z) {
       super(Entities.GLAIVE_ENTITY, x, y, z, world);
       this.glaiveStack = new ItemStack(Weapons.GLAIVE);
    }

    protected void initDataTracker() {
       super.initDataTracker();
       this.dataTracker.startTracking(LOYALTY, (byte)0);
       this.dataTracker.startTracking(HAS_GLINT, false);
    }

    public void tick() {
       if (this.inGroundTime > 4) {
          this.dealtDamage = true;
       }

       Entity entity = this.getOwner();
       if ((this.dealtDamage || this.isNoClip()) && entity != null) {
          int i = (Byte)this.dataTracker.get(LOYALTY);
          if (i > 0 && !this.isOwnerAlive()) {
             if (!this.world.isClient && this.pickupType == ProjectileEntity.PickupPermission.ALLOWED) {
                this.dropStack(this.asItemStack(), 0.1F);
             }

             this.remove();
          } else if (i > 0) {
             this.setNoClip(true);
             Vec3d vec3d = new Vec3d(entity.getX() - this.getX(), entity.getEyeY() - this.getY(), entity.getZ() - this.getZ());
             this.setPos(this.getX(), this.getY() + vec3d.y * 0.015D * (double)i, this.getZ());
             if (this.world.isClient) {
                this.lastRenderY = this.getY();
             }

             double d = 0.05D * (double)i;
             this.setVelocity(this.getVelocity().multiply(0.95D).add(vec3d.normalize().multiply(d)));
             if (this.returnTimer == 0) {
                this.playSound(SoundEvents.ITEM_TRIDENT_RETURN, 10.0F, 1.0F);
             }

             ++this.returnTimer;
          }
       }

       super.tick();
    }

    private boolean isOwnerAlive() {
       Entity entity = this.getOwner();
       if (entity != null && entity.isAlive()) {
          return !(entity instanceof ServerPlayerEntity) || !entity.isSpectator();
       } else {
          return false;
       }
    }

    protected ItemStack asItemStack() {
       return this.glaiveStack.copy();
    }

    @Environment(EnvType.CLIENT)
    public boolean hasEnchantmentGlint() {
        return (Boolean)this.dataTracker.get(HAS_GLINT);
    }

    protected EntityHitResult getEntityCollision(Vec3d currentPosition, Vec3d nextPosition) {
       return this.dealtDamage ? null : super.getEntityCollision(currentPosition, nextPosition);
    }

    protected void onEntityHit(EntityHitResult entityHitResult) {
       Entity entity = entityHitResult.getEntity();
       float f = 8.0F;
       if (entity instanceof LivingEntity) {
          LivingEntity livingEntity = (LivingEntity)entity;
          f += EnchantmentHelper.getAttackDamage(this.glaiveStack, livingEntity.getGroup());
       }

       Entity entity2 = this.getOwner();
       DamageSource damageSource = DamageSource.trident(this, (Entity)(entity2 == null ? this : entity2));
       this.dealtDamage = true;
       SoundEvent soundEvent = SoundEvents.ITEM_TRIDENT_HIT;
       if (entity.damage(damageSource, f)) {
          if (entity.getType() == EntityType.ENDERMAN) {
             return;
          }

          if (entity instanceof LivingEntity) {
             LivingEntity livingEntity2 = (LivingEntity)entity;
             if (entity2 instanceof LivingEntity) {
                EnchantmentHelper.onUserDamaged(livingEntity2, entity2);
                EnchantmentHelper.onTargetDamaged((LivingEntity)entity2, livingEntity2);
             }

             this.onHit(livingEntity2);
          }
       }

       this.setVelocity(this.getVelocity().multiply(-0.01D, -0.1D, -0.01D));
       float g = 1.0F;
       if (this.world instanceof ServerWorld && this.world.isThundering() && EnchantmentHelper.hasChanneling(this.glaiveStack)) {
          BlockPos blockPos = entity.getBlockPos();
          if (this.world.isSkyVisible(blockPos)) {
             LightningEntity lightningEntity = new LightningEntity(this.world, (double)blockPos.getX() + 0.5D, (double)blockPos.getY(), (double)blockPos.getZ() + 0.5D, false);
             lightningEntity.setChanneller(entity2 instanceof ServerPlayerEntity ? (ServerPlayerEntity)entity2 : null);
             ((ServerWorld)this.world).addLightning(lightningEntity);
             soundEvent = SoundEvents.ITEM_TRIDENT_THUNDER;
             g = 5.0F;
          }
       }

       this.playSound(soundEvent, g, 1.0F);
    }

    protected SoundEvent getHitSound() {
       return SoundEvents.ITEM_TRIDENT_HIT_GROUND;
    }

    public void onPlayerCollision(PlayerEntity player) {
       Entity entity = this.getOwner();
       if (entity == null || entity.getUuid() == player.getUuid()) {
          super.onPlayerCollision(player);
       }
    }

    public void readCustomDataFromTag(CompoundTag tag) {
       super.readCustomDataFromTag(tag);
       if (tag.contains("Trident", 10)) {
          this.glaiveStack = ItemStack.fromTag(tag.getCompound("Trident"));
       }

       this.dealtDamage = tag.getBoolean("DealtDamage");
       this.dataTracker.set(LOYALTY, (byte)EnchantmentHelper.getLoyalty(this.glaiveStack));
    }

    public void writeCustomDataToTag(CompoundTag tag) {
       super.writeCustomDataToTag(tag);
       tag.put("Trident", this.glaiveStack.toTag(new CompoundTag()));
       tag.putBoolean("DealtDamage", this.dealtDamage);
    }

    public void age() {
       int i = (Byte)this.dataTracker.get(LOYALTY);
       if (this.pickupType != ProjectileEntity.PickupPermission.ALLOWED || i <= 0) {
          super.age();
       }

    }

    protected float getDragInWater() {
       return 0.99F;
    }

    @Environment(EnvType.CLIENT)
    public boolean shouldRender(double cameraX, double cameraY, double cameraZ) {
       return true;
    }

    static {
       LOYALTY = DataTracker.registerData(GlaiveEntity.class, TrackedDataHandlerRegistry.BYTE);
       HAS_GLINT = DataTracker.registerData(GlaiveEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    }
}
