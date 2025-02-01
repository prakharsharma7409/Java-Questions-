//29. Print all Armstrong numbers between 1 and 500
public class Q29 {
    public static void main (String[]args) {
        System.out.println("Armstrong number between 1-500:");
        for (int num = 1; num <= 500; num++) {
            int originalNum = num;
            int sum = 0;
            int digits = 0;
            for (int temp = num; temp > 0; temp /= 10) {
                digits++;
            }
            for (int temp = num; temp > 0; temp /= 10) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);

            }
            if (sum == originalNum) {
                if (originalNum > 9) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
