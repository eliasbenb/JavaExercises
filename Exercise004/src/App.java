// Exercise 4: Area of a Field
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise004

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Input the length of the field in feet:");
        int length = in.nextInt();
        System.out.println("======================================");
        System.out.println("Input the width of field in feet:");
        int width = in.nextInt();
        System.out.println("======================================");

        int area = length * width;

        System.out.println("\n\n==========================================");
        System.out.println("The total area of the field is: " + String.valueOf(area) + " ft^2"
                + "\n==========================================");

        in.close();
    }
}
