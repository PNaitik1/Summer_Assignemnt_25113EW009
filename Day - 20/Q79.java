// Write a program to Find row-wise sum. 

package Summer_Assignment_25113EW009;

public class Q79 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 0, 1, 2 }
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Row-wise sums:");

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + rowSum);
        }
    }
}
