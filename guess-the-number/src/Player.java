public abstract class Player {
    private String name;
    protected int[] guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new int[100]; // Assuming maximum 100 guesses
    }

    public abstract int makeGuess();

    public String getName() {
        return name;
    }

    public int[] getGuesses() {
        return guesses;
    }
}