package com.amdocs;

public class Outer {
    int outer = 100;
    int outer1 = 200;
    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner1{
                void display1(){
                    System.out.println("Outer1 is declared as "+outer1);
                }
            }
            Inner1 inner1 = new Inner1();
            inner1.display1();
        }
       Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display(){
            System.out.println("Outer is declared as "+outer);
        }
    }
}
