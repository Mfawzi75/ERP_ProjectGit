package src.hanan.week1;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number, thank you!");
        int number1 = input.nextInt();//10

        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter a number to divide it by, thank you!");
        int number2 = input2.nextInt();//5


        int sum = number1 + number2;// 10+5=15
        int result = 0;

        while (sum > number2) {//15 > 5
            sum = sum - number2;//15-5=10
            result++;


        }
        System.out.println("Division result is " +result  );

    }
}

/*

2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator


 */