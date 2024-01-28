package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.Player;

import java.util.HashMap;

public class DiagWinningStrategy implements WinningStrategy {

    private final HashMap<Player, Integer> diagonalCount = new HashMap<>();

    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int row = cell.getRow();
        int col = cell.getCol();

        if (!diagonalCount.containsKey(currentPlayer)) {
            diagonalCount.put(currentPlayer, 0);
        }

        // Check main diagonal
        if (row == col) {
            int count = diagonalCount.get(currentPlayer);
            diagonalCount.put(currentPlayer, count + 1);
            if (count + 1 == board.getSize()) {
                System.out.println("Diag winning Strategy");
                return true;
            }
        }

        // Check reverse diagonal
//        if (row + col == board.getSize() ) {
//            int count = diagonalCount.get(currentPlayer);
//            diagonalCount.put(currentPlayer, count + 1);
//            if (count + 1 == board.getSize()) {
//                System.out.println("Diag winning Strategy");
//                return true;
//            }
//        }

        return false;
    }
}
