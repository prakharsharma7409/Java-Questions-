import java.util.Scanner;

//9. Verify if a number is divisible by 5 and 11.
public class Q9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to verify whether the number is divisible by 5 and 11");
        int num = sc.nextInt();
        if(num%5 == 0 && num%11 ==0){
            System.out.println("Verified");
        }else {
            System.out.println("Not Verified");
        }

    }
}
