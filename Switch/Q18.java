import java.util.Scanner;

//18. Determine the type of triangle based on angles using switch-case.
public class Q18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Angles to print triangle types");
        System.out.println("Enter first angle");
        int angle1 = sc.nextInt();
        System.out.println("Enter second angle");
        int angle2 = sc.nextInt();
        System.out.println("Enter 3rd angle");
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 &&angle3 > 0){
            int triangletype;
            if (angle1 < 90 && angle2 < 90 && angle3 < 90){
                triangletype = 1;
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                triangletype = 2;
            }else{
                triangletype = 3;
            }
            switch (triangletype){
                case 1:
                    System.out.println("Acute Triangle");
                    break;
                case 2:
                    System.out.println("Right Triangle");
                    break;
                case 3:
                    System.out.println("Obtuse Triangle");
                    break;
                default:
                    System.out.println("Triangle does'nt exists");
            }
        }else{
            System.out.println("You Entered wrong Angles!!");
        }


    }
}
