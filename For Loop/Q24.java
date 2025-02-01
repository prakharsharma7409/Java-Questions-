import java.util.Scanner;

//24. Display the Fibonacci sequence up to n terms.
public class Q24 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the term you want to print fibonnaci series");
        int n = scn.nextInt();

        int first = 0,second = 1;
        System.out.println("Fibonacci Sequence up to " + n + " terms:");


        for(int i=1; i<=n;i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

    }
}
