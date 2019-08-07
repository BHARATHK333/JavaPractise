package com.amdocs1;

//When objects are passed as parameters there are passed as references
public class ObjectParameters {
    int a,b;

    ObjectParameters(int i, int j){
        a = i;
        b = j;
    }

    void method(ObjectParameters o){
        o.a *=2;
        o.b /=2;
        System.out.println("The values inside the method: a="+o.a+" b="+o.b);
    }


}
