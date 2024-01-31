import java.util.Scanner;

public class HumanPlayer extends Player {
    private Scanner scanner;

    public HumanPlayer() {
        super("Humano");
        scanner = new Scanner(System.in);
    }

    @Override
    public int makeGuess() {
        System.out.println("________ PLAYER 1 ________________ ");
        System.out.println(" ingresa el numero: ");
        int guess = scanner.nextInt();
        guesses[guess] = guess;
        return guess;
    }
}