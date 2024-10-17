public class MyTime {
	public static void main(String[] args) {
		Time t1 = new Time(6, 2, 7);
		Time t2 = new Time(4, 3, 18);
		Time t3 = t1.add(t2);
		Time t4 = t1.subtract(t2);
		System.out.print("Time one : ");
		t1.display();
		System.out.print("Time two : ");
		t2.display();
		System.out.print("Addition : ");
		t3.display();
		System.out.print("Subtraction : ");
		t4.display();
	}

}