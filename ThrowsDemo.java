package com.amdocs;
//this is an example of throws demo which is mentioned at the method
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("inside throwOne");
        throw new IllegalAccessException("demo");
    }
    public static void main(String[] args)  {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e +" is caught");
        }

    }
}

