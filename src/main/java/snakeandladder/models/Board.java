package snakeandladder.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import snakeandladder.enums.GridType;

import java.util.*;
import java.util.stream.Collectors;

@Setter
@Getter
@NoArgsConstructor
public class Board {

    private Grid[][] grids;

    private Deque<Player> playersQueue;

    public Board(int size, Player... players) {
        this.grids = new Grid[size][size];
        playersQueue = new ArrayDeque<>();
        for (Player p : players) {
            playersQueue.offer(p);
        }
    }

    public void initializeBoards(List<Grid> ladderGrids, List<Grid> snakeGrids) {
        Map<Integer, Integer> ladderStartEnds = ladderGrids.stream().collect(Collectors.toMap(Grid::getStartNo, Grid::getEndNo));
        Map<Integer, Integer> snakeStartEnds = snakeGrids.stream().collect(Collectors.toMap(Grid::getStartNo, Grid::getEndNo));

        int index = 1;
        // populate grid of snake and ladder boards
        int gridNo = 1;
        for (int row = grids.length - 1; row >= 0; row--) {
            if(index % 2 == 1) {
                for (int column = 0; column < grids[row].length; column++) {
                    if (grids[row][column] == null) {
                        grids[row][column] = new NumbersGrid(GridType.NUMBERS, gridNo++, 0);
                    }
                }
            }else{
                for (int column = grids[row].length; column >= 0; column--) {
                    if (grids[row][column] == null) {
                        grids[row][column] = new NumbersGrid(GridType.NUMBERS, gridNo++, 0);
                    }
                }
            }
            index++;
        }
    }

    public String playGame() {
        Scanner sc = new Scanner(System.in);
        boolean isWinner = true;
        while (isWinner) {

            Player playerTurn = playersQueue.pollFirst();
            System.out.println("player " + playerTurn.getName() + "roll the rice");
            String res = sc.nextLine();
            if (res.equalsIgnoreCase("yes")) {
                int diceValue = rollTheDice();
                Grid currentGrid = playerTurn.getGrid();
                /*
                int[][] currentGridRowCol = currentGrid.getSourceRowCol();
                int rowValue = currentGridRowCol[0][0];
                int columnValue = currentGridRowCol[1][0];

                if ((columnValue + diceValue) < grids[currentGridRowCol[0][0]].length) {
                    currentGridRowCol = new int[rowValue][columnValue + diceValue];
                }

                 */
            } else if (res.equalsIgnoreCase("pass")) {

            } else {
                throw new RuntimeException("Invalid option");
            }

        }
        return null;
    }

    private int rollTheDice() {
        return 1;
    }
}
