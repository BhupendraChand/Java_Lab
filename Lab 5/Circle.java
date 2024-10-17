public class Circle {

	private float radius;
	private float PI = 3.1415f;

	public Circle() {
		radius = 7.0f;
	}

	public Circle(float r) {
		radius = r;
	}

	public float findArea() {
		return PI * radius * radius;
	}

	public float findCircumference() {
		return 2 * PI * radius;
	}

}