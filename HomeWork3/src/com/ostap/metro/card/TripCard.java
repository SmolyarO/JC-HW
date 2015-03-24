package com.ostap.metro.card;


public class TripCard extends CardType{
    int trips;

    public TripCard() {
        this.type = "trip";
        //this.cost = 7;
        this.trips = 0;
        CardRegistry registry = CardRegistry.getInstance();
        this.id = registry.cardIdGenerate();
    }


}
