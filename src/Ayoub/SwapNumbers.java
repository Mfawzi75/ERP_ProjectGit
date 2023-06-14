package src.Ayoub;

public class SwapNumbers {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 9;
        System.out.println("Before swapping: >>>>>> " + " + \nnum1 = " + num1 + "\nnum2 = " + num2);

        num1 = num2 + num1;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: >>>>>>  " );
        System.out.println("first = " + num1);
        System.out.println("second = " + num2);

    }
}
