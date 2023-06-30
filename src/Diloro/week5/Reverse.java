package Diloro.week5;

public class Reverse {

    public static String Reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }


    public static void main(String[] args) {

        String str = "Mini";
        System.out.println(Reverse(str));
    }
}