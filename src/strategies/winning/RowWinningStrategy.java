package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.CellState;
import modules.Player;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy{
    private final HashMap<Player, HashMap<Integer, Integer>> cn = new HashMap<>();
    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int row = cell.getRow();
        if(!cn.containsKey(currentPlayer)) {
            cn.put(currentPlayer, new HashMap<>());
        }
        if (!cn.get(currentPlayer).containsKey(row)){
            cn.get(currentPlayer).put(row, 0);
        }
        int cnt = cn.get(currentPlayer).get(row);
        cn.get(currentPlayer).put(row, cnt + 1);
        System.out.println("Row  winning Strategy");
        return cnt + 1 == board.getSize();
    }
}
