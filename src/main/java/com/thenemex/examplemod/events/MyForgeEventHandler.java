package com.thenemex.examplemod.events;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MyForgeEventHandler {

    private int nbItemsPicked = 0;

    /**
     * Count the number of items that has been picked up by the player
     */
    @SubscribeEvent
    public void pickupItem(PlayerEvent.ItemPickupEvent event) {
        this.nbItemsPicked += event.getStack().getCount();
        System.out.println("Number of items picked : " + this.nbItemsPicked);
    }
}
