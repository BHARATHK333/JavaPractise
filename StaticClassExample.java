package com.amdocs;

//this is the example of static class
public class StaticClassExample {
    private static String str = "Java the complete reference";

    //all the nested classes should be static classes
    static class MyNestedClass{
        public void display(){
            System.out.println(str);//this is not feasible if the str is non static variable
        }

        public static void main(String[] args) {
            StaticClassExample.MyNestedClass obj = new StaticClassExample.MyNestedClass();

            obj.display();
        }
    }
}
