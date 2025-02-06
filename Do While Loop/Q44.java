import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number for countdown: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Countdown begins...");

        do {
            System.out.println(n);
            n--;
            try {
                Thread.sleep(1000); // Pause for 1 second to simulate a real countdown
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted.");
            }
        } while (n >= 0);

        System.out.println("Time's up!");
    }
}
