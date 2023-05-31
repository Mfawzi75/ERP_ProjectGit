package Week2;

import java.util.Scanner;

public class CodilityTestCoders {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a positive number:");
        int n = in.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                    System.out.println("CodilityTestCoders");
                } else if (i % 3 == 0 && i % 2 == 0) {
                    System.out.println("CodilityTest");
                } else if (i % 5 == 0 && i % 3 == 0) {
                    System.out.println("TestCoders");
                } else if (i % 5 == 0 && i % 2 == 0) {
                    System.out.println("CodilityCoders");
                } else if (i % 5 == 0) {
                    System.out.println("Coders");
                } else if (i % 3 == 0) {
                    System.out.println("Test");
                } else if (i % 2 == 0) {
                    System.out.println("Codility");
                } else {
                    System.out.println(i);
                }
            }
        }



    }
}