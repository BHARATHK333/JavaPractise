package com.amdocs;

public class SubClass extends SuperClass {
    int k;

    void showk(){
        System.out.println("k: "+k);

    }

    void sum(){
        System.out.println("(i+j+k): " + (i+j+k));
    }
}
