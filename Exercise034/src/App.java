// Exercise 34: Even or Odd?
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise034

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("Input an integer:");
        int integer = in.nextInt();
        System.out.println("===========================");

        if (integer % 2 == 0) {
            System.out.println("\n\n===========================\nThe number is even\n===========================");
        } else {
            System.out.println("\n\n===========================\nThe number is odd\n===========================");
        }

        in.close();
    }
}
