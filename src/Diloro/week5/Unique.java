package Diloro.week5;

public class Unique {
    public static void main(String[] args) {

        String str = "ABCDEEEFGHH";
        System.out.println(Unique(str));
    }


    public static String Unique(String uniqueChars){

        String unique = "";

        for (int i = 0; i < uniqueChars.length(); i++) {
            char each = uniqueChars.charAt(i);

            if(uniqueChars.indexOf(each) == uniqueChars.lastIndexOf(each)  ){
                unique += each;
            }
        }
        return unique;
    }
}