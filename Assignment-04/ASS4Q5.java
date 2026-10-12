import java.lang.*;
import java.util.Scanner;

public class ASS4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character from the alphabet: ");
        String str = sc.next();

        if (str.length() != 1) {
            System.out.println("ERROR");
        } else {
            char ch = str.charAt(0);
            ch = Character.toLowerCase(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        sc.close();
    }
}