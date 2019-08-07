package com.amdocs;
//this is an example of variable stack. if the stack is full the stack grows to double the original size
public class VariableStackDemo{
    public static void main(String[] args) {
        VariableStack stack1 = new VariableStack(5);

        for(int i=0;i<12;i++) stack1.push(i);

        System.out.println("the contents of the stack are");
        for(int i=0;i<12;i++) System.out.println(stack1.pop());
    }

}