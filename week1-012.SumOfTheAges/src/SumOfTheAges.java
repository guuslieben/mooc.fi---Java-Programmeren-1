
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        // Ask user 1 to enter name and age
        System.out.println("Type your name: ");
        String name1 = reader.nextLine();

        System.out.println("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());

        // Ask user 2 to enter name and age
        System.out.println("Type your name: ");
        String name2 = reader.nextLine();

        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        // Calculate sum of age1 and age2
        int agetotal = age1 + age2;

        // Print sum and names
        System.out.println(name1 + " and " + name2 + " are " + agetotal + " years old in total.");
    }
}
