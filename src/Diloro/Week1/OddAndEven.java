package Diloro.Week1;

import java.util.Scanner;

public class OddAndEven {

    public static void Odd_Even(int num){
        if(num % 2 ==0){
            System.out.println("Number: " + num + " is an even number.");
        }else{
            System.out.println("Number: " + num + " is an odd number.");
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to determine the parity:");
        int num = in.nextInt();

        Odd_Even(num);
    }
}
