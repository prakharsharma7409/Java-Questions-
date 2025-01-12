import java.util.Scanner;

//13. Write a program to identify the type of a character (vowel, consonant, digit, special).
public class Q13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (Character.toLowerCase(ch)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a vowel.");
                break;

            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant.");
                } else if (Character.isDigit(ch)) {
                    System.out.println(ch + " is a digit.");
                } else {
                    System.out.println(ch + " is a special character.");
                }
                break;
        }
        }
    }

