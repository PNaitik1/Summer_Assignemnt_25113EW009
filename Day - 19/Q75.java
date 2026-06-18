// Write a program to Transpose matrix. 

package Summer_Assignment_25113EW009;

public class Q75 {

    public static void main(String[] args) {
        int[][] original = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int originalRows = original.length;
        int originalColumns = original[0].length;

        int[][] transpose = new int[originalColumns][originalRows];

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalColumns; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(original);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
