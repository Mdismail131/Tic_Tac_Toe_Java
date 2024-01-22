package modules;

import lombok.Getter;
import lombok.Setter;
import strategies.winning.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Game {
    public Board board;
    private List<Player> players;
    private List<Move> moves;
    private int nextPLayerIndex;
    private GameState gameState;
    private Player winner;
    private List<WinningStrategy> winningStrategies;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.nextPLayerIndex = 0;
        this.gameState = GameState.INIT;
    }
}
