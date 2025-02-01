import java.util.Scanner;

//22. Print the multiplication table of a given number
public class Q22 {
    public static void main (String[]args){
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter the number to print table -");
        int number = scn.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));

        }


    }
}
