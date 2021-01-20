// Exercise 7: Sum of the First n Positive Integers
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise007

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int integer = 0;
        while (integer <= 0) {
            System.out.println("\n=============================");
            System.out.println("Input an integer to be summed:");
            integer = in.nextInt();
        }

        int sum = ((integer) * (integer + 1)) / 2;
        System.out.println("============================");
        System.out.println("\n\n=============================");
        System.out.println("The sum is: " + sum);
        System.out.println("============================");

        in.close();
    }
}
