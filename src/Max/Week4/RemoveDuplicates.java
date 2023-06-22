package Max.Week4;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter String");
        String word=input.nextLine();
        System.out.println("Removed duplicates- "+method(word));

    }

    public static String method(String word){
        String result="";
        for (int i = 0; i < word.length()-1; i++) {
            if(!result.contains(""+word.charAt(i)))
                result+=word.charAt(i);}
            return result;


    }
}
