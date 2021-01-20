// Exercise 2: Hello
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise002

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Input your first name:");
        String firstName = in.nextLine();
        System.out.println("========================");
        System.out.println("Input yout last name:");
        String lastName = in.nextLine();
        System.out.println("========================");

        System.out.println("\n\n======================================");
        System.out.println("Hello, " + firstName + " " + lastName + "\n======================================");

        in.close();
    }
}
