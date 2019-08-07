package com.amdocs;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(1,2,3,4);
        BoxWeight mybox1 = new BoxWeight(20);
        Box mybox2 = new Box();
        mybox2 = mybox;

        System.out.println("Volume: "+mybox.volume() + " weight: "+ mybox.weight);
        System.out.println("Volume: "+mybox1.volume() + " weight: "+ mybox1.weight);
        System.out.println("Volume: "+mybox2.volume());
    }
}
