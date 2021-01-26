// Exercise 35: Dog Years
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise035

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Input your dog's age in human years:");
        double humanYears = in.nextDouble();
        System.out.println("====================================");

        double dogYears;
        if (humanYears > 2) {
            dogYears = (2 * 10.5) + ((humanYears - 2) * 7);
        } else {
            dogYears = (humanYears * 10.5);
        }

        System.out.println("\n\n===========================================");
        System.out.println("Your dog's age in dog years is: " + dogYears);
        System.out.println("===========================================");
        
        in.close();
    }
}
