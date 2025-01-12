import java.util.Scanner;

//17. Display a grade description (A: Excellent, B: Good, etc.) based on a given grade.
public class Q17 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade(A,B,C,D) to get description based on your grade!!");
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Nice");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Entered Wrong Grade!!");
        }
    }
}
