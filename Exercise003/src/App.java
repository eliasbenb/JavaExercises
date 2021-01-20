// Exercise 3: Area of a Room
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise003

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Input the height of the room in meters:");
        int height = in.nextInt();
        System.out.println("======================================");
        System.out.println("Input the width of the room in meters:");
        int width = in.nextInt();
        System.out.println("======================================");
        System.out.println("Input the depth of the room in meters:");
        int depth = in.nextInt();
        System.out.println("======================================");

        int area = height * width * depth;

        System.out.println("\n\n=========================================");
        System.out.println("The total area of your room is: " + String.valueOf(area) + " m^3" + "\n=========================================");

        in.close();
    }
}
