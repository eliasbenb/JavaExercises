// Exercise 37: Name that Shape
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise037

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Input the number of sides of a shape:");
        int sides = in.nextInt();
        System.out.println("=========================================");

        switch (sides) {
            case 3:
              System.out.println("This shape is a triangle");
              break;
            case 4:
              System.out.println("This shape is a quadrilateral");
              break;
            case 5:
              System.out.println("This shape is a pentagon");
              break;
            case 6:
              System.out.println("This shape is a hexagon");
              break;
            case 7:
              System.out.println("This shape is a heptagon");
              break;
            case 8:
              System.out.println("This shape is a octagon");
              break;
            case 9:
              System.out.println("This shape is a nonagon");
              break;
            case 10:
              System.out.println("This shape is a decagon");
              break;
            default:
              System.out.println("This program doesn't support that number of sides");
          }
        
        in.close();
    }
}
