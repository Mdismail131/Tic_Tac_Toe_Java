package modules;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public abstract class Player {
    private String name;
    private char symbol;
    private int id;
    private PlayerType playerType;

    //Todo(Ismail): Add a method to make a move.
    public abstract Cell nextMove(Board board);
}
