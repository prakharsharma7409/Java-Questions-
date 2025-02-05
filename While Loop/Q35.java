import java.util.Scanner;

//35. Display numbers in a given range that are divisible by a specific number.
public class Q35 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Starting Number : ");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number : ");
        int end = sc.nextInt();
        System.out.println("Enter the Number to check the divisiblity : ");
        int divisor = sc.nextInt();
        System.out.println("Numbers divisible by " + divisor + " in the range " + start + " to " + end + ":");
        int num = start;
        while (num <= end) {
            if (num % divisor == 0) {
                System.out.print(num + " ");
            }
            num++;
        }

    }
}
