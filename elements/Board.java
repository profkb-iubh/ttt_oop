package elements;

import java.util.Arrays;

/**
 * Board: A Board is an abstracted String array. It provides methods to
 * implement access to elements of the array. The board implements Playable,
 * i.e. the board is a playable entity that must implement the play() method.
 */
public class Board implements Playable {
    /**
     * The private String array
     */
    private String[] board;

    public Board() {
    }

    /**
     * Constructor to initialize the String array
     * 
     * @param fields length of array
     */
    public Board(int fields) {
        // TO-DO initialize the board arra
    }

    /**
     * reset the board
     */
    public void reset() {
    }

    /**
     * print the board
     */
    public void printBoard() {
    }

    /**
     * get element from array for a key
     * 
     * @param key location in array
     * @return element of type String
     */
    public String get(int key) {
        // TO-DO return the element from the board array for key
    }

    /**
     * put a value at a specific location/key
     * 
     * @param key
     * @param value
     */
    public void put(int key, String value) {
        // TO-DO put the value at position key into the board array
    }

    /**
     * length of the board
     * 
     * @return
     */
    public int getLength() {
        // TO-TO return the length of the board array
    }

    /**
     * checks if the board is initialized and has elements
     * 
     * @return boolean
     */
    public boolean hasElements() {
        if (board.length > 0)
            return true;
        return false;
    }

    /**
     * checks if the board contains a String x
     * 
     * @param x
     * @return
     */
    public boolean boardContains(String x) {
        // TO-DO check if the board contains the string x
    }

    /**
     * the play method from Playable
     */
    @Override
    public Player play() {
        return null;
    }

}