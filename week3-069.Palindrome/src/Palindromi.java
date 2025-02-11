import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int i=0;
        int l=text.length();
        String reverse="";

        while (i!=l) {
            reverse = reverse + text.charAt(l-i-1);
            i++;
        }

        if (reverse.equals(text)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
