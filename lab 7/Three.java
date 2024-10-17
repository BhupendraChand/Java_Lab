interface Add {
    double addition(double a, double b);
}

interface Sub {
    double subtract(double a, double b);
}

interface Mul {
    double multiply(double a, double b);
}

interface Div {
    double divide(double a, double b);
}

class Calculator implements Add, Sub, Mul, Div {
 
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {

            return  a / b;
    }
}

public class Three {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 3;
        double num2 = 2;

        System.out.println("Addition: " + calculator.addition(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
    }
}
