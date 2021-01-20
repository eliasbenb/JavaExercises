// Exercise 6: Tax and Tip
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise006

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Input the cost of the meal:");
        double initCost = in.nextDouble();

        double taxCost = initCost * 0.05;
        double tipCost = initCost * 0.18;
        double totalCost = initCost + taxCost + tipCost;

        System.out.println("\n\n=============================");
        System.out.println("The tax is: " + taxCost + "\nThe tip is: " + tipCost + "\nThe total is: " + totalCost);
        System.out.println("=============================");

        in.close();
    }
}
