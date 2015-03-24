package com.ostap.metro.card;


public class TimeCard extends CardType {
    int lifetime;

    public TimeCard(int lifetime) {
        this.type = "time";
        this.lifetime = lifetime;
        //this.cost = 50;
    }
}
