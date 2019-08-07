package com.amdocs;

abstract class Aa{
    abstract void callMe();

    void callMeToo(){
        System.out.println("This is concrete method");
    }
}

class Bb extends Aa{
    @Override
    void callMe() {
        System.out.println("B's callMe method is implemented");
    }


}
public class AbstactDemo {
    public static void main(String[] args) {
    Bb b = new Bb();
    b.callMe();
    b.callMeToo();
    }
}
