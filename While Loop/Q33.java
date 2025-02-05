import java.util.Scanner;

//33. Check if a number is a palindrome.
public class Q33 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the number is palindrome or not");
        int num = sc.nextInt();
        int orignalNum = num;
        int reversedNum = 0;
        while (num > 0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 +digit;
            num /= 10;
        }
        if (orignalNum == reversedNum){
            System.out.println(orignalNum + " is Palindrome");
        }else{
            System.out.println(orignalNum + " not Palindrome");
        }

    }
}
