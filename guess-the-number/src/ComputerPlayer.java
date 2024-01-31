import java.util.Random;

public class ComputerPlayer extends Player {
    private Random random;
    public ComputerPlayer() {
        super("Computadora");
        random = new Random();
    }

    @Override
    public int makeGuess() {
        System.out.println("________ PLAYER 2 ________________ ");
        int guess = random.nextInt(100) + 1; // Genera una suposición aleatoria entre 1 y 100
        // System.out.println(" ingresa el numero: "+ guess);
        guesses[guess] = guess;
        return guess;
    }
}
