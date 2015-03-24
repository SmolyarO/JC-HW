package com.ostap.metro.card;


import java.util.Collection;
import java.util.HashSet;

public class CardRegistry {

    private Collection <CardType> cards = new HashSet<CardType>(64);

    private static CardRegistry instance = null;

    private CardRegistry() {}

    public  static CardRegistry getInstance() {
        if (instance == null) {
            instance = new CardRegistry();
        }
        return instance;
    }

    public int cardIdGenerate() {
        return 0;
    }

    public int turnstileIdGenerate () {
        return 0;
    }

    public int cashDeskIdGenerate () {
        return 0;
    }

    public void addCard (CardType card) {
        cards.add(card);
    }
    public boolean cardExistence(CardType card) {
        return cards.contains(card);
    }

}
