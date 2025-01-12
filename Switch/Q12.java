import java.util.Scanner;

//12. Display the day of the week based on a number (1-7).
public class Q12 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no(1-7) to print days:");
        int days = sc.nextInt();
        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tueday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You Entered wrong number");

        }

    }
}
