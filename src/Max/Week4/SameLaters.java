package Max.Week4;

import java.util.Scanner;

public class SameLaters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first String");
        String word1=input.nextLine();
        System.out.println("Please enter Second String");
        String word2=input.nextLine();

        System.out.println("Result- "+method(word1,word2));

    }

    public static boolean method(String word1, String word2){
        boolean result=true;
        for (int i = 0; i < word1.length(); i++) {
            if(!word2.contains(""+word1.charAt(i))){
                 result=false;
        break;}}
        return result;


    }
}


