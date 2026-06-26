import java.util.Random;    // import java.util.*;
import java.util.Scanner;   // exclude this if using above

public class Q101 {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner =new Scanner(System.in);
        int number=random.nextInt(100)+1; // random.nextInt(100); it will give rndm no from 0 to 99... +1 will give range from (0+1)=1 t0 (99+1)= 100.
        int guess=0;
        int attempt=0;

        System.out.println("\tNumber Guessing Game");
        System.out.println("Guess a number between 1 and 100");
        while (guess!=number) {
            System.out.print("Enter your guess: ");
            guess=scanner.nextInt();
            attempt++;
            if (guess>number) {
                System.out.println("Too high... Try again.");
            } else if (guess<number) {
                System.out.println("Too low... Try again.");
            } else {
                System.out.println("Congratulations.. You guessed the correct number.");
                System.out.println("Number of attempts: " +attempt);
            }
        }

        scanner.close();
    }
}