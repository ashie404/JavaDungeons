package juniebyte.javadungeons.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.SpellcastingIllagerEntity;
import net.minecraft.entity.passive.AbstractTraderEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.raid.RaiderEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;

public class EnchanterEntity extends SpellcastingIllagerEntity {
    private LivingEntity enchantTarget;

    public float prevCapeX, prevCapeY, prevCapeZ;
    public float capeX, capeY, capeZ;
    private float clientSideBookAnimation0;
    private float clientSideBookAnimation;

    public EnchanterEntity(EntityType<? extends EnchanterEntity> type, World world) {
        super(type, world);
        this.experiencePoints = 12;
    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EnchanterEntity.CastingSpellGoal());
        this.goalSelector.add(2, new AvoidTargetEntityGoal<>(this, MobEntity.class, 6.5F, 0.8D, 1.05D));
        this.goalSelector.add(2, new FleeEntityGoal<>(this, PlayerEntity.class, 8.0F, 0.8D, 1.15D));
        this.goalSelector.add(3, new EnchanterEntity.SpellGoal());
        this.goalSelector.add(8, new WanderAroundGoal(this, 0.8D));
        this.goalSelector.add(9, new LookAtEntityGoal(this, PlayerEntity.class, 3.0F, 1.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, MobEntity.class, 8.0F));
        this.targetSelector.add(1, (new RevengeGoal(this, RaiderEntity.class)).setGroupRevenge());
        this.targetSelector.add(2, (new FollowTargetGoal<>(this, PlayerEntity.class, true)).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(3, (new FollowTargetGoal<>(this, AbstractTraderEntity.class, false)).setMaxTimeWithoutVisibility(300));
        this.targetSelector.add(3, new FollowTargetGoal<>(this, IronGolemEntity.class, false));
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    public void addBonusForWave(int wave, boolean unused) {

    }

    public static DefaultAttributeContainer.Builder getAttributeMap() {
        return HostileEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3F).add(EntityAttributes.GENERIC_MAX_HEALTH, 24.0D).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 24.0D);
    }

    @Override
    public void readCustomDataFromTag(CompoundTag compound) {
        super.readCustomDataFromTag(compound);
    }

    @Override
    public void writeCustomDataToTag(CompoundTag compound) {
        super.writeCustomDataToTag(compound);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.world.isClient) {
            /*if (this.clientSideBookAnimation != this.clientSideBookAnimation0) {
                this.recalculateSize();
            }*/

            this.clientSideBookAnimation0 = this.clientSideBookAnimation;
            if (this.isSpellcasting()) {
                this.clientSideBookAnimation = MathHelper.clamp(this.clientSideBookAnimation + 0.1F, 0.0F, 1.0F);
            } else {
                this.clientSideBookAnimation = MathHelper.clamp(this.clientSideBookAnimation - 0.15F, 0.0F, 1.0F);
            }
        }

        this.updateCape();
    }

    @Environment(EnvType.CLIENT)
    public float getBookAnimationScale(float tick) {
        return MathHelper.lerp(tick, this.clientSideBookAnimation0, this.clientSideBookAnimation) / 1.0F;
    }

    private void updateCape() {
        double elasticity = 0.25;
        double gravity = -0.1;
        this.prevCapeX = this.capeX;
        this.prevCapeY = this.capeY;
        this.prevCapeZ = this.capeZ;
        this.capeY += gravity;
        this.capeX += (this.getX() - this.capeX) * elasticity;
        this.capeY += (this.getY() - this.capeY) * elasticity;
        this.capeZ += (this.getZ() - this.capeZ) * elasticity;
    }

    @Override
    public boolean isTeammate(Entity other) {
        if (super.isTeammate(other)) {
            return true;
        } else if (other instanceof LivingEntity && ((LivingEntity) other).getGroup() == EntityGroup.ILLAGER) {
            return this.getScoreboardTeam() == null && other.getScoreboardTeam() == null;
        } else {
            return false;
        }
    }

    private void setEnchantTarget(LivingEntity enchantTargetIn) {
        this.enchantTarget = enchantTargetIn;
    }

    public LivingEntity getEnchantTarget() {
        return enchantTarget;
    }

    @Override
    protected void dropEquipment(DamageSource source, int lootingMultiplier, boolean allowDrops) {
        super.dropEquipment(source, lootingMultiplier, allowDrops);

        /*if (this.random.nextFloat() < 0.125F + 0.025F * lootingMultiplier) {
            ItemStack itemStack = new ItemStack(ModItems.MOB_ENCHANT_BOOK);

            this.dropItem(MobEnchantUtils.addRandomEnchantmentToItemStack(rand, itemStack, 20, true));
        }*/
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_ILLUSIONER_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ILLUSIONER_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_ILLUSIONER_HURT;
    }

    @Override
    protected SoundEvent getCastSpellSound() {
        return SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE;
    }

    @Override
    public SoundEvent getCelebratingSound() {
        return SoundEvents.ENTITY_ILLUSIONER_AMBIENT;
    }

    @Override
    public State getState() {
        if (this.isSpellcasting()) {
            return State.SPELLCASTING;
        } else {
            return State.CROSSED;
        }
    }

    class CastingSpellGoal extends SpellcastingIllagerEntity.LookAtTargetGoal {
        private CastingSpellGoal() {
            super();
        }

        @Override
        public void tick() {
            if (EnchanterEntity.this.isSpellcasting() && EnchanterEntity.this.getTarget() != null) {
                EnchanterEntity.this.getLookControl().lookAt(EnchanterEntity.this.getTarget(), (float) EnchanterEntity.this.getLookYawSpeed(), (float) EnchanterEntity.this.getLookPitchSpeed());
            } else if (EnchanterEntity.this.isSpellcasting() && EnchanterEntity.this.getTarget() != null) {
                EnchanterEntity.this.getLookControl().lookAt(EnchanterEntity.this.getTarget(), (float) EnchanterEntity.this.getLookYawSpeed(), (float) EnchanterEntity.this.getLookPitchSpeed());
            }
        }
    }


    public class SpellGoal extends SpellcastingIllagerEntity.CastSpellGoal {
        private final Predicate<LivingEntity> fillter = (entity) -> {
            return !(entity instanceof EnchanterEntity) && entity instanceof Monster/* && entity.getCapability(EnchantWithMob.MOB_ENCHANT_CAP).map(mob -> !mob.hasEnchant()).orElse(false)*/;
        };

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean shouldExecute() {
            if (EnchanterEntity.this.getTarget() == null) {
                return false;
            } else if (EnchanterEntity.this.isSpellcasting()) {
                return false;
            } else if (EnchanterEntity.this.age < this.startTime) {
                return false;
            } else {
                List<LivingEntity> list = EnchanterEntity.this.world.getEntitiesByClass(LivingEntity.class, EnchanterEntity.this.getBoundingBox().expand(16.0D, 4.0D, 16.0D), this.fillter);
                if (list.isEmpty()) {
                    return false;
                } else {
                    LivingEntity target = list.get(EnchanterEntity.this.random.nextInt(list.size()));
                    if (target != EnchanterEntity.this.getTarget()) {
                        EnchanterEntity.this.setEnchantTarget(list.get(EnchanterEntity.this.random.nextInt(list.size())));
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }

        /**
         * Returns whether an in-progress EntityAIBase should continue executing
         */
        public boolean shouldContinue() {
            return EnchanterEntity.this.getEnchantTarget() != null && EnchanterEntity.this.getEnchantTarget() != EnchanterEntity.this.getTarget() && this.spellCooldown > 0;
        }

        /**
         * Reset the task's internal state. Called when this task is interrupted by another one
         */
        public void stop() {
            super.stop();
            EnchanterEntity.this.setEnchantTarget(null);
        }

        protected void castSpell() {
            LivingEntity entity = EnchanterEntity.this.getEnchantTarget();
            if (entity != null && entity.isAlive()) {
                /*entity.getCapability(EnchantWithMob.MOB_ENCHANT_CAP).ifPresent(cap ->
                {
                    MobEnchantUtils.addRandomEnchantmentToEntity(entity, cap, entity.getRNG(), 12, false);
                });*/
            }
        }

        protected int getCastWarmupTime() {
            return 40;
        }

        @Override
        protected int getSpellTicks() {
            return 60;
        }

        @Override
        protected int startTimeDelay() {
            return 600;
        }

        @Override
        protected @Nullable SoundEvent getSoundPrepare() {
            return SoundEvents.ENTITY_ZOMBIE_VILLAGER_CONVERTED;
        }

        @Override
        protected Spell getSpell() {
            return Spell.WOLOLO;
        }
    }

    class AvoidTargetEntityGoal<T extends LivingEntity> extends net.minecraft.entity.ai.goal.FleeEntityGoal<T> {
        private final EnchanterEntity enchanter;

        public AvoidTargetEntityGoal(EnchanterEntity enchanterIn, Class<T> entityClassToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
            super(enchanterIn, entityClassToAvoidIn, avoidDistanceIn, farSpeedIn, nearSpeedIn);
            this.enchanter = enchanterIn;
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canStart() {
            if (super.canStart() && this.targetEntity == this.enchanter.getTarget()) {
                return this.enchanter.getTarget() != null;
            } else {
                return false;
            }
        }

        /**
         * Execute a one shot task or start executing a continuous task
         */
        public void start() {
            EnchanterEntity.this.setTarget(null);
            super.start();
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            EnchanterEntity.this.setTarget(null);
            super.tick();
        }
    }
}