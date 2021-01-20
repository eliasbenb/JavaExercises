// Exercise 1: Mailing Address
// https://github.com/eliasbenb/JavaExercises/tree/main/Exercise001

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Input the sender's name:");
        String senderName = in.nextLine();
        System.out.println("========================");
        System.out.println("Input the sender's address:");
        String senderAddress = in.nextLine();
        System.out.println("========================");
        System.out.println("Input the sender's city:");
        String senderCity = in.nextLine();
        System.out.println("========================");
        System.out.println("Input the receiver's name:");
        String receiverName = in.nextLine();
        System.out.println("========================");
        System.out.println("Input the receiver's address:");
        String receiverAddress = in.nextLine();
        System.out.println("========================");
        System.out.println("Input the receiver's city:");
        String receiverCity = in.nextLine();
        System.out.println("========================");

        System.out.println("\n\n=====================================================================");
        System.out.println(senderName + "\n" + senderAddress + "\n" + senderCity
                + "\n\n\n                                                  " + receiverName
                + "\n                                                  " + receiverAddress
                + "\n                                                  " + receiverCity
                + "\n=====================================================================");

        in.close();
    }
}
