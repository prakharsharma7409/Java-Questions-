import java.util.Scanner;

//8. Check if a year is a leap year.
public class Q8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year if you want to check whether the year is leap year or not");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
