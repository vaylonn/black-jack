//Create a class for the Game object
import java.util.Scanner;
import java.util.ArrayList;
public class Game {
    //Create private properties for the player and the dealer
    private Player player;
    private Player dealer;

    //Create a constructor to create a Game object
    public Game(Player player, Player dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    //Create a method to start the game
    public void startGame() {
        //Create a new Deck object
        Deck deck = new Deck();

        //Deal two cards to the player and the dealer
        player.addCardToHand(deck.drawCard());
        player.addCardToHand(deck.drawCard());
        dealer.addCardToHand(deck.drawCard());
        dealer.addCardToHand(deck.drawCard());

        //Show the player their cards
        System.out.println("Your cards: \n");
        for (Card card : player.getHand()) {
            System.out.println(card.getFaceValue() + " of " + card.getSuit());
        }

        //Loop until the player stands or busts
        while (true) {
            //Get input from the player
            System.out.println("\nHit or stand? (h/s):");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("h")) {
                //Deal another card to the player
                player.addCardToHand(deck.drawCard());

                //Show the player their cards
                System.out.println("\nYour cards: \n");
                for (Card card : player.getHand()) {
                    System.out.println(card.getFaceValue() + " of " + card.getSuit());
                }

                //Check if the player has busted
                if (player.getScore() > 21) {
                    System.out.println("\nBust!\n");
                    break;
                }
            } else if (input.equals("s")) {
                //End the loop
                break;
            }
        }

        //Transition for player to dealer
        System.out.println("\n-----");
        System.out.println("It's now the Dealer's turn !");
        System.out.println("-----\n");

        //Show the dealer's cards
        System.out.println("\nDealer's cards: \n");
        for (Card card : dealer.getHand()) {
            System.out.println(card.getFaceValue() + " of " + card.getSuit());
        }

        //Loop until the dealer stands or busts
        while (true) {
            //Check if the dealer has bust
            if (dealer.getScore() > 21) {
                System.out.println("\nDealer busts!");
                break;
            }

            //Check if the dealer has at least 17 points
            if (dealer.getScore() >= 17) {
                //End the loop.
                break;
            }

            //Deal another card to the dealer
            dealer.addCardToHand(deck.drawCard());

            //Show the dealer's cards
            System.out.println("\nDealer's cards: \n");
            for (Card card : dealer.getHand()) {
                System.out.println(card.getFaceValue() + " of " + card.getSuit());
            }
        }

        //Calculate the winner
        if (player.getScore() > 21) {
            //The player has busted so the dealer wins
            System.out.println("\nThe dealer wins!");
        } else if (dealer.getScore() > 21) {
            //The dealer has busted so the player wins
            System.out.println("\nYou win!");
        } else {
            //Compare the scores
            if (player.getScore() > dealer.getScore()) {
                //The player has the higher score so the player wins
                System.out.println("\nYou win!");
            } else if (player.getScore() < dealer.getScore()) {
                //The dealer has the higher score so the dealer wins
                System.out.println("\nThe dealer wins!");
            } else {
                //The scores are equal so it's a tie
                System.out.println("\nIt's a tie!");
            }
        }
    }
}

