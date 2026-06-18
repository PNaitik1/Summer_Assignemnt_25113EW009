// Write a program to Subtract matrices. 

package Summer_Assignment_25113EW009;

public class Q74 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                { 4, 5, 6 },
                { 3, 4, 1 }
        };

        int[][] matrix2 = {
                { 2, 3, 1 },
                { 3, 1, 0 }
        };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Result of matrix subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
