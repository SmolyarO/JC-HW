package com.ostap.runner;
import com.ostap.metro.card.CardRegistry;
import com.ostap.metro.card.CardType;
import com.ostap.metro.card.TripCard;
import com.ostap.metro.station.CashDesk;
import com.ostap.metro.station.Turnstile;


public class Main {

    CardRegistry registry = CardRegistry.getInstance();
    Turnstile pecherska = new Turnstile();
    //CashDesk cashPechersk = new CashDesk();
    //CardType tCard = cashPechersk.newCard();
    TripCard tCardOne = new TripCard();
}
