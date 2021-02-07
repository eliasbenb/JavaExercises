// Exercise 39: Sound Levels
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise039

import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);

    System.out.println("====================");
    System.out.println("Input the decibels:");
    int decibels = in.nextInt();
    System.out.println("====================");

    switch (decibels) {
      case 40:
        System.out.println("That is the sound level of a quiet room");
        break;
      case 70:
        System.out.println("That is the sound level of an alarm clock");
        break;
      case 106:
        System.out.println("That is the sound level of a gas lawnmower");
        break;
      case 130:
        System.out.println("That is the sound level of a jackhammer");
        break;
      default:
        break;
    }

    in.close();
  }
}
