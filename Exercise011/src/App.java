// Exercise 11: Fuel Efficiency
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise011

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("Input the fuel efficiency in mpg:");
        double mpg = in.nextDouble();
        System.out.println("==============================================");

        double lp100km = 235.214583 / mpg;

        System.out.println("\n\n==============================================");
        System.out.println("The Canadian equivalent is: " + String.valueOf(lp100km));
        System.out.println("==============================================");

        in.close();
    }
}
