package modules;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class Bot extends Player {
    BotDifficultyLevel botDifficultyLevel;

    //TODO(Ismail): Overwrite make move method here.

}
