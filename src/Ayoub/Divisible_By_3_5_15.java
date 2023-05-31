package Ayoub;

public class Divisible_By_3_5_15 {

    public static void main (String[] args) {

        StringBuilder d15_5_3 = new StringBuilder();
        StringBuilder d5 = new StringBuilder();
        StringBuilder d3 = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0 && i % 5 == 0 && i % 3 == 0) {
                d15_5_3.insert(0," ").insert(0, i);
            } else if (i % 5 == 0) {
                d5.insert(0," ").insert(0, i);
            } else if (i % 3 == 0) {
                d3.insert(0," ").insert(0,i);
            }
        }
        System.out.println("Numbers divisible by 3 & 5 & 15 :" + d15_5_3);
        System.out.println("Number divisible by 5 :" + d5);
        System.out.println("Number divisible by 3 :" + d3);




    }
}



