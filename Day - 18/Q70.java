// Write a program to Selection sort. 

package Summer_Assignment_25113EW009;

public class Q70 {

    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        int n = array.length;

        System.out.println("Array before sorting:");
        printArray(array);

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("\nArray after sorting:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
