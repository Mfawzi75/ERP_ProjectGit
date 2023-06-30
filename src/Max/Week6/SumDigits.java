package Max.Week6;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter String with numbers");
        String str = input.nextLine();
        System.out.println("num sum =  "+digits(str));

    }

    public static int digits(String str){
        int resolt = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                resolt+=Integer.parseInt(""+str.charAt(i));
        }
        return resolt;
    }
}
// new