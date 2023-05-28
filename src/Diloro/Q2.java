package Diloro;

public class Q2 {
    public static void main(String[] args) {
        StringBuilder d3_5_15 = new StringBuilder();
        StringBuilder d5 = new StringBuilder();
        StringBuilder d3 = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if(i % 15 == 0 && i % 5 == 0 && i % 3 == 0){
                d3_5_15.append(" ").append(i);
            }else if(i%5==0){
                d5.append(" ").append(i);
            }else if(i%3==0){
                d3.append(" ").append(i);
            }
        }
        System.out.println("Number divisible by 3:" + d3);
        System.out.println("Number divisible by 5:" + d5);
        System.out.println("Numbers divisible by 3 & 5 & 15:" + d3_5_15);
    }
}