// Exercise 9: Compound Interest
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise009

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("Input the inital deposit: ");
        double initDep = in.nextDouble();
        System.out.println("============================");

        double yearOne = (double)Math.round((initDep * Math.pow(1, 0.04)) * 100) / 100;
        double yearTwo = (double)Math.round((initDep * Math.pow(2, 0.04)) * 100) / 100;
        double yearThree = (double)Math.round((initDep * Math.pow(3, 0.04)) * 100) / 100;

        System.out.println("\n\n=============================");
        System.out.println("Intial deposit: " + String.valueOf(initDep) + "\nFirst year: " + String.valueOf(yearOne)
                + "\nSecond year: " + String.valueOf(yearTwo) + "\nThird year: " + String.valueOf(yearThree));
        System.out.println("============================");

        in.close();
    }
}
