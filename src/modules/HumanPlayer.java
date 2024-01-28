package modules;

import exceptions.CellAlreadyOccupiedException;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.experimental.SuperBuilder;
import org.codehaus.groovy.ast.stmt.ContinueStatement;

import java.util.Scanner;

@Setter
@Getter
@SuperBuilder
public class HumanPlayer extends Player{
    private int rank;
    private int age;

    @SneakyThrows
    @Override
    public Cell nextMove(Board board) throws CellAlreadyOccupiedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the row:");
        int row = sc.nextInt();
        System.out.println("please enter the col:");
        int col = sc.nextInt();

        if(row < 0 || row >= board.getSize() && col < 0 || col >= board.getSize() || !board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
            throw new CellAlreadyOccupiedException();
        }

        Cell cell = board.getBoard().get(row).get(col);
        cell.setPlayer(this);
        cell.setCellState(CellState.OCCUPIED);

        return cell;
    }
}
