import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int points = 0;

        while (true) {
            System.out.println("\nWelcome to the Number Guessing Game, " + name + "!");
            System.out.println("Guess a number between 1 and 100.");

            int randomNumber = (int) (Math.random() * 100) + 1;
            int numGuesses = 0;

            while (true) {
                int guess = scanner.nextInt();
                numGuesses++;

                if (guess < randomNumber) {
                    System.out.println("Too low. Guess again.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high. Guess again.");
                } else {
                    System.out.println("You got it! The number was " + randomNumber);
                    System.out.println("It took you " + numGuesses + " guesses.");

                    if (numGuesses == 1) {
                        points += 10;
                        System.out.println("You earned 10 points!");
                    } else if (numGuesses == 2) {
                        points += 5;
                        System.out.println("You earned 5 points!");
                    } else {
                        points += 2;
                        System.out.println("You earned 2 points!");
                    }

                    System.out.println("Total Points: " + points);

                    System.out.print("\nDo you want to play again? (yes or no): ");
                    String playAgain = scanner.next();
                    if (!playAgain.equalsIgnoreCase("yes")) {
                        System.out.println("\nThanks for playing, " + name + "!");
                        System.out.println("Your final score is " + points + " points.");
                        return;
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
