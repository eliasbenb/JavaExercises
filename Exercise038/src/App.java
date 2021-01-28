// Exercise 38: Month Name to Number of Days
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise038

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=================");
        System.out.println("Input the month:");
        String month = in.nextLine();
        month = month.substring(0, 1).toUpperCase() + month.toLowerCase().substring(1);
        System.out.println("=================");

        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
              System.out.println("There are 31 days in the month of " + month);
              break;
            case "April":
            case "June":
            case "September":
            case "November":
              System.out.println("There are 30 days in the month of " + month);
              break;
            case "February":
              System.out.println("There could be 29 or 28 days in the month of " + month);
              break;
            default:
              System.out.println("That's not a month!");
          }
        
        in.close();
    }
}
