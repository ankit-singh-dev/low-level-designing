package snakeandladder.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import snakeandladder.enums.Color;

@Setter
@Getter
@NoArgsConstructor
public class Player {

    private String id;
    private String name;
    private boolean isWon;
    private Color color;
    private Grid grid;

    public Player(String id, String name, boolean isWon, Color color, Grid grid) {
        this.id = id;
        this.name = name;
        this.isWon = isWon;
        this.color = color;
        this.grid = grid;
    }
}
