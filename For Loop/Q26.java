import java.util.Scanner;

//26. Find the factorial of a number.
public class Q26 {
    public static void main (String[]args){
        Scanner scn  = new Scanner(System.in);
        int number = scn.nextInt();
        long factorial = 1;
        for (int i=1 ; i <= number; i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

    }
}
