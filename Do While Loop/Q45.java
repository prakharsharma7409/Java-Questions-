//45. Calculate the average of user-entered numbers until the user inputs -1.
import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, sum = 0, num;

        do {
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();
            if (num != -1) {
                sum += num;
                count++;
            }
        } while (num != -1);

        scanner.close();
        System.out.println(count > 0 ? "Average: " + (double) sum / count : "No numbers entered.");
    }
}
