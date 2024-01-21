package controller;

import modules.*;

public class PlayerController {

    public static Player createHumanPlayer(String name,char symbol ) {
        assert(!name.isEmpty());

        return HumanPlayer.builder()
                .age(12).playerType(PlayerType.HUMAN)
                .name(name)
                .symbol(symbol)
                .build();
    }

    public static Player createBotPlayer(String name, char symbol, BotDifficultyLevel botDifficultyLevel) {
        assert (!name.isEmpty());

        return Bot.builder()
                .name(name)
                .symbol(symbol)
                .playerType(PlayerType.BOT)
                .botDifficultyLevel(botDifficultyLevel)
                .build();
    }
    private PlayerController(){}
}
