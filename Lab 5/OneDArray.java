public class OneDimensionalArray {
	public static void main(String[] args) {
		int[] num = { 1, 3, 5, 7, 9 };
		int min, max;
		min = max = num[0];
		for (int i = 0; i < 5; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		for (int i = 0; i < 5; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}

		System.out.println("Minimum value of given array is: " + min);
		System.out.println("Maximum value of given array is: " + max);
	}
}