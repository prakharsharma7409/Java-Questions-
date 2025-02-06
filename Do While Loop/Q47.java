//47. Generate the sum of squares of first n numbers using a loop
import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0, i = 1;
        do {
            sum += i * i;
            i++;
        } while (i <= n);

        System.out.println("Sum of squares: " + sum);
    }
}

