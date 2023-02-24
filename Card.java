//This game has been created by @vaylonn in 2023

import java.util.Random;
//First, create a class for a Card object
public class Card {
    //Create private properties for suit, face value, and numerical value
    private String Suit;
    private String FaceValue;
    private int NumValue;

    //Create a constructor to create a Card object
    public Card(String suit, String faceValue, int numValue) {
        this.Suit = suit;
        this.FaceValue = faceValue;
        this.NumValue = numValue;
    }

    //Create getter methods for the private properties
    public String getSuit() {
        return Suit;
    }

    public String getFaceValue() {
        return FaceValue;
    }

    public int getNumValue() {
        return NumValue;
    }
}







