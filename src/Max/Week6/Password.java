package Max.Week6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = input.nextLine();
        System.out.println("Password is "+ ((passwordCheck(password))?"valid":"not valid"));
    }

    public static boolean passwordCheck(String password){
        boolean  Digit =false ;
        boolean   Upper=false ;
        boolean   Lower  =false ;
        boolean   special =false ;
        boolean   contain =false ;
        if(!password.contains(" ")&&password.length()>5)
            contain=true;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i)))
                Digit=true;
            if(Character.isLowerCase(password.charAt(i)))
                Lower=true;
            if(Character.isUpperCase(password.charAt(i)))
                Upper=true;
            if(Pattern.matches("\\p{Punct}", Character.toString(password.charAt(i))))
                special=true;
        }
        if(Digit&&Upper&&Lower&&special&&contain)
        return  true;
        else return false;
    }
}
