package com.amdocs1;



public class OverloadDemo {
    public static void main(String[] args) {
        Overload obj = new Overload();
        double result;
        int i=10;

        obj.test();
        obj.test(1);
        obj.test(1,2);
        result = obj.test(1.23);
        System.out.println(result);
        obj.test(i);
    }

}
