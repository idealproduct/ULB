package com.ideaxbohan.unchartedlandbeginning.item;

import com.ideaxbohan.unchartedlandbeginning.ULB;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.RegistryObject;

public class chaotic_sword extends ULB{
    public static final RegistryObject<Item> CHAOTIC_SWORD = ITEMS.register("chaotic_sword", () ->
            new ChaosSwordItem(
                    Tiers.NETHERITE,
                    45,
                    -2.4f,
                    new Item.Properties()
                            .stacksTo(1)
                            .durability(8888)
            )
    );
}
