import java.util.Scanner;

public class SeparatingCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();

        int i=0;
        int loops=name.length();

        if (name.length() >= loops) {
            while (i != loops) {
                System.out.println((i + 1) + ". character: " + name.charAt(i));
                i++;
            }
        } else {
            System.out.println("No.");
        }
    }
}
