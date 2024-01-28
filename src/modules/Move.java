package modules;

import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Constructor;

@Setter
@Getter
public class Move {
    private Cell cells;
    private Player player;

    public Move(Cell cell, Player player) {
        this.cells = cell;
        this.player = player;
    }

    @Override
    public String toString() {
        return "Move{" +
                "cells=" + cells +
                ", player=" + player +
                '}';
    }
}
