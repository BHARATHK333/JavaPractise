package com.amdocs1;

public class CallByReference {
    public static void main(String[] args) {
        ObjectParameters obj = new ObjectParameters(15, 20);

        System.out.println("Values before the object is passed as parameter: a = "+obj.a+" b = "+obj.b);
        obj.method(obj);
        System.out.println("Values after the object is passed as parameter: a ="+obj.a +" b = "+obj.b);
    }
}
