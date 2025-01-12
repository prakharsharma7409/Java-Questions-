import java.util.Scanner;

//15. Check the season (Spring, Summer, etc.) based on the month number.
/*Season
Months
Winter
December, January, February
Spring
March, April, May
Summer
June, July, August
Autumn
September, October, November*/
public class Q15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number to print season");
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Invalid mont number");

        }
    }
}
