import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int maxDigit = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }

        System.out.println("Largest digit: " + maxDigit);
    }
}
