package com.amdocs1;

//Example of recursive methods
public class Factorial {
    int fact(int num){
        int result;

        if(num == 1) return 1;
        result = fact(num -1)*num;
        System.out.println(result);
        return result;
    }
}
