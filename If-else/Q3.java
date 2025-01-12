import java.util.Scanner;

//3. Find the largest of two numbers.
public class Q3 {
    public static void main (String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to the largest number checker");
        System.out.println("Enter First number:");
        int num = sc.nextInt();
        System.out.println("Enter Second number:");
        int num1 = sc.nextInt();
        if(num > num1){
            System.out.println(num);
        }
        else if(num1 > num){
            System.out.println(num1);
        }


    }
}
