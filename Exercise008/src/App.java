// Exercise 8: Widgets and Gizmos
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise008

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("Input the number of widgets: ");
        int widgets = in.nextInt();
        System.out.println("Input the number of gizmos: ");
        int gizmos = in.nextInt();
        System.out.println("============================");

        int totalWeight = (widgets * 75) + (gizmos * 112);

        System.out.println("============================");
        System.out.println("\n\n=============================");
        System.out.println("The total weight is: " + String.valueOf(totalWeight) + " g");
        System.out.println("============================");

        in.close();
    }
}
