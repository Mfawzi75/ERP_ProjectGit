package Week1;

public class OddAndEven {
    public static void main(String[] args) {

        int number = 5;
        int number2 = 6;

        boolean isEven = number % 2 ==0;

        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number2 + " is an odd number: " + isOdd);




    }
}

