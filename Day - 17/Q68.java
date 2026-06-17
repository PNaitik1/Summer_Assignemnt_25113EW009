// Write a program to Find common elements. 

package Summer_Assignment_25113EW009;

public class Q68 {

    public static void main(String[] args) {
        int[] array1 = { 1, 2, 5, 6, 9 };
        int[] array2 = { 2, 4, 6, 8, 9 };

        System.out.print("Common elements: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }
        }
    }
}
