package Week2;
import java.util.Scanner;
public class OddOREven {



        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num=input.nextInt();
            if (OddOrEven(num)){
                System.out.println("Even number");}
            else {System.out.println("Odd number");}
            input.close();
        }


        public static boolean OddOrEven(int num) {
            return num%2==0;
        }
    }

