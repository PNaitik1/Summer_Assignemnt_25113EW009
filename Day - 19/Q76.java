// Write a program to Find diagonal sum. 

package Summer_Assignment_25113EW009;

public class Q76 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = matrix.length;
        int principalSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            principalSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("\nSum of Principal Diagonal: " + principalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
