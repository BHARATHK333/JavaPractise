package com.amdocs;

//varargs methods are overloaded in this code
public class VarArgsOverloading {

    static void vaTest(int... i) {
        System.out.print("vaTest(int ... i): contains: " + i.length + " consists of: ");

        for (int x : i) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void  vaTest(boolean... i) {
        System.out.print("vaTest(boolean ... i): contains: " + i.length + " consists of: ");

        for (boolean x : i) {
            System.out.print(x + " ");


        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true, true, false);

    }


}
