public class MyBox {
	public static void main(String[] args) {
		Box b1 = new Box();
		int v1 = b1.volume();
		int a1 = b1.surfaceArea();
		System.out.println("Volume of first Box " + v1);
		System.out.println("Surface Area of first Box " + a1);

		Box b2 = new Box(10, 20, 30);
		int v2 = b2.volume();
		int a2 = b2.surfaceArea();
		System.out.println("Volume of second Box " + v2);
		System.out.println("Surface Area of second Box " + a2);
	}
}