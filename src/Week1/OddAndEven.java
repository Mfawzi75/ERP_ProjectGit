package Week1;

public class OddAndEven {

    public static void main(String[] args) {


            int number1 = 5;
            int number2 = 6;

            boolean isEven = number1 % 2 ==0;



            boolean isOdd = !isEven;

            System.out.println(number1 + " is an even number: " + isEven);
            System.out.println(number2 + " is an odd number: " + isOdd);

        }
    }

