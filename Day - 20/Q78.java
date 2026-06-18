// Write a program to Check symmetric matrix. 

package Summer_Assignment_25113EW009;

public class Q78 {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 3, 5, 6 }
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
            System.out.println("The matrix is NOT symmetric (It is not a square matrix).");
            return;
        }

        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The given matrix is a Symmetric Matrix.");
        } else {
            System.out.println("The given matrix is NOT a Symmetric Matrix.");
        }
    }
}
