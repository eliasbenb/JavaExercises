// Exercise 36: Vowel or Consonant
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise036

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("Input a letter from the English alphabet:");
        char letter = in.nextLine().toLowerCase().charAt(0);
        System.out.println("=========================================");

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              System.out.println("The letter '" + letter + "' is a vowel");
              break;
            case 'y':
              System.out.println("The letter '" + letter + "' could sometimes be a vowel");
              break;
            default:
              System.out.println("The letter '" + letter + "' is not a vowel");
          }
        
        in.close();
    }
}
