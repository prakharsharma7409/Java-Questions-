import java.util.Scanner;

//10. Implement a simple calculator using if-else
public class Q10 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to the Simple Calculator");
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operation[+,-,*,/,%]");
        char operation = sc.next().charAt(0);
        double result;
        if(operation == '+'){
            result = num1 + num2;
            System.out.println(result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (operation == '/'){
            result = num1 / num2;
            System.out.println(result);
        }else if (operation == '%'){
            result = num1 % num2;
            System.out.println(result);
        }
    }
}
