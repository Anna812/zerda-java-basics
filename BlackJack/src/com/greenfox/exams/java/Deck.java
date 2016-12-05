package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Deck {

    ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        createNewDeck();
    }

    private void createNewDeck() {
        ArrayList<String> possibleValues = new ArrayList<>(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King"));
        ArrayList<String> possibleColours = new ArrayList<>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));

        for (String colour : possibleColours) {
            for (String value : possibleValues) {
                new Card(colour, value);
            }
        }
    }
}
