import java.util.Scanner;

//1. Write a program to check if a number is positive, negative, or zero.
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether the number is Positive,Negative or Zero");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Positive number");
        }
        else if(number < 0){
            System.out.println("Negative number");
        }
        else{
            System.out.print("Zero");
        }


    }
}