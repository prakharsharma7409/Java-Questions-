import java.util.Scanner;

//36. Write a program to find the sum of all even numbers between 1 and n.
public class Q36 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int num = 2;

        while (num <= n) {
            sum += num;
            num += 2;
        }

        System.out.println("Sum of even numbers between 1 and " + n + " is: " + sum);
    }
}