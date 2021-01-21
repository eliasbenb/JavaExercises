// Exercise 13: Making Change
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise013

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Input the cost of the purchases in cents:");
        double cost = in.nextDouble();
        System.out.println("=========================================");
        System.out.println("Input the amount paid in cents:");
        double paid = in.nextDouble();
        System.out.println("=========================================");

        double diff = paid - cost;
        int toonies = (int) (diff / 200);
        diff -= toonies * 200;
        int loonies = (int) (diff / 100);
        diff -= loonies * 100;
        int quarters = (int) (diff / 25);
        diff -= quarters * 25;
        int dimes = (int) (diff / 10);
        diff -= dimes * 10;
        int nickles = (int) (diff / 5);
        diff -= nickles * 5;
        int pennies = (int) (diff / 1);
        diff -= pennies * 1;

        System.out.println("\n\n==============================================");
        System.out.println("Toonies  [ 200 cents ] : " + toonies);
        System.out.println("Loonies  [ 100 cents ] : " + loonies);
        System.out.println("Quarters [ 25  cents ] : " + quarters);
        System.out.println("Dimes    [ 10  cents ] : " + dimes);
        System.out.println("Nickles  [ 5   cents ] : " + nickles);
        System.out.println("Pennies  [ 1   cents ] : " + pennies);
        System.out.println("==============================================");

        in.close();
    }
}
