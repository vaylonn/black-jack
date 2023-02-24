import java.util.Random;
//Create a class for the Deck object
public class Deck {
    //Create an array to hold the 52 cards
    Card[] deck = new Card[52];

    //Create a constructor to create a Deck object
    public Deck() {
        //Create a string array to hold the suits
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        //Create a string array to hold the face values
        String[] faceValues = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        //Loop through the suits and face values to create the 52 cards
        int index = 0;
        for (String suit : suits) {
            for (int i = 0; i < faceValues.length; i++) {
                deck[index] = new Card(suit, faceValues[i], i + 1);
                index++;
            }
        }
    }

    //Create a method to draw a card from the deck
    public Card drawCard() {
        //Randomly choose a card to draw
        Random random = new Random();
        int index = random.nextInt(deck.length);

        //Return the card
        return deck[index];
    }
}