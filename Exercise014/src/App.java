// Exercise 14: Height Units
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise014

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Input your heigh in feet:");
        double feet = in.nextDouble();
        System.out.println("=================================");

        double centimeters = feet * 12 * 2.54;

        System.out.println("\n\n==============================================");
        System.out.println("Your height in centimeters is: " + String.valueOf(centimeters) + "cm");
        System.out.println("==============================================");

        in.close();
    }
}
