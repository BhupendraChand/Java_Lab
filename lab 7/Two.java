class Shape {
    void area() {
        System.out.println("Calculating area");
    }
}

class Triangle extends Shape {
    double b;
    double h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    void area() {
        double triangleArea = ((0.5) * b * h);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

class Rectangle extends Shape {
    double b;
    double l;

    Rectangle(double b, double l) {
        this.b = b;
        this.l = l;
    }
    void area() {
        double rectangleArea = l*b;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

public class Two {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(5, 8);
        Shape shape2 = new Rectangle(6, 9);
        shape1.area();
        shape2.area();
    }
}
