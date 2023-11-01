package interfacepackage;

//Define an interface named Shape
interface Shape {
 double area(); // Method to calculate the area of the shape
 double perimeter(); // Method to calculate the perimeter of the shape
}

//Implement the interface in a class
class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }

 @Override
 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}

public class InterfaceExample {
 public static void main(String[] args) {
     // Create a Circle object
     Circle circle = new Circle(5.0);

     // Calculate and print the area and perimeter of the circle
     System.out.println("Circle Area: " + circle.area());
     System.out.println("Circle Perimeter: " + circle.perimeter());
 }
}

