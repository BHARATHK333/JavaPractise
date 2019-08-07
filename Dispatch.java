package com.amdocs;

class Alpha{
    void callMe(){
        System.out.println("inside A's call me method");
    }
}

class Beta extends Alpha{
    void callMe(){
        System.out.println("inside B's call me method");
    }
}

class Gaama extends Beta{
    void callMe(){
        System.out.println("inside C's call me method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        Beta b = new Beta();
        Gaama c = new Gaama();

        Alpha r;

        r=a;
        r.callMe();

        r=b;
        r.callMe();

        r=c;
        r.callMe();
    }
}
