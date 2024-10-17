public class MultiplictionSum {
	public static void main(String[] args) 
	{
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] sum = new int[3][3];
		int[][] mul = new int[3][3];

		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				sum[i][j] = m1[i][j] + m2[i][j];
				mul[i][j] = 0;
				for (int k = 0; k < 3; k++)
					mul[i][j] += m1[i][k] * m2[k][j];
			}
		}
		System.out.println("Sum of m1 and m2:");
		for (int i = 0; i < 3; i++) 
		{
			for (int n : sum[i])
				System.out.print(n+ " ");
			System.out.println();
		}
		System.out.println("Multiplication of m1 and m2:");
		for (int i = 0; i < 3; i++) 
		{
			for (int n : mul[i])
				System.out.print(n + " ");
			System.out.println();
		}
	}
}