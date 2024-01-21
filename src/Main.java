import controller.GameController;
import controller.PlayerController;
import modules.BotDifficultyLevel;
import modules.Game;
import modules.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe game.!!");

        System.out.println("Let,s start PLaying..");

        System.out.println("How many player would be playing");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Size of board..");
        int dimension = sc.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 0; i<n;i++) {
            System.out.println("Please enter details of players.." + (i + 1 ) );
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Symbol : ");
            String symbol = sc.next();
            System.out.println("Is this player a Bot? (Y/N)");
            if (sc.next().equals("y")) {
                System.out.print("what is the lever of Bot? (E/M/H");
                String level = sc.next();
                BotDifficultyLevel botDifficultyLevel;
                switch (level) {
                    case "E" -> botDifficultyLevel = BotDifficultyLevel.EASY;
                    case "M" -> botDifficultyLevel = BotDifficultyLevel.MEDIUM;
                    default -> botDifficultyLevel = BotDifficultyLevel.HARD;
                }
                players.add(PlayerController.createBotPlayer(name, symbol.charAt(0), botDifficultyLevel));
            } else {
                players.add(PlayerController.createHumanPlayer(name, symbol.charAt(0)));
            }
        }

        Game game = GameController.initiateGame(dimension, players, List.of());

        game.board.print();

    }
}
