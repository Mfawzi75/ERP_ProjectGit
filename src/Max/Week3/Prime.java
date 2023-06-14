package Max.Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=input.nextInt();
        ArrayList<Integer> list=new ArrayList<>(num);
        System.out.print ("Prime numbers: -");

        for (int i = 1; i < num+10; i++) {
           boolean count=false;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count= true;
                break;}
            }
            if(!count){
                list.add(i);
            System.out.print("  "+i);}

        }
        System.err.print("\n"+"Result:");
        if(list.contains(num))
            System.err.println(num +" - is prime number");
        else System.err.println("\n"+num +" - is not prime number");
    }
}
