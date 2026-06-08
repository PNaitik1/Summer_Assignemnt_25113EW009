// Write a program to Print number triangle.
// 1
// 12
// 123
// 1234
// 12345

package Summer_Assignment_25113EW009;

public class Q30 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
