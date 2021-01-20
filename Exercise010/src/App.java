// Exercise 10: Arithmetic
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise010

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("================");
        System.out.println("Input integer A:");
        int a = in.nextInt();
        System.out.println("================");
        System.out.println("Input integer B:");
        int b = in.nextInt();
        System.out.println("================");

        System.out.println("\n\n======================================");
        System.out.println("The sum is: " + String.valueOf(a + b));
        System.out.println("The difference is: " + String.valueOf(a - b));
        System.out.println("The product is: " + String.valueOf(a * b));
        System.out.println("The quotient is: " + String.valueOf(a / b));
        System.out.println("The remainder is: " + String.valueOf(a % b));
        System.out.println("The log of A is: " + String.valueOf(Math.log(a)));
        System.out.println("The result of AB is: " + String.valueOf(a * b));
        System.out.println("======================================");

        in.close();
    }
}
