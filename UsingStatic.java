package com.amdocs;

//this class contains static variables, methods, and static blocks
public class UsingStatic {
    static int a = 10;
    static int b;

    static void method(int x){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }

    //this static block is run as soon as the class is loaded




    static {
        System.out.println("static block is initialized as soon as the class is created");
        b = a*10;
    }

}
