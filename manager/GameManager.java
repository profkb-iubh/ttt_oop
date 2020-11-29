package manager;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import elements.Player;
import ttt.TTTPlayer;

/**
 * GameManager is a helper class for initializing and printing stuff
 */
public class GameManager {
    /**
     * initialize the player names and return a list of Player
     * 
     * @param scan (scanner opened in main class)
     * @return a list of players in a Player[] array.
     */
    public static Player[] initializePlayers(Scanner scan) {
        Player[] players = new TTTPlayer[2];

        String player1 = "X";
        String player2 = "O";

        for (int i = 0; i < 2; ++i) {
            System.out.println("Please enter name of Player " + (i + 1) + ":");
            Player player = new TTTPlayer(scan.nextLine());
            if (i == 0)
                player.setSymbol(player1);
            else
                player.setSymbol(player2);
            players[i] = player;
        }
        System.out.println("Welcome " + players[0].getName() + "(" + players[0].getSymbol() + ")" + " and "
                + players[1].getName() + "(" + players[1].getSymbol() + ")");
        System.out.println("Have a great game!");
        return players;
    }

    /**
     * Records the outcome after a game is over
     * 
     * @param players list of players
     * @param winner  the winner object, which could be null in case of a draw
     * @return returns the updated player array
     */
    public static Player[] recordOutcome(Player[] players, Player winner) {
        if (winner != null) {
            System.out.println("The winner is " + winner.getName());
            for (int i = 0; i < players.length; ++i) {
                if (players[i].isEqual(winner)) {
                    players[i].addWin();
                } else {
                    players[i].addLoss();
                }
            }
        } else {
            System.out.println("It's a draw!");
            for (int i = 0; i < players.length; ++i) {
                players[i].addDraw();
            }
        }
        return players;
    }

    /**
     * Method to print a formatted scoreBoard
     * 
     * @param players
     */
    public static void scoreBoard(Player[] players) {
        // TO-DO please see instruction sheet on deliverable
    }
}
