package Max.Week6;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter six numbers");
        byte [] arr=new byte[6];
        for (int i = 0; i < 6; i++) {
            System.err.println("Enter "+ (i+1)+" number");
            arr[i]= input.nextByte();
        }

        System.out.println("Biggest num =  "+maxNum(arr));

    }

    public static byte maxNum(byte arr[]){
        byte max=arr[0];
        for (byte i = 1; i < arr.length; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}