package com.amdocs;
//this is an example of nested try catch statements
public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b= 2/a;

            try {
                if(a==1) a = a/(a-a);
                if(a==2){
                    int c[] = {1};
                    c[3] = 3;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array is accessing index that is out of bounds");
            }
        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
        }

    }
}
