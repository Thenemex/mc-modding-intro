package com.thenemex.examplemod.events;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * Class that is responsible for counting items picked up by the player
 * @author Thenemex
 */
public class ItemPickupEventHandler {

    private int nbItemsPicked;

    /**
     * Default constructor for the event handler
     */
    public ItemPickupEventHandler() {
        this.nbItemsPicked = 0;
    }

    /**
     * Constructor with custom value
     * @param initialValue The initial value for the counter
     */
    public ItemPickupEventHandler(int initialValue) {
        this.nbItemsPicked = initialValue;
    }

    /**
     * Getter for the number of items picked up
     * @return The number of items picked up by the player
     */
    public int getNbItemsPicked() {
        return this.nbItemsPicked;
    }

    /**
     * Detect whenever the player pick up items and increases the counter
     * @param event The event probed
     */
    @SubscribeEvent
    public void pickupItem(PlayerEvent.ItemPickupEvent event) {
        this.nbItemsPicked += event.getStack().getCount();
        System.out.println("Number of items picked : " + this.getNbItemsPicked());
    }
}
