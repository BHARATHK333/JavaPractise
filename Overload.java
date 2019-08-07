package com.amdocs1;

//Program to check the overloading of methods
public class Overload {
    void test(){
        System.out.println("Method without parameters");
    }

    void test(int a){
       System.out.println("Method with single parameter "+ a);
    }

    void test(int a, int b){
        System.out.println("Method with two parameters "+ a +" "+b);
    }

    double test(double a){
        System.out.println("The parameter is of type double "+ a);
        return a*a;
    }
}
