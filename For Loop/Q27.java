//27. Write a program to print all prime numbers between 1 and 100.
public class Q27 {
    public static void main (String[]args){
        System.out.println("Prime numbers between 1-100 are:");
        for (int num = 2;num<=100;num++ ){
            boolean isprime = true;

            for (int i = 2; i < num;i++){
                if (num%i==0){
                    isprime = false;
                    break;
                }
            }
            if (isprime) {

                System.out.print(num + " ");
            }
        }
    }
}
