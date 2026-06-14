// Write a program to Frequency of an element. 

package Summer_Assignment_25113EW009;

public class Q54 {

    public static int getFrequency(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = { 4, 2, 4, 5, 2, 3, 2, 4, 4 };
        int targetValue = 4;

        int frequency = getFrequency(numbers, targetValue);

        System.out.println("The element " + targetValue + " appears " + frequency + " times.");
    }
}
