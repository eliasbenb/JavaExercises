// Exercise 12: Distance Between Two Points on Earth
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise012

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Input the latitude of point 1:");
        double lat1 = Math.toRadians(in.nextDouble());
        System.out.println("===================================");
        System.out.println("Input the longitude of point 1:");
        double long1 = Math.toRadians(in.nextDouble());
        System.out.println("===================================");
        System.out.println("Input the latitude of point 2:");
        double lat2 = Math.toRadians(in.nextDouble());
        System.out.println("===================================");
        System.out.println("Input the longitude of point 2:");
        double long2 = Math.toRadians(in.nextDouble());
        System.out.println("===================================");

        double x = Math.sin((lat2 - lat1) / 2) * Math.sin((lat2 - lat1) / 2)
                + Math.cos(lat1) * Math.cos(lat2) * Math.sin((long2 - long1) / 2) * Math.sin((long2 - long1) / 2);
        double dist = 6371.01 * 2 * Math.atan2(Math.sqrt(x), Math.sqrt(1 - x));

        System.out.println("\n\n============================================================");
        System.out.println("The distance between the two points is: " + String.valueOf(dist));
        System.out.println("============================================================");

        in.close();
    }
}
