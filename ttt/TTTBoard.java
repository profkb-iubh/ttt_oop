package ttt;

import java.util.Scanner;
import elements.Board;
import elements.Player;

public class TTTBoard extends Board {

    private Player[] players;

    public TTTBoard() {
        super();
    }

    public TTTBoard(int fields, Player[] players) {
        // TO-DO initialize the board in the superclass (set the length of array)
        initialize(fields);
        this.players = players;
    }

    /**
     * Initialize the board with numbers 1-9
     * 
     * @param fields
     */
    private void initialize(int fields) {
        // TO-DO initializes the board with values from 1-9 (see SingleClassTTT)
        // Use the methods defined in the superclass to do so
    }

    @Override
    public void reset() {
        initialize(getLength());
    }

    @Override
    public void printBoard() {
        // TO-DO see method with same name in SingleClassTTT, but adjust
        // remember you do not have access to String[] board but you have
        // methods defined in the superclass
    }

    @Override
    public Player play() {
        printBoard();
        Scanner scan = new Scanner(System.in);
        String currentPlayer = players[0].getSymbol();
        String player1 = players[0].getSymbol();
        String player2 = players[1].getSymbol();
        Player winner = null;
        boolean turn = true;
        int index = 0;

        while (turn) {
            // TO-DO follow the same logic as in the SingleClassTTT but adjust
        }
        return winner;
    }

    private Player determineWinner() {
        String[] line = getLines();
        String winner1 = "XXX";
        String winner2 = "OOO";

        for (String s : line) {
            if (s.equals(winner1)) {
                return players[0];
            } else if (s.equals(winner2)) {
                return players[1];
            }
        }
        return null;
    }

    private boolean slotsAvailable() {
        boolean hasSlots = false;

        // TO-DO follow code but recall there is a boardContains(x) method in super. Use
        // it.
        return hasSlots;
    }

    private String[] getLines() {
        String[] line = new String[8];
        line[0] = get(0) + get(1) + get(2);
        line[1] = get(3) + get(4) + get(5);
        line[2] = get(6) + get(7) + get(8);
        line[3] = get(0) + get(3) + get(6);
        line[4] = get(1) + get(4) + get(7);
        line[5] = get(2) + get(5) + get(8);
        line[6] = get(0) + get(4) + get(8);
        line[7] = get(2) + get(4) + get(6);
        return line;
    }
}
