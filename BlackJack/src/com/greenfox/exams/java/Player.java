package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Player {

    private String name;
    protected ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        played = new ArrayList<>();
    }

    public int sum() {
        int sum = 0;
        for (Card temp : played) {
            sum += temp.calculateValue();
        }
        return sum;
    }

    public Card drawCard(Deck deck, int numOfDraws) {
        Card drawnCard = deck.cards.get(numOfDraws);
        played.add(drawnCard);
        deck.used.add(drawnCard);
        sum();
        return drawnCard;
    }
}
