package com.amdocs1;

//Testing if object can be passed as parameter
public class TestOb {
    int a, b;

    TestOb(int i, int j){
        a =i;
        b=j;
    }

    //Passing object as parameter for the constructor to create a new object that is same as previous object
    TestOb(TestOb o){
        a = o.a;
        b = o.b;
    }

    boolean isEqual(TestOb o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }

}
