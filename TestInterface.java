package com.amdocs;
//this is an example to implement interfaces

interface CallBack{
    public void callBack(int parameter);
}

class Client implements CallBack{


    @Override
    public void callBack(int parameter) {
        System.out.println("Implememting interface method " +parameter);
    }
}

class AnotherClient implements CallBack{

    @Override
    public void callBack(int parameter) {
        System.out.println("Another implementation of interface method with different structure");
        System.out.println("this is parameter squared: "+ (parameter*parameter));
    }
}
public class TestInterface {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ac = new AnotherClient();

        c.callBack(42);
        c = ac;
        c.callBack(12);
    }
}
