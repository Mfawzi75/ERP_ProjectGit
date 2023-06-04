package Ayoub.Week3;

public class Reverse_Negative_Number {
    public static void main (String[] args) {

        System.out.println(reverseNum(-215));
    }

    public static String reverseNum(int num) {
        num = -215;
        String num1 = Integer.toString(num);
        String result = "";

        for (int i = num1.length() - 1; i >= 1; i--) {
            result += num1.charAt(i);
        }
        return ("-" + result);
    }


}
