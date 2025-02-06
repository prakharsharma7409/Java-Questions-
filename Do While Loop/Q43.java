import java.util.Scanner;

//43. Write a program to display a menu and keep the program running until the user chooses to exit.
public class Q43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Triallonare");
            System.out.println("2. Billionare");
            System.out.println("3. Millionare");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Triallonare");
                    break;
                case 2:
                    System.out.println("Billionare");
                    break;
                case 3:
                    System.out.println("Millionare");
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
