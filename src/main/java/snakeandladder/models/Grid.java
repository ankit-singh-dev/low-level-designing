package snakeandladder.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import snakeandladder.enums.GridType;

@Setter
@Getter
@NoArgsConstructor
public abstract class Grid {

    private GridType gridType;

    private int startNo;

    private int endNo;

    protected Grid(GridType gridType, int startNo, int endNo) {
        this.gridType = gridType;
        this.startNo = startNo;
        this.endNo = endNo;
    }
}
