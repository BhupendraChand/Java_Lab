public class MyDistance {
	public static void main(String[] args) {
		Distance d1 = new Distance(4, 8);
		Distance d2 = new Distance(2, 7);
		Distance d3 = d1.add(d2);
		Distance d4 = d1.subtract(d2);
		System.out.print("Distance one : ");
		d1.display();
		System.out.print("Distance two : ");
		d2.display();
		System.out.print("Addition : ");
		d3.display();
		System.out.print("Subtraction : ");
		d4.display();
	}

}