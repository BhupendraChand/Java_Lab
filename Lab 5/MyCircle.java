public class MyCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		double a1 = c1.findArea();
		double f1 = c1.findCircumference();
		System.out.println("Area of first Circle = " + a1);
		System.out.println("Circumference of first Circle = " + f1);

		Circle c2 = new Circle(5.0f);
		double a2 = c2.findArea();
		double f2 = c2.findCircumference();
		System.out.println("Area of second Circle = " + a2);
		System.out.println("Circumference of second Circle = " + f2);
	}
}