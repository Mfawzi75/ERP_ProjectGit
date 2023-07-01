package Diloro.week4;

public class FrequencyOfChar {
    public static String FrequencyOfChar(String str){

        String frequency = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    count++;
                }
            }
            if(frequency.contains(""+ch)){
                continue;
            }
            frequency += ch + "" + count;
        }

        return frequency;
    }


    public static void main(String[] args) {
        String str = "AABCDDEFFGGGG";
        System.out.println(FrequencyOfChar(str));
    }
}
/*
1. Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */