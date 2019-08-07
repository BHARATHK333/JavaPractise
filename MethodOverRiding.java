package com.amdocs;



class A{
    int i,j;
    A(int a, int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j :" +i +" "+j);
    }
    void Hello(){
        System.out.println("Hello");
    }
        }

        class B extends A{
     int k;

     B(int a, int b, int c){
         super(a,b);
         k = c;
     }
        @Override
        void show(){
         //super.show();
         System.out.println("k: "+k);
        }
        }
public class MethodOverRiding {
    public static void main(String[] args) {
        A a = new A(2,3);
        B b = new B(10,20,30);
        A c;

        a.show();
        b.show();
        c = b;
        c.show();
        a.Hello();
        c.Hello();
        b.Hello();
    }
}
