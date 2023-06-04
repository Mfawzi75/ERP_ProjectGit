package src.ruslan.Week3;

public class ReverseNegative {

    public static void main(String[] args) {

        reverseNegative(-215);

    }

    public static void reverseNegative(int num) {

        int reversed = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed number = " + reversed);
    }
}
/*
2. Reverse negative number
  Write a return method that can reverse negative number and return it as int.
  For example, N = -215:
  OutPut: -512
 */
