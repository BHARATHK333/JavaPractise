package com.amdocs1;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        Stack myStack1 = new Stack();


        for(int i=0; i<10;i++){
            myStack.push(i);
        }
        for(int i=10;i<20;i++){
            myStack1.push(i);
        }

        System.out.println("Printing the stacks");
        for(int i=0;i<10;i++){
            System.out.println(myStack.pop());
        }
        for(int i=10;i<20;i++){
            System.out.println(myStack1.pop());
        }
    }
}
