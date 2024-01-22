package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.CellState;
import modules.Player;

public class ColWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int col = cell.getCol();
        for (int i = 0; i < board.getSize(); i++) {
            Cell currentCell = board.getBoard().get(i).get(col);
            if (currentCell.getCellState().equals(CellState.EMPTY) || !currentCell.getPlayer().equals(currentPlayer)) {
                return false;
            }
        }
        return true;
    }
}
