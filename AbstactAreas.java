package com.amdocs;

abstract class Figure{
    double dimension1;
    double dimension2;

    Figure(double a, double b){
        dimension1 = a;
        dimension2 = b;
    }

    abstract double area();
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    @Override
     double area() {

        System.out.println("Area of triangle: ");
        return (dimension1*dimension2)/2;
    }
}

class Rectangle extends Figure{

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Area of rectangle is: ");
        return dimension1*dimension2;
    }
}
public class AbstactAreas {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4);
        Rectangle rectangle = new Rectangle(10,20);

        Figure figure;

        figure = triangle;
        System.out.println(figure.area());

        figure = rectangle;
        System.out.println(figure.area());
    }
}
