public class Box {
	private int width, height, length;

	public Box() {
		length = 27;
		width = 36;
		height = 15;
	}

	public Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public int volume() {
		return width * height * length;
	}

	public int surfaceArea() {
		return 2 * (width * height + width * length + height * length);
	}
}
