package com.amdocs1;

//methods can return objects too
public class ReturningObjects {
    int a,b;

    ReturningObjects(int i, int j){
        a = i;
        b=j;
    }

    ReturningObjects method(){
        ReturningObjects ob = new ReturningObjects(a+10,b+20);
        return ob;
    }
}
