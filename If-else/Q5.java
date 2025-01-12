import java.util.Scanner;

//5. Check if a character is a vowel or a consonant.
public class Q5 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Character ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (Character.isLetter(ch)) {
        }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }


    }
}
