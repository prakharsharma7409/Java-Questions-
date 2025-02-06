//50. Write a program to display all prime numbers less than a given number
import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int num = 2;
        System.out.println("Prime numbers less than " + n + ":");

        do {
            int i = 2;
            boolean isPrime = true;

            do {
                if (num % i == 0 && i != num) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i < num);

            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        } while (num < n);
    }
}
