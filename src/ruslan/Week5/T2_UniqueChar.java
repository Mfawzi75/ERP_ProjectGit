package src.ruslan.Week5;

public class T2_UniqueChar {
    public static void main(String[] args) {

        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }

    public static String uniqueChar(String str) {

        String unique = "DEF";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.contains(unique)) {
                result = unique;
            }
        }
        return result;
    }
}
/*
1. Find the unique:
  Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

