import java.util.Scanner;

//39. Write a program to count the number of digits in a number.
public class Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int count = 0;
        int temp = Math.abs(num); // Handle negative numbers

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
