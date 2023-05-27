package src.ruslan;

public class SwapNumbers {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 35;
        System.out.println("Before swapping:" + "\nnum1 = " + num1 + "\nnum2 = " + num2);

        num1 = num1 + num2;// 25 + 35 = 60
        num2 = num1 - num2;// 60 - 35 = 25
        num1 = num1 - num2;// 60 - 25 = 35

        System.out.println("After swapping:" + "\nnum1 = " + num1 + "\nnum2 = " + num2);
    }
}
