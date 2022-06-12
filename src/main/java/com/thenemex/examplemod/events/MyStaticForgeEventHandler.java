package com.thenemex.examplemod.events;

import net.minecraftforge.event.entity.player.ArrowNockEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MyStaticForgeEventHandler {

    @SubscribeEvent
    public static void arrowNocked(ArrowNockEvent event) {
        System.out.println("Arrow nocked !");
    }

    @SubscribeEvent
    public static void pickupItem(PlayerEvent.ItemPickupEvent event) {
        System.out.println("Item picked up !");
    }
}
