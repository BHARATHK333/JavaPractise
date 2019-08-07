package com.amdocs1;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();

        mybox.length = 10;
        mybox.height = 20;
        mybox.width = 30;

        int volume = mybox.height*mybox.width*mybox.length;
        System.out.println(volume);

    }
}
