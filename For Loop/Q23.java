import java.util.Scanner;

//23. Calculate the sum of the first n natural numbers.
public class Q23 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n to print sum of n natural numbers");
        int n = scn.nextInt();
        int sum = 0;
        for( int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum  );


    }
}
