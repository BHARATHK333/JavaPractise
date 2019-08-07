package com.amdocs;

public class SimpleInheritanceDemo {
    public static void main(String[] args) {
        SuperClass superOb = new SuperClass();
        SubClass subOb = new SubClass();

        superOb.i=10;
        superOb.j=20;
        superOb.showij();

        subOb.i=30;
        subOb.j=40;
        subOb.k=50;
        subOb.showij();
        subOb.showk();
        subOb.sum();
    }
}
