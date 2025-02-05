import java.util.Scanner;
//32. Calculate the sum of digits of a number until it becomes a single digit.
public class Q32 {
    public static void main (String[]args){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                scanner.close();

                while (num >= 10) {  // Continue until num is a single digit
                    int sum = 0;
                    while (num > 0) {
                        sum += num % 10;  // Extract last digit and add to sum
                        num /= 10;  // Remove last digit
                    }
                    num = sum;  // Update num with the new sum
                }

                System.out.println("Final single-digit sum: " + num);
            }
        }

