package Module1;

import java.awt.*;

// Write a Java program to create a class called Shape with a method called FindArea().
// Find Perimeter(). Create a subclass called Rectangle that overrides the FindArea().
// Find Perimeter() method to calculate the area and perimeter of the rectangle
// Base class
class Shape {

    public void FindArea() {


    }

    public void FindPerimeter() {

    }


}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void FindArea() {
        double area = length * width;
        System.out.println("Area of rectangle =" + area);
    }

    @Override
    public void FindPerimeter() {
        double peri = 2 * (length + width);
        System.out.println("Perimeter of rectangle =" + peri);

    }
}





