import java.util.Scanner;

//28. Calculate the sum of digits of a number.
public class Q28 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to calculate sum of digits of a number");
        int num = scn.nextInt();
        int sum = 0;
        num = Math.abs(num);
        for (;num>0;num /= 10){
            int digit = num%10;
            sum = sum+digit;
        }
        System.out.println("Sum of digits " + sum);
        scn.close();
    }
}
