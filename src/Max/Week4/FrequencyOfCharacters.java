package Max.Week4;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter String");
        String word=input.nextLine();
        System.out.println("Frequency Of Characters "+method(word));

    }

    public static String method(String word){
        char later=' ';
        String result = "";
        int count=1;
        for (int i = 0; i <= word.length()-1; i++) {
            count=1;

            for (int j = i+1; j <  word.length(); j++) {
                if (word.charAt(i) == word.charAt(j))
                    count++;}
                if(result.contains(""+word.charAt(i)))
                    continue;
                result += ""+word.charAt(i) + count;
            }

        return result;


    }
}

