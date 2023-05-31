package Week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int first = 3;
        int second = 1;

        first = second + first;
        second = first - second;
        first = first - second;

        System.out.println("first = " + first);
        System.out.println("second = " + second);

    }
}