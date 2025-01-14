import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private Random random;
    private int targetNumber;

    public GuessTheNumberGame() {
        random = new Random();
        targetNumber = random.nextInt(100) + 1;
        System.out.println(targetNumber);
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame();
        game.startGame();
    }

    private void startGame() {
        // Biendenida al juego
        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");

        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer();

        boolean humanHasGuessedCorrectly = false;
        boolean computerHasGuessedCorrectly = false;

        while (!humanHasGuessedCorrectly && !computerHasGuessedCorrectly) {
            humanHasGuessedCorrectly = checkGuess(humanPlayer);
            if (!humanHasGuessedCorrectly) {
                computerHasGuessedCorrectly = checkGuess(computerPlayer);
            }
        }
    }

    private boolean checkGuess(Player player) {
        int guess = player.makeGuess();
        System.out.println(player.getName() + " adivina: " + guess);

        if (guess == targetNumber) {
            System.out.println("¡Felicidades! ¡Adivinaste el número!");
            return true;
        } else if (guess < targetNumber) {
            System.out.println("¡Demasiado bajo!");
        } else {
            System.out.println("¡Demasiado alto!");
        }
        return false;
    }

    public static class HumanPlayer extends Player {
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
}

