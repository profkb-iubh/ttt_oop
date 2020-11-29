package elements;

public class Player {
    private String name;
    private int wins = 0;
    private int draws = 0;
    private int losses = 0;
    private String symbol;

    /**
     * default no-args constructor
     */
    public Player() {
    }

    /**
     * constructor that sets the name of the player
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * name accessor
     */
    public String getName() {
        return name;
    }

    /**
     * wins accessor
     */
    public int getWins() {
        return wins;
    }

    /**
     * draws accessor
     */
    public int getDraws() {
        return draws;
    }

    /**
     * losses accessor
     */
    public int getLosses() {
        return losses;
    }

    /**
     * symbol accessor
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * symbol mutator
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * win incrementor
     */
    public void addWin() {
        // TO-DO add 1 to the win variable
    }

    /**
     * draw incrementor
     */
    public void addDraw() {
        // TO-DO add 1 to the draw variable
    }

    /**
     * loss incrementor
     */
    public void addLoss() {
        // TO-DO add 1 to the loss variable
    }

    /**
     * isEqual method to return true if player input equals player of this object
     */
    public boolean isEqual(Player player) {
        // TO-DO return true if this player is equal to the input variable player
    }

}
