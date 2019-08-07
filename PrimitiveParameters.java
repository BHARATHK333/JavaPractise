package com.amdocs1;

//Primitive parameters are passed to the method as Call By Value
public class PrimitiveParameters {
    void method(int i, int j){
        i *= 2;
        j /= 2;
        System.out.println("Values in the method are " +i);
        System.out.println("Values in the method are "+j);
    }
}
