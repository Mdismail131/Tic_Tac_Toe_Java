package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.CellState;
import modules.Player;

public class RowWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int row = cell.getRow();
        for (int i = 0; i < board.getSize(); i++) {
            Cell currentCell = board.getBoard().get(row).get(i);
            if (currentCell.getCellState().equals(CellState.EMPTY) || !currentCell.getPlayer().equals(currentPlayer)) {
                return false;
            }
        }
        return true;
    }
}
