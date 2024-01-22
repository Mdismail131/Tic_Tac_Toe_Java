package modules;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import strategies.botplaying.BotPlayingStrategy;
import strategies.botplaying.EasyBotPlayingStrategy;

@Setter
@Getter
@SuperBuilder
public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    //TODO(Ismail): Overwrite make move method here.
    @Override
    public Cell nextMove(Board board) {
        //TODO : Have a simple factory here
        //TODO : Don't Initialize this everytime
        botPlayingStrategy = new EasyBotPlayingStrategy();
        Cell cell = botPlayingStrategy.suggestMove(board);

        Cell boardCell = board.getBoard().get(cell.getRow()).get(cell.getCol());

        boardCell.setPlayer(this);
        boardCell.setCellState(CellState.OCCUPIED);
        return boardCell;
    }

}
