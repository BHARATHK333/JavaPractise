package com.amdocs;
//this is an example of interfacing push and pop methods of stack functionality.
//this is an example of fixed length stack

interface IStack{
    void push(int item);
    int pop();
}

class FixedStack implements IStack{
    private int stack[];
    private int tos;

    FixedStack(int size){
        stack = new int[size];
        int tos = -1;
    }

    @Override
    public void push(int item) {
        if(tos == stack.length -1){
            System.out.println("The stack is full");
        }else{
            stack[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if(tos < 0){
            System.out.println("Underflow");
            return 0;
        }else{
            return stack[tos--];
        }
    }
}

public class StackInterfaceDemo {
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);

        for (int i=0;i<5;i++) stack1.push(i);

        System.out.println("contents of stack1 are");
        for(int i=0;i<5;i++) System.out.println(stack1.pop());
    }
}
