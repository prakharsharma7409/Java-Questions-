import java.util.Random;
import java.util.Scanner;

//38. Implement a simple guessing game.
public class Q38 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        int secretNumber = ran.nextInt(100)+1;
        int guess = 0;
        System.out.println("Welcome to the Game ");
        System.out.println("Guess the Number between 1-100");
        while (guess != secretNumber){
            System.out.print("Enter your guess ");
            guess = scn.nextInt();
            if ( guess > secretNumber){
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
            }
        }
    }

