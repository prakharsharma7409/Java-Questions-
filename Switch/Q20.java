import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Ticket Counter");
        System.out.println("Prices:");
        System.out.println("For Child - Rs.50, Adult - Rs.100, Senior - Rs.120");

        System.out.println("Enter ticket type (Child/Adult/Senior):");
        String choice = sc.nextLine();

        System.out.println("Select Payment Method:");
        System.out.println("1. Online");
        System.out.println("2. Offline");
        int method = sc.nextInt();
        sc.nextLine();

        if (method == 1) {
            System.out.println("You selected Online Method for payment.");
            System.out.println("Choose a payment platform:");
            System.out.println("1. Paytm");
            System.out.println("2. PhonePe");
            System.out.println("3. Google Pay");
            int platform = sc.nextInt();
            sc.nextLine();

            switch (platform) {
                case 1:
                    System.out.println("You selected Paytm.");
                    System.out.println("Scan the QR code to complete your payment.");
                    break;
                case 2:
                    System.out.println("You selected PhonePe.");
                    System.out.println("Scan the QR code to complete your payment.");
                    break;
                case 3:
                    System.out.println("You selected Google Pay.");
                    System.out.println("Scan the QR code to complete your payment.");
                    break;
                default:
                    System.out.println("Invalid platform selection. Please try again.");
                    return;
            }
        } else if (method == 2) {
            System.out.println("You selected Offline Method for payment.");
            System.out.println("Choose an offline payment option:");
            System.out.println("1. Submit Cash at Counter");
            System.out.println("2. Pay with Card at Counter");
            int offlineOption = sc.nextInt();
            sc.nextLine();

            switch (offlineOption) {
                case 1:
                    System.out.println("Please submit cash at the counter. Thank you!");
                    break;
                case 2:
                    System.out.println("Please swipe your card at the counter. Thank you!");
                    break;
                default:
                    System.out.println("Invalid offline option selected. Please try again.");
                    return;
            }
        } else {
            System.out.println("Wrong Payment Method Selected! Try Again!!");
            return;
        }

        switch (choice.toLowerCase()) {
            case "child":
                System.out.println("Ticket Price: Rs.50. Thanks for purchasing!");
                break;
            case "adult":
                System.out.println("Ticket Price: Rs.100. Thanks for purchasing!");
                break;
            case "senior":
                System.out.println("Ticket Price: Rs.120. Thanks for purchasing!");
                break;
            default:
                System.out.println("You entered a wrong ticket type. Please try again.");
        }
        sc.close();
    }
}
