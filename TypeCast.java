package com.amdocs1;

public class TypeCast {
    public static void main(String[] args) {
        int i;
        byte y;
        i = 3000;
        for(i = 3000; i > 0; i-- ){

            y = (byte)i;
            System.out.print(i + " mod 128 = " + i%256 + " also ");
            System.out.println(i + " cast to byte " + " = " + y);

        }

    }
}
