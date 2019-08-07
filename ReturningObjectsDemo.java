package com.amdocs1;

public class ReturningObjectsDemo {
    public static void main(String[] args) {
        ReturningObjects ob1 = new ReturningObjects(1,2);
        ReturningObjects ob2;

        ob2 = ob1.method();
        System.out.println("The values of after passed to the method: a ="+ob2.a+" b= "+ob2.b);
    }
}
