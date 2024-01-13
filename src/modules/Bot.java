package modules;

public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel;

    //TODO(Ismail): Overwrite make move method here.

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
