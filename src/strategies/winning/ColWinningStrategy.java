package strategies.winning;

import modules.Board;
import modules.Cell;
import modules.Player;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{

    private final HashMap<Player, HashMap<Integer, Integer>> cn = new HashMap<>();
    @Override
    public boolean checkWin(Cell cell, Board board) {
        Player currentPlayer = cell.getPlayer();

        int col = cell.getCol();
        if (!cn.containsKey(currentPlayer)) {
            cn.put(currentPlayer, new HashMap<>());
        }
        if (!cn.get(currentPlayer).containsKey(col)) {
            cn.get(currentPlayer).put(col, 0);
        }
        int cnt = cn.get(currentPlayer).get(col);
        cn.get(currentPlayer).put(col, cnt + 1);

        System.out.println("Col winning Strategy");
        return cnt + 1 == board.getSize();
    }
}
