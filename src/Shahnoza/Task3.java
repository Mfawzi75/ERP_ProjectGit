package Shahnoza;

import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");

        int number = input.nextInt();

        for (int i = 0; i <number; i++) {

        }

        System.out.println(number);

    }
}
//3. Print consecutive numbers
//  Write a function: that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
//  However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.

//  If a number is divisible by more than one of the numbers: 2, 3 or 5, it should be replaced by a concatenation of the
//  respective words Codility, Test and Coders in this given order.

//  For example, numbers divisible by both 2 and 3 should be
//  replacée by CodilityTest and numbers divisible by all three numbers: 2, 3 and 5, should be replaced by CodilityTestCoders.

//
//  For example, here is the output for N = 17:
// 1 1
// 2 Codility
// 3 Test
// 4 Codility
// 5 Coders
// 6 CodilityTest
// 7 7
// 8 Codility
// 9 Test
// 10 CodilityCoders
// 11 11
// 12 CodilityTest
// 13 13
// 14 Codility
// 15 TestCoders
// 16 Codility
// 17 17