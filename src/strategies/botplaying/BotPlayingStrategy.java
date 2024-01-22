package strategies.botplaying;

import modules.Board;
import modules.Cell;
import modules.Move;

public interface BotPlayingStrategy {
   //TODO: Implement by getting player and Board.
    // Move decideMove()
    Cell suggestMove(Board board);
}
