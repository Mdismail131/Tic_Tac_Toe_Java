import modules.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Player player = new HumanPlayer();
        player.setPlayerType(PlayerType.HUMAN);

        Game game = new Game(3, List.of(player), List.of());

        game.board.print();
    }
}
