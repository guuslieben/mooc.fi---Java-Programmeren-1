
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        // Ask user to enter their age
        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        // Print majority based on value
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
