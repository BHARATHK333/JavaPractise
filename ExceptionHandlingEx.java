package com.amdocs;

//this is an example of try catch exception
public class ExceptionHandlingEx {
    public static void main(String[] args) {
        int a,b;

        try {
            a=args.length;
            b=4;
            int[] c = {1};
            c[3] = 30;
            int result = b/a;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("it is not possible to divide by zero");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array index is out of bounds");
        }

    }
}
