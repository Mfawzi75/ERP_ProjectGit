package hanan.week1;

import java.util.Scanner;

public class NumbersOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter number ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("zero");
        } else if (number %2 == 0 ) {
            System.out.println(number + "is Even number");
        }else if(number %2 != 0){
            System.out.println(number + " is Odd number");
        }else{
            System.out.println("invalid");
        }

    }
}
/*
Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"

 */