package Shahnoza;

import java.util.ArrayList;

public class Task2_DivisibleBy15_5_3 {
    public static void main(String[] args) {
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);

        System.out.println("============== After Calculation ====================");

        for (int i = 1; i <=100 ; i++) {

            if (i%15==0){
                divisibleBy15.add(i);
            }else if (i%5==0){
                divisibleBy5.add(i);
            }else if (i%3==0){
                divisibleBy3.add(i);
            }
        }


        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);


    }
}
