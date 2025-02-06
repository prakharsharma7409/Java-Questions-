//46. Implement a program to simulate a simple ATM system.
import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.00;
        int choice;

        do {
            System.out.println("\nATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            do {
                if (choice == 1) {
                    System.out.println("Current Balance: $" + balance);
                } else if (choice == 2) {
                    System.out.print("Enter deposit amount: ");
                    balance += scanner.nextDouble();
                    System.out.println("Deposit successful!");
                } else if (choice == 3) {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                } else if (choice != 4) {
                    System.out.println("Invalid choice! Try again.");
                }
            } while (false);

        } while (choice != 4);

        System.out.println("Thank you for using the ATM!");
        scanner.close();
    }
}
