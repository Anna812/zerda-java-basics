package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Player {

    private String name;
    ArrayList<Card> played;

    public int sum() {
        int sum = 0;
        for (Card temp : played) {
            sum += temp.calculateValue();
        }
        return sum;
    }
}
