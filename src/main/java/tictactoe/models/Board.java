package tictactoe.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Board {

    private int size;

    private String[][] boardGrids;

    public Board(int size) {
        this.size = size;
        this.boardGrids = new String[size][size];
    }

    public boolean makeMove(int row, int column, PlayerPiece value) {
        if (boardGrids[row][column] != null) {
            return false;
        }
        boardGrids[row][column] = value.toString();
        return true;
    }

    public boolean isSpaceAvailable() {
        for (String[] boardGrid : boardGrids) {
            for (String s : boardGrid) {
                if (s == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public String printBoards() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String[] boardGrid : boardGrids) {
            for (String s : boardGrid) {
                if(s == null){
                    stringBuilder.append("  |");
                }else{
                    stringBuilder.append(s + "|");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
