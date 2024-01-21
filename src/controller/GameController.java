package controller;

import modules.Game;
import modules.Player;
import strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public static Game initiateGame(int dimension,
                                    List<Player> players,
                                    List<WinningStrategy> winningStrategies) {

        return new Game(dimension, players, winningStrategies);
    }
}
