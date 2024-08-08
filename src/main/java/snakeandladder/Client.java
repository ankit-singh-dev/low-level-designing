package snakeandladder;

import snakeandladder.enums.Color;
import snakeandladder.enums.GridType;
import snakeandladder.models.*;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        // board size
        int size = 10;

        // create players
        Player player1 = new Player("1","player-1",false, Color.RED, new NumbersGrid(GridType.NUMBERS, 0, 0));
        Player player2 = new Player("2","player-2",false, Color.YELLOW, new NumbersGrid(GridType.NUMBERS, 0, 0));

        // create board
        Board board = new Board(10, player1, player2);

        // Ladders Grid
        Grid ladderGrid1 = new LadderGrid(GridType.LADDER, 4, 14);
        Grid ladderGrid2 = new LadderGrid(GridType.LADDER, 28, 84);
        Grid ladderGrid3 = new LadderGrid(GridType.LADDER, 80, 99);
        Grid ladderGrid4 = new LadderGrid(GridType.LADDER, 51, 67);
        List<Grid> ladderGrids = List.of(ladderGrid1, ladderGrid2, ladderGrid3, ladderGrid4);


        //Snake ladders
        Grid snakeGrid1 = new SnakeGrid(GridType.SNAKE, 87, 36);
        List<Grid> snakeGrids = List.of(snakeGrid1);

        // initialize boards with ladders grids and snake grids
        board.initializeBoards(ladderGrids, snakeGrids);

        String winnerPlayerName = board.playGame();

    }

}
