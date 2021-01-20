// Exercise 5: Bottle Deposits
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise005

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        double deposit = 0;
        double totalVolume = 0;
        while (true) {
            Scanner in = new Scanner(System.in);

            System.out.println("\n\n============================================");
            System.out.println("Input the volume of the container in liters:");
            double volume = in.nextDouble();
            
            if (volume > 1) {
                deposit += 0.25;
                totalVolume += volume;
            } else if (volume <= 1) {
                deposit += 0.1;
                totalVolume += volume;
            }
            else if (volume <= 0) {
                ;
            }

            System.out.println("\n\n============================================");
            System.out.println("The total volume is: " + totalVolume);
            System.out.println("The total deposit is: " + deposit);
            
            in.close();
        }
    }
}
