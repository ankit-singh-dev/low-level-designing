package tictactoe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tictactoe.models.Board;
import tictactoe.models.Player;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

@Setter
@Getter
@NoArgsConstructor
public class TicTacToe {

    private Board board;

    private Deque<Player> gamePlayers;

    public void initializeGame(int boradSize, Player... players) {
        board = new Board(boradSize);
        gamePlayers = new ArrayDeque<>();

        for (Player player : players) {
            gamePlayers.offer(player);
        }
    }

    public String startTheGame() {
        Scanner scanner = new Scanner(System.in);
        boolean isWon = true;
        while (isWon) {
            Player playerTurn = getGamePlayers().pollFirst();
            String board = getBoard().printBoards();
            System.out.println(board);
            System.out.println("Player " + playerTurn.getPlayerName() + " Plase make your move");
            String playerMove = scanner.nextLine();
            String[] playerCoordinates = playerMove.split(",");
            int row = Integer.parseInt(playerCoordinates[0]);
            int column = Integer.parseInt(playerCoordinates[1]);
            boolean isMoveUpdated = this.getBoard().makeMove(row, column, playerTurn.getPlayerPiece());
            if (!isMoveUpdated) {
                System.out.println("Invalid move please choose blank spaces");
                getGamePlayers().offerFirst(playerTurn);
                continue;
            }

            if(!checkForTie()){
                return "Tie";
            }

            getGamePlayers().offerLast(playerTurn);

            boolean iswinner = checkForWinner(row, column, playerTurn);
            if (iswinner) {
                System.out.println("Player " + playerTurn.getPlayerName() + " Won");
                isWon = false;
                break;
            }
        }
        return "";
    }

    private boolean checkForTie(){
        return getBoard().isSpaceAvailable();
    }

    private boolean checkForWinner(int row, int column, Player playerTurn) {
        Board currentBoard = getBoard();
        String[][] boardGrids = currentBoard.getBoardGrids();

        boolean isRow = true;
        boolean isColumn = true;
        boolean isDiagonal = true;
        boolean isAntiDiagonal = true;

        // check row Wise
        for (int i = 0; i < boardGrids.length; i++) {
            if(boardGrids[row][i] == null || !boardGrids[row][i].equals(playerTurn.getPlayerPiece().toString())){
                isRow = false;
                break;
            }
        }

        // check column Wise
        for (int i = 0; i < boardGrids.length; i++) {
            if (boardGrids[i][column] == null || !boardGrids[i][column].equals(playerTurn.getPlayerPiece().toString())) {
                isColumn = false;
                break;
            }
        }

        // check diagonal Wise
        for (int i = 0; i < boardGrids.length; i++) {
            if (boardGrids[i][i] == null || !boardGrids[i][i].equals(playerTurn.getPlayerPiece().toString())) {
                isDiagonal = false;
                break;
            }
        }

        // check antidiagonal Wise
        for (int i = boardGrids.length-1,j=0; i >= 0; i--,j++) {
            if (boardGrids[i][j] == null || !boardGrids[i][j].equals(playerTurn.getPlayerPiece().toString())) {
                isAntiDiagonal = false;
                break;
            }
        }

        return isRow || isColumn || isDiagonal || isAntiDiagonal;
    }
}
