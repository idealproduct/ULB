package com.ideaxbohan.unchartedlandbeginning.item;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class ChaosSwordItem extends SwordItem {

    public ChaosSwordItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    // 揮動時發射粒子
    public void customOnSwing(Player player) {
        Level level = player.level;

        if (!level.isClientSide() && level instanceof ServerLevel serverLevel) {
            double x = player.getX();
            double y = player.getY() + player.getEyeHeight();
            double z = player.getZ();

            // 發射粒子
            for (int i = 0; i < 10; i++) {
                double offsetX = level.random.nextGaussian() * 0.1;
                double offsetY = 0.5 + level.random.nextDouble() * 0.5;
                double offsetZ = level.random.nextGaussian() * 0.1;

                serverLevel.sendParticles(
                        ParticleTypes.SONIC_BOOM, // 粒子類型
                        x, y, z,                 // 發射位置
                        1,                       // 粒子數量
                        offsetX, offsetY, offsetZ, 0.1 // 偏移與速度
                );
            }

            // 播放音效
            level.playSound(null, player.blockPosition(),
                    SoundEvents.WARDEN_SONIC_BOOM,
                    SoundSource.PLAYERS,
                    1.0f, 1.0f);
        }
    }
}
