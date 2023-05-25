package Week2Max;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.exit;

public class Divide_without_operator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1=input.nextDouble();
        System.out.println("Enter second number:");
        double num2=input.nextDouble();
        if (num2==0) {
            System.err.println("result= undefined");
            exit(1);}

        System.out.println("result= "+Division(num1,num2));
        input.close();
    }

    public static double Division(double num1, double num2) {
        DecimalFormat df = new DecimalFormat("0.00");
        double  i;
        for ( i = 0; i < num1; i = i + 0.00001) {
            if ((i * num2 >num1-0.009)&&(i * num2 <num1+0.009))
                break;
        }
        return Double.parseDouble(df.format(i));
    }
}
