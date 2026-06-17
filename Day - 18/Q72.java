// Write a program to Sort array in descending order.

package Summer_Assignment_25113EW009;

public class Q72 {

    public static void main(String[] args) {
        int[] array = { 15, 5, 23, 8, 42, 16 };

        System.out.println("Original Array:");
        printArray(array);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArray sorted in Descending Order:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
