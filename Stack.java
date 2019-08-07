package com.amdocs1;

public class Stack {
    int[] stack = new int[10];
    int tos;

    //initializing top of stack
    Stack(){
        tos =-1;
    }

    void push(int num){
        if(tos == 9){
            System.out.println("Stack is full");
        }else {
            stack[++tos]= num;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack is underflow");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}
