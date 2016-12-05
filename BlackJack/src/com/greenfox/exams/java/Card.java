package com.greenfox.exams.java;

/**
 * Created by Anna812 on 12/5/2016.
 */
public class Card {
    private String color, value;

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s %s", color, value);
    }

    public int calculateValue() {
        int returnValue = 0;
        switch (value) {
            case "1":
                returnValue = 1;
                break;
            case "2":
                returnValue = 2;
                break;
            case "3":
                returnValue = 3;
                break;
            case "4":
                returnValue = 4;
                break;
            case "5":
                returnValue = 5;
                break;
            case "6":
                returnValue = 6;
                break;
            case "7":
                returnValue = 7;
                break;
            case "8":
                returnValue = 8;
                break;
            case "9":
                returnValue = 9;
                break;
            case "10":
                returnValue = 10;
                break;
            case "Ace":
                returnValue = 1;
                break;
            case "Jack":
                returnValue = 10;
                break;
            case "Queen":
                returnValue = 10;
                break;
            case "King":
                returnValue = 10;
                break;
            default:
                System.out.println("Something went wrong while calculating value of Card");
        }
        return returnValue;
    }
}
