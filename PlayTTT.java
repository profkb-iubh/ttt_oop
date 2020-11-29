
import java.util.Scanner;

import elements.*;
import manager.GameManager;
import ttt.*;

public class PlayTTT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player[] players = //TO-DO call the static initializePlayers(Scanner scan) method on the GameManager class
        Board board = new TTTBoard(9, players);
        boolean again = true;

        while (again) {
            Player winner = board.play();
            //TO-DO call the static recordOutcome(players, winner) method on the GameManager class
            System.out.println("Would you like another match? (Y/N)");
            String input = scan.nextLine();
            if (input.toUpperCase().equals("N"))
                again = false;
            board.reset();
        }
        GameManager.scoreBoard(players);
        scan.close();

    }
}
