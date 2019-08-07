package com.amdocs1;

//passing object as parameters
public class PassOb {
    public static void main(String[] args) {
        TestOb a = new TestOb(100,200);
        TestOb b= new TestOb(100,200);
        TestOb c = new TestOb(1,2);

        TestOb clone = new TestOb(a);//clone object is created with same values as 'a'
                                     // since 'a' object is passed as parameter for constructor

        System.out.println(a.isEqual(b));
        System.out.println(b.isEqual(c));
        System.out.println(b.isEqual(clone));
    }
}
