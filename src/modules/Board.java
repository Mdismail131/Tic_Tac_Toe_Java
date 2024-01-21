package modules;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        createBoard();
    }

    private void createBoard() {
        this.board = new ArrayList<>();
        for (int i = 0; i < this.size; i++) {
            board.add(new ArrayList<>());
            for (int j = 0; j < this.size; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.print("|\t");
            for (int j = 0; j < this.size; j++) {
                if(this.board.get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    System.out.print("\t|\t");
                } else {
                    System.out.print(this.board.get(i).get(j).getPlayer().getSymbol() + "\t|\t");
                }
            }
            System.out.println();
        }
    }
}
