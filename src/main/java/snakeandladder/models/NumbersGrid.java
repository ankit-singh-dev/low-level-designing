package snakeandladder.models;

import lombok.Getter;
import lombok.Setter;
import snakeandladder.enums.GridType;

@Getter
@Setter
public class NumbersGrid extends Grid {

    public NumbersGrid(GridType gridType, int startNo, int endNo){
        super(gridType, startNo, endNo);
    }

}
