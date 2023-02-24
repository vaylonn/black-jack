//This game has been created by @vaylonn in 2023

//Create a main class to run the game
public class Main {
    public static void main(String[] args) {
        //Create a Player object for the player
        Player player = new Player();

        //Create a Player object for the dealer
        Player dealer = new Player();

        //Create a Game object
        Game game = new Game(player, dealer);

        //Start the game
        game.startGame();
    }
}
