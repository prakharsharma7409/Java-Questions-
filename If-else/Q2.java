import java.util.Scanner;

//2. Check if a number is even or odd using if-else
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether the number is even or odd");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Even");
        }
        else if (number % 2 != 0) {
            System.out.println("Odd");
        }


    }
}
