//48. Create a program to determine if a number is a perfect square.
import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int i = 1, square;
        boolean isPerfectSquare = false;

        do {
            square = i * i;
            if (square == num) {
                isPerfectSquare = true;
                break;
            }
            i++;
        } while (square <= num);

        System.out.println(isPerfectSquare ? num + " is a perfect square." : num + " is NOT a perfect square.");
    }
}

