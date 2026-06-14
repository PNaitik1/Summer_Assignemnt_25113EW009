// Write a program to Find duplicates in array. 

package Summer_Assignment_25113EW009;

public class Q56 {

    public class FindDuplicates {

        public static void printDuplicates(int[] arr) {
            boolean foundDuplicate = false;
            System.out.print("Duplicate elements found: ");

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        foundDuplicate = true;
                        break;
                    }
                }
            }

            if (!foundDuplicate) {
                System.out.print("None");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] numbers = { 2, 4, 6, 8, 4, 3, 2, 9 };

            printDuplicates(numbers);
        }
    }

}
