package hanan.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 9;
        //   9  +  4   =13
         n1 = n2 + n1; // 13
        //    13 -  9
         n2 = n1 - n2; // 4
        //13 -  4
         n1 -= n2; // 9

        System.out.println(" n1 : " + n1);
        System.out.println(" n2 : " + n2);

    }



}
