package modules;

import exceptions.CellAlreadyOccupiedException;
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

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", symbol=" + symbol +
                ", id=" + id +
                ", playerType=" + playerType +
                '}';
    }

    //Todo(Ismail): Add a method to make a move.
    public abstract Cell nextMove(Board board) throws CellAlreadyOccupiedException;
}
