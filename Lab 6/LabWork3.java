public class LabWork3 {
    public static void main(String[] args) {
        int[][] num = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 } };

        System.out.println("Jagged Array is :");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < num.length; i++) {
            int sum = 0;
            for (int j = 0; j < num[i].length; j++) {
                sum += num[i][j];
                System.out.printf("%3d", num[i][j]);
            }
            System.out.println(" ");
            System.out.println("sum=" + sum);
        }
    }

}