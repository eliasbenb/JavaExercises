// Exercise 15: Distance Units
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise015

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Input a measurment in feet:");
        double feet = in.nextDouble();
        System.out.println("=================================");

        double inches = feet * 1;
        double yards = feet / 3;
        double miles = feet / 5280;

        System.out.println("\n\n==============================================");
        System.out.println("Inches: " + String.valueOf(inches) + "in");
        System.out.println("Yards: " + String.valueOf(yards) + "yd");
        System.out.println("Miles: " + String.valueOf(miles) + "mi");
        System.out.println("==============================================");

        in.close();
    }
}
