package Ayoub.Week3;

import java.util.Scanner;

public class Prime_Number {
    public static void main (String[] args) {

        System.out.println("Enter the number"); // number = n-1 remainder not 0 which mean the that is prime number.

        int number;
        boolean a = false;
        Scanner input = new Scanner(System.in);

        number= input.nextInt();
        for (int i = 2 ; i<number; i++){


            if (number % i ==0) { // is not prime ==> Go to  if(a== true)
                a= true;              // if number"6" not divisible by 2345 and the remind not 0 ... then a keep false value... the go to ==>else
                break;
            }

        }

        if (a== true){
            System.out.println("The number " + number + " is not prime");
        }
        else {
            System.out.println("The number " + number+ " is prime");
        }
    }

}




