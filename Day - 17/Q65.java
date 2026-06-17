// Write a program to Merge arrays. 

package Summer_Assignment_25113EW009;

public class Q65 {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 4, 5, 6, 7 };

        int[] mergedArray = new int[array1.length + array2.length];

        int position = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[position] = array1[i];
            position++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergedArray[position] = array2[i];
            position++;
        }

        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
