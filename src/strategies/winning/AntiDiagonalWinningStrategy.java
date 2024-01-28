package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.CellState;
import modules.Player;

public class AntiDiagonalWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();
        char symbol = currentPlayer.getSymbol();

        int i = 0, j = board.getSize() - 1;

        while(i < board.getSize() && j >= 0) {
            Cell currentCell = board.getBoard().get(j).get(i);
            if((currentCell.getCellState() == CellState.EMPTY
                    || currentCell.getPlayer().getSymbol() != symbol)) {
                return false;
            }
            i++;
            j--;
        }
//        for(int k = 0; k < board.getSize(); k++) {
//            Cell current = board.getBoard().get(k).get(j);
//            if((current.getCellState() == CellState.EMPTY
//                    || current.getPlayer().getSymbol() != symbol)) {
//                return false;
//            }
//            j--;
//        }
        return true;
    }
}
