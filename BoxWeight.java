package com.amdocs;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double width, double length, double height, double weight){
        super(width, length, height);
        this.weight= weight;
    }

    BoxWeight(BoxWeight o){
        super(o);
        weight = o.weight;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(int len){
        super(len);
        weight = len;
    }
}
