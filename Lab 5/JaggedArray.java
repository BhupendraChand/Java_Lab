public class JaggedArray {
	public static void main(String[] args) {
		int[][] m1 = new int[][] { { 3, 4, 5, 6 }, { 7, 8 }, { 9, 10, 11 } };

		System.out.println("Resultant Matrix:");

		for (int i = 0; i < m1.length; i++) {
			int sum = 0;
			for (int n : m1[i]) {
				System.out.print(n + " ");
				sum += n;
			}
			System.out.println("Sum = " + sum);
		}
	}
}