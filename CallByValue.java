package com.amdocs1;

public class CallByValue {
    public static void main(String[] args) {
        PrimitiveParameters obj = new PrimitiveParameters();

        int a= 15;
        int b = 20;

        System.out.println("Values before the parameters are passed: a = "+ a +" b = "+b);

        obj.method(a, b);

        System.out.println("Values after the parameters are passed: a = "+a+" b = "+b);
    }
}
