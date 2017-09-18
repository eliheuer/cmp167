import java.util.Random;
import java.util.Scanner;

/**
 * Eli Heuer, Week 3 -- Exercise 8
 * Brief: The goal of this exercise is to program a “Guess My Number” game.
 */

public class GuessMyNumber {

    public static void main(String[] args) {

        // Setup.
        Scanner in = new Scanner(System.in);

        // Pick a random number.
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // Start guessing CLI.
        System.out.println("I'm thinking of a number between 1 and 100"); delay(1000);
        System.out.println("Can you guess what it is?"); delay(1000);
        System.out.print("Type a number: "); delay(1000);

        double guess = in.nextDouble(); delay(1000); // Get the number guess.
        double difference = (guess - number); // find the difference.

        System.out.printf("Your guess is: %.0f \n", guess); delay(1000);
        System.out.println("The number I was thinking of is: " + number); delay(1000);
        System.out.printf("You were off by: %.0f \n", Math.abs(difference)); delay(1000);
    }

    // Delay method for CLI UI.
    public static void delay(int milliseconds) {

        try {Thread.sleep(milliseconds);}
        catch (InterruptedException exp) {}
    }

}
