package Task1;

import java.util.Scanner;
import java.util.Random;

public class GuessRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int NumberToGuess = rand.nextInt(100) + 1;
        int guess;
        int NumberOfGuesses = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected the number between 1 to 100.Try to guess it.");
        do {
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            NumberOfGuesses++;
            if (guess < NumberToGuess) {
                System.out.println("Too low!Try again");
            } else if (guess > NumberToGuess) {
                System.out.println("Too high!Try again");
            } else {
                System.out.println("Congratulations!You guessed the number in " + NumberOfGuesses + " " + "attemps");
            }
        } while (guess != NumberToGuess);
    }
}
