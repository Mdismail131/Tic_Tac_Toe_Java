package strategies.winning;

import modules.Board;
import modules.Cell;

public interface WinningStrategy {
    boolean checkWin(Cell cell, Board board);
}
