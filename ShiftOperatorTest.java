package com.amdocs1;

public class ShiftOperatorTest {
    public static void main(String[] args) {
        byte i;
        byte num = 8;
        byte b= (byte) 0xf1;
        System.out.println(b);
        binary(b);
        System.out.println(num);
        binary(num);
        for(i=0;i<4;i++){
            num = (byte) (num << 1);
            System.out.println(num);
        }
    }

    private static void binary(int num) {
        int c, k;

        for (c = 7; c >= 0; c--)
        {
            k = num >> c;

            if (k == 1)
                System.out.print("1");
            else
                System.out.print("0");
        }
        System.out.print("\n");

    }
}
