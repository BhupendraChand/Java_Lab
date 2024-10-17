public class MultiplictionSum {
	public static void main(String[] args) {
		int[][] m1 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] sum = new int[3][3];
		int[][] multiply = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = m1[i][j] + m2[i][j];
				multiply[i][j] = 0;
				for (int k = 0; k < 3; k++)
					multiply[i][j] += m1[i][k] * m2[k][j];
			}
		}
		System.out.println("Sum of m1 and m2:");
		for (int i = 0; i < 3; i++) {
			for (int n : sum[i])
				System.out.print(n + " ");
			System.out.println();
		}
		System.out.println("Multiplication of m1 and m2:");
		for (int i = 0; i < 3; i++) {
			for (int n : multiply[i])
				System.out.print(n + " ");
			System.out.println();
		}
	}
}