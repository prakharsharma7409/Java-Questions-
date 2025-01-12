import java.util.Scanner;

//6. Write a program to classify a given grade (A, B, C, etc.) based on score ranges.
public class Q6 {
    public static void main(String[] args){
        char ch = 'A';
        char ch1 = 'B';
        char ch2 = 'C';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your marks out of 100 to check your Grade");
        int marks = sc.nextInt();
        if(marks > 100) {
            System.out.println("You Entered wrong marks please try again!!");
        } else if(marks >=80){
            System.out.println("Grade A Excellent!!");
        } else if (marks >=60) {
            System.out.println("Grade B Very Good ");
        } else if (marks >=40) {
            System.out.println("Grade C Good");
        }

    }
}
