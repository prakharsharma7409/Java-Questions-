import java.util.Scanner;

//11. Create a calculator using switch-case for operations (+, -, *, /).
public class Q11 {
    public static void main(String[] args){
        System.out.println("Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter Operation [+,-,*,/,%]");
        char operation = sc.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                System.out.println(result);
                break;
            case  '-':
                result = num1-num2;
                System.out.println(result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(result);
                break;
            case '%':
                result = num1%num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Operation");
        }



    }
}