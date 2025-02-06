import java.util.Scanner;

//42. Implement a program to calculate the power of a number using repeated multiplication.
public class Q42 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        int result = 1;
        int count  = exponent;
        do {
            result *= base;
            count--;
        }while (count > 0);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}
