package com.amdocs;
//this is an example of nested interface.Nested interfaces can be public, private or protected

class Parent{
    public interface NestedIF{
        public boolean isNonNegative(int x);
    }
}

//class child implements nested interface in parent class by
//accessing the interface through Parent.NestedIF
class Child implements Parent.NestedIF{

    @Override
    public boolean isNonNegative(int x) {
        return x<0 ? false:true;
    }
}

//Reference variable of nested interface is accessed using Parent.NestedIF
public class NestedInterface {
    public static void main(String[] args) {
        Parent.NestedIF nf = new Child();

        if(nf.isNonNegative(10))
            System.out.println("The number is non negative");
        if(nf.isNonNegative(-10))
            System.out.println("This won't be displayed");
    }
}
