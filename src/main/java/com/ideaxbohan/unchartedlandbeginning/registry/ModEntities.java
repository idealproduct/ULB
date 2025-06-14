package com.ideaxbohan.unchartedlandbeginning.registry;

import com.ideaxbohan.unchartedlandbeginning.ULB;
import com.ideaxbohan.unchartedlandbeginning.entity.MyCustomMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ULB.MODID);

    public static final RegistryObject<EntityType<MyCustomMob>> MY_CUSTOM_MOB =
            ENTITY_TYPES.register("gay",
                    () -> EntityType.Builder.of(MyCustomMob::new, MobCategory.MONSTER)
                            .sized(0.6F, 1.8F)
                            .build(ULB.MODID + "gay"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
