package com.ideaxbohan.unchartedlandbeginning.event;

import com.ideaxbohan.unchartedlandbeginning.item.ChaosSwordItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEventHandlers {

    // 當玩家揮動時觸發粒子效果
    @SubscribeEvent
    public static void onPlayerSwing(PlayerInteractEvent.LeftClickEmpty event) {
        Player player = event.getEntity();
        ItemStack stack = player.getMainHandItem();

        // 處理揮劍時發射粒子
        if (stack.getItem() instanceof ChaosSwordItem chaosSword) {
            chaosSword.customOnSwing(player);
        }
    }
}
