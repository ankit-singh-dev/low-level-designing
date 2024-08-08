package tictactoe;

import tictactoe.models.Player;
import tictactoe.models.PlayerPiece;

public class Client {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        // create players
        Player player1 = new Player("player1", PlayerPiece.O);
        Player player2 = new Player("player2", PlayerPiece.X);

        // initialize the game
        ticTacToe.initializeGame(3, player1, player2);

        // start the game
        String res = ticTacToe.startTheGame();
        if(res.equalsIgnoreCase("tie")){
            System.out.println("Tie");
        }else{
            System.out.println(res + " player won");
        }

    }
}
