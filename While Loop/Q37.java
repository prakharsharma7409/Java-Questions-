//37. Generate the first n terms of an arithmetic progression
import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        System.out.println("The first " + n + " terms of the AP are:");

        int count = 0;
        int term = a;
        while (count < n) {
            System.out.print(term + " ");
            term += d;
            count++;
        }
    }
}

