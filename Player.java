//Create a class for the Player object
import java.util.Scanner;
import java.util.ArrayList;
public class Player {
    //Create private properties for the player's hand and score
    private ArrayList<Card> hand;
    private int score;

    //Create a constructor to create a Player object
    public Player() {
        this.hand = new ArrayList<Card>();
        this.score = 0;
    }

    //Create a method to add a card to the player's hand
    public void addCardToHand(Card card) {
        hand.add(card);
        score += card.getNumValue();
    }

    //Create a getter method for the player's hand
    public ArrayList<Card> getHand() {
        return hand;
    }

    //Create a getter method for the player's score
    public int getScore() {
        return score;
    }
}