package com.amdocs1;

//overloading of constructors
public class Dog {
    String name;
    int age;
    String breed;

    Dog(){
        this.name = "bittu";
        this.age = 30;
        this.breed = "pug";
    }
    Dog(String name,int age, String breed){
        this.age= age;
        this.name = name;
        this.breed = breed;
    }


    public void bark() {
        if(this.age <= 20){
            System.out.println("Bow Bow");
        }
        if(this.age > 20){
            System.out.println("Ruff Ruff");
        }
    }
}
