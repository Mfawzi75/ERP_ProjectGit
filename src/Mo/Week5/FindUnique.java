package Mo.Week5;

import java.util.Scanner;

public class FindUnique {
    /*
    Find the unique:
  Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter String");
        String str = input.nextLine();
        System.out.println("result = "+unique(str));

    }

    public static String unique(String str){
        boolean flag = true;
        String result="";
        for (int i = 0; i <= str.length()-1; i++) {
            flag = true;
            for (int j = 0; j < str.length(); j++) {
                if(i==j)
                    continue;
                if (str.charAt(i) == str.charAt(j)){
                    flag=false;
                    break;}

            }
            if (flag)
                result += str.charAt(i);
        }


        return result;
    }

}
