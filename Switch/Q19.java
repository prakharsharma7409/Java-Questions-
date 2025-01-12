import java.util.Scanner;

//19. Write a program to convert currency based on user choice.
public class Q19 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency Converter");
        System.out.println("1. USD (United States Dollar) to INR [1 USD ≈ 83.00 INR]");
        System.out.println("2. EUR (Euro) to INR [1 EUR ≈ 90.00 INR]");
        System.out.println("3. JPY (Japanese Yen) to INR [1 JPY ≈ 0.56 INR]");
        System.out.println("4. AUD (Australian Dollar) to INR [1 AUD ≈ 55.00 INR]");
        System.out.println("5. CAD (Canadian Dollar) to INR [1 CAD ≈ 61.00 INR]");
        System.out.println("6. INR to USD (United States Dollar) [1 INR ≈ 0.012 USD]");
        System.out.println("7. INR to EUR (Euro) [1 INR ≈ 0.011 EUR]");
        System.out.println("8. INR to JPY (Japanese Yen) [1 INR ≈ 1.79 JPY]");
        System.out.println("9. INR to AUD (Australian Dollar) [1 INR ≈ 0.018 AUD]");
        System.out.println("10. INR to CAD (Canadian Dollar) [1 INR ≈ 0.0164 CAD]");
        System.out.println("Enter choice (1-10)");
        int choice = sc.nextInt();
        System.out.println("Enter Amount");
        double amount = sc.nextDouble();
        double convertedAmount;
        switch (choice){
            case 1:
                convertedAmount = amount*83.00;
                System.out.printf("%.2f USD is %.2f INR",amount,convertedAmount);
                break;
            case 2:
                convertedAmount = amount*90.00;
                System.out.printf("%.2f EUR is %.2f INR",amount,convertedAmount);
                break;
            case 3:
                convertedAmount = amount*0.56;
                System.out.printf("%.2f JPY is %.2f INR",amount,convertedAmount);
                break;
            case 4:
                convertedAmount = amount*55.00;
                System.out.printf("%.2f AUD is %.2f INR",amount,convertedAmount);
                break;
            case 5:
                convertedAmount = amount*61.00;
                System.out.printf("%.2f CAD is %.2f INR",amount,convertedAmount);
                break;
            case 6:
                convertedAmount = amount/83.00;
                System.out.printf("%.2f INR is %.2f USD",amount,convertedAmount);
                break;
            case 7:
                convertedAmount = amount/90.00;
                System.out.printf("%.2f INR is %.2f EUR",amount,convertedAmount);
                break;
            case 8:
                convertedAmount = amount/0.56;
                System.out.printf("%.2f INR is %.2f JPY",amount,convertedAmount);
                break;
            case 9:
                convertedAmount = amount/55.00;
                System.out.printf("%.2f INR is %.2f AUR",amount,convertedAmount);
                break;
            case 10:
                convertedAmount = amount/61.00;
                System.out.printf("%.2f INR is %.2f CAD",amount,convertedAmount);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
