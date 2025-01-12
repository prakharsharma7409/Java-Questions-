import java.util.Scanner;

//4. Determine if a person is eligible to vote based on their age
public class Q4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check whether you are eligible for vote or not");
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for vote !!");
        } else if (age < 18) {
            int yearstowait = 18-age;
            System.out.println("Sorry You are not eligible for vote but you can vote after" + yearstowait);

        }



    }
}
