package modules;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Cell {
    private int row,col;
    private CellState cellState;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = CellState.EMPTY;
    }
}
