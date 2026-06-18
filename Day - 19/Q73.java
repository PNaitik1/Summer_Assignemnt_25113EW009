// Write a program to Add matrices. 

package Summer_Assignment_25113EW009;

public class Q73 {

    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1, 3, 4 },
                { 2, 4, 3 }
        };

        int[][] matrix2 = {
                { 1, 3, 4 },
                { 3, 5, 1 }
        };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
