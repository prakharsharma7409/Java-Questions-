import java.util.Scanner;

//31. Print the digits of a number in reverse order.
public class Q31 {
    public static void main (String[]args){
        Scanner Scn  = new Scanner(System.in);
        System.out.println("Enter the number to reverse it - ");
        int num = Scn.nextInt();
        System.out.println("Digit in reverse order are - ");
        while (num > 0){
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
        }
    }
}
