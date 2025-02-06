import java.util.Scanner;

//41. Print the first n natural numbers in reverse.
public class Q41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n > 0);


    }
}