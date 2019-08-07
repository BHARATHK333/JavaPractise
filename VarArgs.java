package com.amdocs;

public class VarArgs {
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }

    private static void vaTest(int ... i) {
        System.out.print("Number of arguments: "+i.length+" Contents: ");

        for(int x: i){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
