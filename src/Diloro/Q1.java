package Diloro;

public class Q1 {
    public static void main(String[] args) {
        int first = 3,
                second = 1;

        first = second + first;
        second = first - second;
        first = first - second;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

    }
}
