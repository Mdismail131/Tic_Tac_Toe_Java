package modules;

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
    public Cell nextMove(Board board) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        Cell cell = null;

        while (true) {
            try {
                System.out.println("please enter the row:");
                row = sc.nextInt();
                System.out.println("please enter the col:");
                col = sc.nextInt();

                if (!board.getBoard().get(row).get(col).getCellState().equals(CellState.EMPTY)) {
                    throw new IllegalAccessException("Cells not empty");
                }

                cell = board.getBoard().get(row).get(col);
                cell.setPlayer(this);
                cell.setCellState(CellState.OCCUPIED);

                break; // Break out of the loop if the input is valid
            } catch (IllegalAccessException e) {
                System.out.println("Invalid move! Try again.");
            }
        }

        return cell;
    }
}
