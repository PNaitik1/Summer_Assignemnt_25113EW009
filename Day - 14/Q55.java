// Write a program to Second largest element. 

package Summer_Assignment_25113EW009;

public class Q55 {

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second largest element.");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 35, 1, 10, 34, 1 };

        int result = findSecondLargest(numbers);

        if (result != -1) {
            System.out.println("The second largest element is: " + result);
        }
    }
}
