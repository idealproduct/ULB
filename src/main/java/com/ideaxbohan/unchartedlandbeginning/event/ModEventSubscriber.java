package com.ideaxbohan.unchartedlandbeginning.event;

import net.minecraftforge.common.MinecraftForge;

public class ModEventSubscriber {

    // 註冊事件處理器
    public static void register() {
        // 註冊事件
        MinecraftForge.EVENT_BUS.addListener(ModEventHandlers::onPlayerSwing);
    }
}
