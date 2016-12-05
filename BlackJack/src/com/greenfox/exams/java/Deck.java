package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Deck {

    protected ArrayList<Card> cards;
    protected ArrayList<Card> used;

    public Deck() {
        cards = new ArrayList<>();
        used = new ArrayList<>();
        createNewDeck();
        Collections.shuffle(cards);
    }

    private void createNewDeck() {
        ArrayList<String> possibleValues = new ArrayList<>(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"));
        ArrayList<String> possibleColours = new ArrayList<>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));

        for (String colour : possibleColours) {
            for (String value : possibleValues) {
                cards.add(new Card(colour, value));
            }
        }
    }
}
