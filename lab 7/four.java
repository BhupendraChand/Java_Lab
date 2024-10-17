
abstract class Shape {
   
    abstract double calculateArea();

    
    abstract double calculatePerimeter();
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    
    double calculateArea() {
        return Math.PI * radius * radius;
    }

 
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    double calculateArea() {
        return length * width;
    }

   
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Example4{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(15, 13);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}


